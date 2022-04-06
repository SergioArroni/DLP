package ast.type.complexTypes;

import ast.AstNode;
import ast.type.Type;
import ast.type.TypeAbs;
import ast.type.sympleTypes.CharType;
import ast.type.sympleTypes.DoubleType;
import ast.type.sympleTypes.IntType;
import visitor.Visitor;

import java.util.List;
import java.util.stream.Collectors;

public class Struct extends TypeAbs {

    private List<RecordField> fields;

    public Struct(int colum, int line, List<RecordField> fields) {
        super(colum, line);
        int cont = 0;
        for (RecordField ele : fields) {
            cont += ele.getNumberOfBytes();
        }
        super.setNumberOfBytes(cont);
        this.fields = fields;
    }

    public Type checkRecordFields() {
        for (int i = 0; i < fields.size(); i++)
            for (int j = i + 1; j < fields.size(); j++)
                if (fields.get(i).getNameField().equals(fields.get(j).getNameField()))
                    new ErrorType(fields.get(j).getLine(), fields.get(j).getColumn(), "A record field with name " + fields.get(j).getNameField() + " already exists.");
        return this;
    }

    public void CheckErrors() {
        List<String> duplicateList =
                fields
                        .stream()
                        .collect(Collectors.groupingBy(s -> s.getNameField()))
                        .entrySet()
                        .stream()
                        .filter(e -> e.getValue().size() > 1)
                        .map(e -> e.getKey())
                        .collect(Collectors.toList());

        for (String re : duplicateList) {
            new ErrorType(this.getColumn(), this.getLine(), "The variable named " + re + " is already being used");
        }
    }

    public List<RecordField> getFields() {
        return fields;
    }

    @Override
    public String toString() {
        return "Struct{" +
                "fields=" + fields +
                '}';
    }

    @Override
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }

    @Override
    public Type dot(AstNode node, String field) {
        for (RecordField r : this.getFields()) {
            if (r.getNameField().equals(field)) {
                return r.getTypeField();
            }
        }
        return super.dot(node, field);
    }

    @Override
    public Type promotesTo(Type other, AstNode node) {
        if (other instanceof ErrorType || other instanceof  Struct)
            return other;
        else
            return super.promotesTo(other, node);
    }

}

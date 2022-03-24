package ast.type.complexTypes;

import ast.AstNode;
import ast.type.Type;
import ast.type.TypeAbs;
import visitor.Visitor;

public class RecordField extends TypeAbs {

    private String nameField;
    private Type typeFields;

    public RecordField(int colum, int line, String nameField, Type typeField) {
        super(colum, line);
        this.nameField = nameField;
        this.typeFields = typeFields;
    }

    public String getNameField() {
        return nameField;
    }

    public Type getTypeField() {
        return typeFields;
    }

    @Override
    public String toString() {
        return "RecordField{" +
                "nameField='" + nameField + '\'' +
                ", typeFields=" + typeFields +
                '}';
    }

    @Override
    public Object Accept(Visitor v, Object p) {
        return v.visit(this, p);
    }


}

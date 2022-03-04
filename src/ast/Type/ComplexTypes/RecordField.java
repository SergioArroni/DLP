package ast.Type.ComplexTypes;

import ast.Type.Type;
import ast.Type.TypeAbs;

import java.util.ArrayList;

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
}

package com.Pmm.AST.Type.ComplexTypes;

import com.Pmm.AST.Type.Type;
import com.Pmm.AST.Type.TypeAbs;

import java.util.ArrayList;

public class RecordField extends TypeAbs {

    private String nameField;
    private ArrayList<Type> typeFields;

    public RecordField(int colum, int line, String nameField, ArrayList<Type> typeFields) {
        super(colum, line);
        this.nameField = nameField;
        this.typeFields = typeFields;
    }

    public String getNameField() {
        return nameField;
    }

    public ArrayList<Type> getTypeFields() {
        return typeFields;
    }
}

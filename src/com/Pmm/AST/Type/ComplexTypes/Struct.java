package com.Pmm.AST.Type.ComplexTypes;

import com.Pmm.AST.Type.ComplexTypes.RecordField;
import com.Pmm.AST.Type.TypeAbs;

import java.util.ArrayList;

public class Struct extends TypeAbs {

    private int size;
    private ArrayList<RecordField> fields;

    public Struct(int colum, int line, int size, ArrayList<RecordField> fields) {
        super(colum, line);

        if (fields.size() == 0) {
            throw new IllegalArgumentException();
        }

        this.size = size;
        this.fields = fields;
    }


}

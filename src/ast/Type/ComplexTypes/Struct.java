package ast.Type.ComplexTypes;

import ast.Type.TypeAbs;

import java.util.ArrayList;
import java.util.List;

public class Struct extends TypeAbs {

    private List<RecordField> fields;

    public Struct(int colum, int line, List<RecordField> fields) {
        super(colum, line);

        this.fields = fields;
    }

    @Override
    public String toString() {
        return "Struct{" +
                "fields=" + fields +
                '}';
    }
}

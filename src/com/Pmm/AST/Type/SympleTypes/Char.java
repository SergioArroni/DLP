package com.Pmm.AST.Type.SympleTypes;

import com.Pmm.AST.Type.TypeAbs;

public class Char extends TypeAbs {

    private Character character;

    public Char(int colum, int line, Character character) {
        super(colum, line);
        this.character = character;
    }

    public Character getCharacter() {
        return character;
    }
}

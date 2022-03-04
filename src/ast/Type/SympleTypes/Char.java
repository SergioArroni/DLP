package ast.Type.SympleTypes;

import ast.Type.TypeAbs;

public class Char extends TypeAbs {

    private Character character;

    public Char(int colum, int line, Character character) {
        super(colum, line);
        this.character = character;
    }

    public Character getCharacter() {
        return character;
    }

    @Override
    public String toString() {
        return "Char{" +
                "character=" + character +
                '}';
    }
}

package symboltable;

import java.util.*;

import ast.definition.Definition;

public class SymbolTable {

    private int scope;
    private List<Map<String, Definition>> table;

    public SymbolTable() {
        table = new ArrayList<>();
        scope = 0;
        table.add(new HashMap<String, Definition>());
    }

    public void set() {
        table.add(new HashMap<String, Definition>());
        scope++;
    }

    public void reset() {
        table.remove(scope);
        scope--;
    }

    public boolean insert(Definition definition) {
        if (findInCurrentScope(definition.getName()) != null) {
            return false;
        }
        table.get(scope).put(definition.getName(), definition);
        definition.setScore(scope);

        return true;
    }

    public Definition find(String id) {
        for (int i = scope; i >= 0; i--) {
            if (table.get(i).containsKey(id)) {
                return table.get(i).get(id);
            }
        }
        return null;
    }

    public Definition findInCurrentScope(String id) {
        Map<String, Definition> aux = table.get(scope);

        Definition vD = aux.get(id);

        if (vD != null) {
            return vD;
        }
        return null;
    }
}

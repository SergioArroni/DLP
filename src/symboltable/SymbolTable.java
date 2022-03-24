package symboltable;

import java.util.*;

import ast.definition.Definition;

public class SymbolTable {

    private int scope;
    private List<Map<String, Definition>> table;

    public SymbolTable() {
        table = new ArrayList<>();
        scope = 0;
        set();
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
        if (table.get(scope).containsKey(definition)) {
            return false;
        }
        table.get(scope).put(definition.getName(), definition);
        if (table.get(scope).containsKey(definition)) {
            return true;
        }
        return false;
    }

    public Definition find(String id) {

        for (int i = scope; i >= 0; i--) {
            Map<String, Definition> aux = table.get(i);

            Definition vD = aux.get(id);
            if (vD != null) {
                return vD;
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

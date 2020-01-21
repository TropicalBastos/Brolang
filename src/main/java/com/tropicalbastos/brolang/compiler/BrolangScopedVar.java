package com.tropicalbastos.brolang.compiler;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class BrolangScopedVar {
    public int type;
    public String varName;

    public static BrolangScopedVar getByVarNameCurrentScope(List<BrolangScopedVar> list, String name) {
        for (BrolangScopedVar var : list) {
            if (var.varName.equals(name)) {
                return var;
            }
        }

        return null;
    }

    public static BrolangScopedVar getByVarName(HashMap<Integer, List<BrolangScopedVar>> map, String key, int currentScope) {
        if (currentScope < 0) {
            return null;
        }

        List<BrolangScopedVar> l = map.getOrDefault(currentScope, new ArrayList<>());
        BrolangScopedVar scopedVar = getByVarNameCurrentScope(l, key);

        if (scopedVar != null) {
            return scopedVar;
        } else {
            return getByVarName(map, key, --currentScope);
        }
    }
}
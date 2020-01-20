package com.tropicalbastos.brolang.compiler;

import java.util.List;

public class BrolangScopedVar {
    public int type;
    public String varName;

    public static BrolangScopedVar getByVarName(List<BrolangScopedVar> list, String name) {
        for (BrolangScopedVar var : list) {
            if (var.varName.equals(name)) {
                return var;
            }
        }

        return null;
    }
}
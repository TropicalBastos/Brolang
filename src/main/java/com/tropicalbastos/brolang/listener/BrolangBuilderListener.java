package com.tropicalbastos.brolang.listener;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;
import com.tropicalbastos.brolang.ast.*;
import com.tropicalbastos.brolang.compiler.*;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class BrolangBuilderListener extends BrolangBaseListener {

    private String output;
    private HashMap<Integer, List<BrolangScopedVar>> declaredVars;
    private int currentScope;
    private BrolangContext brolangContext;

    public BrolangBuilderListener() {
        output = "#include <stdio.h>\n";
        output += "int main (int argc, char** argv) {\n";
        brolangContext = BrolangContext.DEFAULT;
        declaredVars = new HashMap<>();
        declaredVars.put(currentScope, new ArrayList<>());
        currentScope = 0;
    }

    public String getOutput() {
        return output;
    }

	public void enterCompilationUnit(BrolangParser.CompilationUnitContext ctx){}

	public void exitCompilationUnit(BrolangParser.CompilationUnitContext ctx) {
        output += "}\n";
    }

	public void enterStmt(BrolangParser.StmtContext ctx){}

	public void exitStmt(BrolangParser.StmtContext ctx){}

	public void enterAssignStmt(BrolangParser.AssignStmtContext ctx){
        brolangContext = BrolangContext.ASSIGNMENT_CONTEXT;
        List<ParseTree> tree = ctx.children;
        String type = tree.get(0).getText();
        int trueType = BrolangParser.STRING;

        switch (type) {
            case "brint":
                trueType = BrolangParser.INT;
                output += "int ";
                break;
            case "bring":
                output += "char* ";
                break;
            case "broat":
                trueType = BrolangParser.FLOAT;
                output += "float ";
                break;
        }

        String variableName = tree.get(1).getText();

        List<BrolangScopedVar> l = declaredVars.get(currentScope);
        BrolangScopedVar scopedVar = new BrolangScopedVar();
        scopedVar.type = trueType;
        scopedVar.varName = variableName;
        l.add(scopedVar);

        output += variableName; //identifier
        output += " = ";
        output += tree.get(3).getText(); //expression
        output += ";\n";
    }

	public void exitAssignStmt(BrolangParser.AssignStmtContext ctx) {
        brolangContext = BrolangContext.DEFAULT; 
    }

    public void enterVariableexpr(BrolangParser.VariableexprContext ctx) {
        if (
            brolangContext != BrolangContext.IF_CONTEXT &&
            brolangContext != BrolangContext.ASSIGNMENT_CONTEXT
        ) {
            output += ctx.children.get(0).getText();
        }
    }

	// public void exitExpr(BrolangParser.ExprContext ctx){}

	public void enterIfcondition(BrolangParser.IfconditionContext ctx){
        brolangContext = BrolangContext.IF_CONTEXT;
        output += "if (";
        List<ParseTree> tree = ctx.children;
        for (int i = 1; i < tree.size(); i++) {
            String tokenText = tree.get(i).getText();
            if (tokenText.trim().charAt(0) == '{') {
                output += ") {\n";
            } else {
                output += tokenText;
            }
        }
    }

    public void enterEndscope(BrolangParser.EndscopeContext ctx) {
        output += "}\n";
        brolangContext = BrolangContext.DEFAULT;
    }

	public void enterElsecondition(BrolangParser.ElseconditionContext ctx) {
        output += "else {";
    }

	public void exitElsecondition(BrolangParser.ElseconditionContext ctx) {

    }

	public void enterElseifcondition(BrolangParser.ElseifconditionContext ctx) {
        output += "else ";
    }

    public void exitElseifcondition(BrolangParser.ElseifconditionContext ctx){}
    
	public void enterPrintstmt(BrolangParser.PrintstmtContext ctx){
        String varName = ctx.children.get(1).getText();
        List<BrolangScopedVar> l = declaredVars.get(currentScope);
        BrolangScopedVar var = BrolangScopedVar.getByVarName(l, varName);
        int type = var.type;
        String formatSpec = "%s";
        if (type == BrolangParser.INT) {
            formatSpec = "%d";
        } else if (type == BrolangParser.FLOAT) {
            formatSpec = "%f";
        }
        output += "printf(\"" + formatSpec + "\", ";
    }

	public void exitPrintstmt(BrolangParser.PrintstmtContext ctx){
        output += ");\n";
    }

	public void enterTypeSpecifier(BrolangParser.TypeSpecifierContext ctx){}

    public void exitTypeSpecifier(BrolangParser.TypeSpecifierContext ctx){}
}
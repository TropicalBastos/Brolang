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
            case "brinteger":
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

        List<BrolangScopedVar> l = declaredVars.getOrDefault(currentScope, new ArrayList<>());
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
            brolangContext != BrolangContext.ASSIGNMENT_CONTEXT
        ) {
            output += ctx.children.get(0).getText();
        }
    }

    // public void exitExpr(BrolangParser.ExprContext ctx){}
    
    public void enterEqualsexpr(BrolangParser.EqualsexprContext ctx) {
        output += " == ";
    }

    public void enterNequalexpr(BrolangParser.NequalexprContext ctx) {
        output += " != ";
    }

	public void enterIfcondition(BrolangParser.IfconditionContext ctx){
        brolangContext = BrolangContext.IF_CONTEXT;
        currentScope++;
        output += "if (";
    }

    public void exitIfcondition(BrolangParser.IfconditionContext ctx){
        output += ") {\n";
    }

    public void enterStartscope(BrolangParser.StartscopeContext ctx) {
        currentScope++;
        output += "{\n";
    }

    public void enterEndscope(BrolangParser.EndscopeContext ctx) {
        output += "}\n";
        brolangContext = BrolangContext.DEFAULT;
        currentScope--;
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
        BrolangScopedVar var = BrolangScopedVar.getByVarName(declaredVars, varName, currentScope);

        if (var == null) {
            System.err.println("Variable " + varName + " not declared");
            System.exit(-1);
        }

        int type = var.type;

        String formatSpec = "%s";
        if (type == BrolangParser.INT) {
            formatSpec = "%d";
        } else if (type == BrolangParser.FLOAT) {
            formatSpec = "%f";
        }

        output += "printf(\"" + formatSpec + "\\n\", ";
    }

	public void exitPrintstmt(BrolangParser.PrintstmtContext ctx){
        output += ");\n";
    }

	public void enterTypeSpecifier(BrolangParser.TypeSpecifierContext ctx){}

    public void exitTypeSpecifier(BrolangParser.TypeSpecifierContext ctx){}
}
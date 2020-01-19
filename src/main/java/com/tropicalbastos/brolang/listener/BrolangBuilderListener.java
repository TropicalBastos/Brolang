package com.tropicalbastos.brolang.listener;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;
import com.tropicalbastos.brolang.ast.*;
import java.util.List;

public class BrolangBuilderListener extends BrolangBaseListener {

    private String output;

    private BrolangContext brolangContext;

    public BrolangBuilderListener() {
        output = "#include <stdio.h>\n";
        output += "int main (int argc, char** argv) {\n";
        brolangContext = BrolangContext.DEFAULT;
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

        switch (type) {
            case "brint":
                output += "int ";
                break;
            case "bring":
                output += "char* ";
                break;
            case "broat":
                output += "float ";
                break;
        }

        output += tree.get(1).getText(); //identifier
        output += " = ";
        output += tree.get(3).getText(); //expression
        output += ";\n";
    }

	public void exitAssignStmt(BrolangParser.AssignStmtContext ctx){}

	public void enterExpr(BrolangParser.ExprContext ctx){
        if (
            brolangContext != BrolangContext.IF_CONTEXT &&
            brolangContext != BrolangContext.ASSIGNMENT_CONTEXT
        )
            output += ctx.children.get(0).getText();
    }

	public void exitExpr(BrolangParser.ExprContext ctx){}

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

	public void enterElsecondition(BrolangParser.ElseconditionContext ctx){}

	public void exitElsecondition(BrolangParser.ElseconditionContext ctx){}

	public void enterElseifcondition(BrolangParser.ElseifconditionContext ctx){}

	public void exitElseifcondition(BrolangParser.ElseifconditionContext ctx){}

	public void enterPrintstmt(BrolangParser.PrintstmtContext ctx){
        output += "printf(\"%s\", ";
    }

	public void exitPrintstmt(BrolangParser.PrintstmtContext ctx){
        output += ");\n";
    }

	public void enterTypeSpecifier(BrolangParser.TypeSpecifierContext ctx){}

    public void exitTypeSpecifier(BrolangParser.TypeSpecifierContext ctx){}
}
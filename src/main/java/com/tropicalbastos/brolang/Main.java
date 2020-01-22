package com.tropicalbastos.brolang;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.IOException;

import com.tropicalbastos.brolang.ast.*;
import com.tropicalbastos.brolang.listener.*;
import com.tropicalbastos.brolang.compiler.*;

public class Main {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage bcc [source file] [output file]");
        }

        String fileName = args[0];
        String outFile = args[1];
        String sourceCode = "";

        try (FileInputStream fileStream = new FileInputStream(fileName)) {
            while (fileStream.available() > 0) {
                sourceCode += (char) fileStream.read();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(-1);
        }

        CharStream input = CharStreams.fromString(sourceCode);
        BrolangLexer lexer = new BrolangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BrolangParser parser = new BrolangParser(tokens);
        BrolangParser.CompilationUnitContext tree = parser.compilationUnit();
        BrolangBuilderListener listener = new BrolangBuilderListener();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);

        String codeSource = listener.getOutput();
        BrolangCompiler compiler = new BrolangCompiler(codeSource);
        compiler.compile(outFile);
    }

}
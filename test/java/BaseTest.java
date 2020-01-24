import org.junit.Test;
import org.junit.Assert;
import junit.framework.*;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import com.tropicalbastos.brolang.ast.*;
import com.tropicalbastos.brolang.listener.*;
import com.tropicalbastos.brolang.compiler.*;

public class BaseTest {

    BrolangBuilderListener listener;

    protected void transpile(String sourceCode){
        CharStream input = CharStreams.fromString(sourceCode);
        BrolangLexer lexer = new BrolangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BrolangParser parser = new BrolangParser(tokens);
        BrolangParser.CompilationUnitContext tree = parser.compilationUnit();
        listener = new BrolangBuilderListener();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);
    }
     
}
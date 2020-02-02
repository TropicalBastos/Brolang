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

public class IfStatementTests extends BaseTest {

    @Test
    public void testSimpleIfStatement() {
        String code = "brif 5 brequals 5{\n}";
        transpile(code);
        String result = listener.getOutput();
        String expected = TRANSPILE_TEMPLATE.replace("%(SOURCE_CODE)", "if (5 == 5) {\n}\n");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testAndIfStatement() {
        String code = "brif 5 brequals 5 brand 7 brequals 7{\n}";
        transpile(code);
        String result = listener.getOutput();
        String expected = TRANSPILE_TEMPLATE.replace("%(SOURCE_CODE)", "if (5 == 5 && 7 == 7) {\n}\n");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testOrIfStatement() {
        String code = "brif 5 brequals 4 bror 7 brequals 7{\n}";
        transpile(code);
        String result = listener.getOutput();
        String expected = TRANSPILE_TEMPLATE.replace("%(SOURCE_CODE)", "if (5 == 4 || 7 == 7) {\n}\n");
        Assert.assertEquals(expected, result);
    }

}
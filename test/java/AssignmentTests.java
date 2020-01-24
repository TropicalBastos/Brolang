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

public class AssignmentTests extends BaseTest {

    @Test
    public void testAssignment() {
        String code = "brinteger flag bris 5";
        transpile(code);
        String result = listener.getOutput();
        String expected = TRANSPILE_TEMPLATE.replace("%(SOURCE_CODE)", "int flag = 5;\n");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testNestedAssignment() {
        String code = "brif 4 brequals 4 {\nbrinteger flag bris 5\n}";
        transpile(code);
        String result = listener.getOutput();
        String expected = TRANSPILE_TEMPLATE.replace("%(SOURCE_CODE)", "if (4 == 4) {\nint flag = 5;\n}\n");
        Assert.assertEquals(expected, result);
    }

}
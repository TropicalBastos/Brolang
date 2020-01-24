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
        Assert.assertEquals(
            "#include <stdio.h>\nint main (int argc, char** argv) {\nint flag = 5;\n}\n",
            result
        );
    }

}
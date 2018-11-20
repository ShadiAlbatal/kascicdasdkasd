import junit.framework.AssertionFailedError;
import org.codehaus.groovy.transform.SourceURIASTTransformation;
import org.junit.Test;
import junit.framework.TestCase;
//import org.junit.jupiter.api.Assert;
import org.junit.jupiter.api.Assertions;
//import org.test.Assert;

//import static org.junit.Assert;

public class OnlineTestTest extends TestCase {

    public void testOnlineTest() throws Exception {
        OnlineTest test = new OnlineTest("Test of Online Game");

        test.current = 0;
        test.jb[1].setSelected(true);
        Assertions.assertTrue(test.check());
        System.out.println(test.check());

        test.current = 4;
        test.jb[2].setSelected(true);
        Assertions.assertTrue(test.check());
        System.out.println(test.check());

        test.current = 7;
        test.jb[3].setSelected(true);
        Assertions.assertTrue(test.check());
        System.out.println(test.check());

        test.current = 9;
        test.jb[1].setSelected(true);
        Assertions.assertFalse(test.check());
        System.out.println(test.check());


    }

}


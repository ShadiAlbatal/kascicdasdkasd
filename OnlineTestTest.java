import org.junit.Test;
import junit.framework.TestCase;
import org.testng.Assert;

import static org.junit.Assert.*;

public class OnlineTestTest extends TestCase{

    public void testOnlineTest() throws Exception {
        OnlineTest test = new OnlineTest("Test of Online Game");
        test.current=0;
        test.jb[1].setSelected(true);
        Assert.assertTrue(test.current==0&&test.jb[1].isSelected(), "True");


    }


}
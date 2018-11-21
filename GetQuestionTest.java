import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

public class GetQuestionTest extends TestCase {


    public void testreturnQuestion() throws Exception {

       getQuestion.setArray();
       Assertions.assertEquals(getQuestion.returnQuestion(0),"Que1: Which one among these is not a datatype");

        Assertions.assertEquals(getQuestion.returnQuestion(3),"Que4: What happens when thread's sleep() method is called");

        Assertions.assertNotEquals(getQuestion.returnQuestion(7),"Que10: Which one among these is not a valid component");

    }

}

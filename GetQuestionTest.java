import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

public class GetQuestionTest extends TestCase {


    public void testreturnQuestion() throws Exception {
       getQuestion test= new getQuestion();

       getQuestion.setArray();
       Assertions.assertEquals(0,0,getQuestion.returnQuestion(0));
       System.out.println(getQuestion.returnQuestion(0));

       getQuestion.setArray();
       Assertions.assertEquals(1,1,getQuestion.returnQuestion(1));
       System.out.println(getQuestion.returnQuestion(1));

       getQuestion.setArray();
       Assertions.assertEquals(2,2,getQuestion.returnQuestion(2));
       System.out.println(getQuestion.returnQuestion(2));

       getQuestion.setArray();
       Assertions.assertEquals(3,3,getQuestion.returnQuestion(3));
       System.out.println(getQuestion.returnQuestion(3));

       getQuestion.setArray();
       Assertions.assertEquals(4,4,getQuestion.returnQuestion(4));
       System.out.println(getQuestion.returnQuestion(4));
    }




}

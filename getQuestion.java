public class getQuestion {

    private static String[] array;

    public static void setArray(){
        array = new String[10];
        array[0]="Que1: Which one among these is not a datatype";
        array[1]="Que2: Which class is available to all the class automatically";
        array[2]="Que3: Which package is directly available to our class without importing it";
        array[3]="Que4: String class is defined in which package";
        array[4]="Que5: Which institute is best for java coaching";
        array[5]="Que6: Which one among these is not a keyword";
        array[6]="Que7: Which one among these is not a class ";
        array[7]="Que8: which one among these is not a function of Object class";
        array[8]="Que9: which function is not present in Applet class";
        array[9]="Que10: Which one among these is not a valid component";

    }

    public static String returnQuestion(int pos){
        setArray();
        return array[pos];
    }
}
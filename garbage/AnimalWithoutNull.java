package garbage;

public class AnimalWithoutNull {


   /**
    * How many of the String objects are eligible for garbage collection right before the end of the main() method?
        A. None
        B. One
        C. Two
        D. Three
        E. None of the above

       All three references point to the String object "lion". This makes the other two String objects eligible for garbage collection and makes option C correct.
    */
    public static void main(String[] ohMy) {
        String animal1 = new String("lion");
        String animal2 = new String("tiger");
        String animal3 = new String("bear");

        animal3 = animal1;
        animal2 = animal3;
        animal1 = animal2;
    }

}
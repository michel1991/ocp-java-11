package internationalization;
import java.util.*;

public class SetDefaultLocalFindErrors {

    /**
     * How many lines does the following print out?
        A. Only an exception is printed.
        B. One, followed by an exception.
        C. Two, followed by an exception.
        D. Three.
        E. It does not compile.

       This code compiles and runs without exception, making option D the correct answer.
       Line 3 uses a predefined Locale constant.
       Line 5 passes a language and country code for English in Australia.
       Line 7 incorrectly passes capital letters as a language code.
       However, Java automatically converts it to lowercase without throwing an exception.
       The three lines printed by the code are ko, en_AU, and en.

     */
    static void firstExample(){
        Locale.setDefault(Locale.KOREAN); // 3:
        System.out.println(Locale.getDefault()); //  4:
        Locale.setDefault(new Locale("en", "AU")); //  5:
        System.out.println(Locale.getDefault()); //   6:
        Locale.setDefault(new Locale("EN")); //  7:
        System.out.println(Locale.getDefault()); // 8:
    }
  public static void main(String... args){
        firstExample();
  }
}
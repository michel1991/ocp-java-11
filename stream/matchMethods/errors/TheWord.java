package stream.matchMethods.errors;
import java.util.function.*;
import java.util.stream.*;
import java.util.*;

/**
 Given:
    String sentence = "Life is a box of chocolates, Forrest. "+
                                    "You never know what you're gonna get."; //1
    Optional<String> theword = Stream.of(sentence.split("[ ,.]"))
                 .anyMatch(w->w.startsWith("g")); //2
    System.out.println(theword.get()); //3
    
    Which of the following statements are correct?
    
    A. It may print either gonna or get.
    B. It will print gonna.
    
    C. It may print either gonna or get if lines //2 and //3 are changed to:
        String theword = Stream.of(sentence.split("[ ,.]"))
             .anyMatch(w->w.startsWith("g")); //2
        System.out.println(theword.get);//3
        
    D. It may print either gonna or get if lines //2 and //3 are changed to:
        Optional<String> theword = Stream.of(sentence.split("[ ,.]")).parallel()
              .anyMatch(w->w.startsWith("g")); //2
        System.out.println(theword.get()); //3
       
    E. It will fail to compile.
    ----------------
    anyMatch returns a boolean and not an Optional. Therefore, //2 will not compile.
    The expression Stream.of(sentence.split("[ ,.]")).anyMatch(w->w.startsWith("g")); will actually just return true.
    
  
  Correct (E)
    
    
    
 */
public class TheWord {
    public static void main(String[] args) {
        String sentence = "Life is a box of chocolates, Forrest. "+
                                "You never know what you're gonna get."; //1
        Optional<String> theword = Stream.of(sentence.split("[ ,.]"))
                     .anyMatch(w->w.startsWith("g")); //2
        System.out.println(theword.get()); //3
    }
}
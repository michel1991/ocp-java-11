package internationalization.errors;
import java.util.*;

public class BadDeclarationOfProperties {
    /**
     * What is the result of the following?
        A. hammer nail
        B. The code does not compile due to line p1.
        C. The code does not compile due to line p2.
        D. The code does not compile due to line p3.
        E. An exception is thrown at runtime.
        F. None of the above.
        
        The class on line p1 should be Properties rather than Property.
        As written, it is incorrect and does not compile, making option B the correct answer.
     */
   static void badCreation(){
       Map<String, String> map = new TreeMap<>();
       map.put("tool", "hammer");
       map.put("problem", "nail");

       var props = new Property();          // p1
       map.forEach((k,v) -> props.put(k, v));  // p2

       String t = props.getProperty("tool");   // p3
       String n = props.getProperty("nail");
       System.out.print(t + " " + n);
       
   }
}
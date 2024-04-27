package lambda.lambdaAndReference;
import java.util.function.*;
import java.util.function.*;
import java.util.*;

/**
 *  Given:
    public static void main(String[] args) {
        INSERT CODE HERE
        List.of(args).forEach(x);
    }
    Which of the following options can be inserted in the above code without causing a compilation error?
    
    A. Consumer x = ()->{ System.out::println; }
    B. Consumer x = System.out::println;
    C.  var x = System.out::println;
    The method reference is valid but var x is not valid because there is no way compiler can infer
    the type of the lambda expression that is meant to be implemented using the method reference. So, x's type cannot be determined.
    
    D. Consumer x = (m)->{ };
    It won't do anything but it is valid nonetheless.
    
    E. Consumer x = (String msg)->{ System.out.println(msg); };
    Since Consumer is not typed to String, the type of msg must be Object. The following two would be valid though:
    
    Consumer<String> x = (String msg)->{ System.out.println(msg); };
    
    // msg's type will be inferred as Object
    Consumer x = (msg)->{ System.out.println(msg); };
    Correct(B, D)
    
 */
public class DisplayListContent {
    public static Consumer reponseD(){
        Consumer x = (m)->{ };
        return x;
    }
    public static void main(String[] args) {
       //_ INSERT CODE HERE
        Consumer x = (m)->{ };
        List.of(args).forEach(x);
    }
}
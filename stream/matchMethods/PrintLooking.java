package stream.matchMethods;
import java.util.*;
import java.util.function.*;

/**
 * What will the following code print?
 
     A. It will not print anything.
     B. It will not print anything but will throw an exception at run time.
     C. Looking...
        Looking...
        Looking...  
        <exception stack trace>
        
    D.  Looking...
         Looking...
        Looking...
   
    E. Looking...
        Looking...
        Looking...
        Looking...
    
    F. Looking...
    
    Remember that filter is an intermediate operation, which means it will not execute until a terminal operation is invoked on the stream.
    allMatch is a short circuiting terminal operation.
    Thus, when allMatch is invoked, the filter method will be invoked and it will keep only
    those elements in the stream that satisfy the condition given in the filter i.e. the string must be longer than 8 characters.
    After this method is done, only three elements will be left in the stream.
    When allMatch is invoked, the code in predicate will be executed for each element until it finds a mismatch.
    Thus, Looking... will be printed three times.
    
    Correct(D)

 */
public class PrintLooking {
    public static void main(String... args){
        System.out.println("Tom Hart".length());
        List<String> ls = Arrays.asList("Tom Cruise", "Tom Hart",
                                                                "Tom Hanks", "Tom Brady");
                Predicate<String> p = str->{
                    System.out.println("Looking...");
                    return str.indexOf("Tom") > -1;
                };
                boolean flag = ls.stream().filter(str->str.length()>8).allMatch(p);
    }
}
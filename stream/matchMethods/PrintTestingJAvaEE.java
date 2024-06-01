package stream.matchMethods;
import java.util.*;
import java.util.function.*;

public class PrintTestingJAvaEE {
    /**
     What will the following code print when compiled and run?

        List<String> values = Arrays.asList("Java EE", "C#", "Python");
        boolean flag = values.stream().allMatch(str->{
            System.out.println("Testing: "+str);
            return str.equals("Java");
            });
        System.out.println(flag);
        
        A.
          Testing: Java EE
           false
        
        B.
            Testing: Java EE
            Testing: C#
            Testing: Python
            false
            
        C.
            Testing: Java EE
            true
        
        D. It will not compile because lambda expression is built incorrectly.
        
       -------------------------------------
       
       This question is based on the fact that allMatch, noneMatch, anyMatch, findFirst, and findAny are short-circuiting terminal operations.
       This means, the given predicate will not be executed for each element of the stream if the result can be determined by testing
       an element in the beginning itself. For example, if you invoke predicate on the given stream,
       the predicate will return false for the first element. If any one element in the list does not satisfy the predicate,
       the result of the call to allMatch will certainly be false even if you test all other elements irrespective of whether
       other tests returns true or false. Therefore, it is clear that there is no need for testing other elements.
       
       Correct(B)

        
     */
    public static void main(String... args){
       

        List<String> values = Arrays.asList("Java EE", "C#", "Python");
        boolean flag = values.stream().allMatch(str->{
            System.out.println("Testing: "+str);
            return str.equals("Java");
            });
        System.out.println(flag);
    }
}
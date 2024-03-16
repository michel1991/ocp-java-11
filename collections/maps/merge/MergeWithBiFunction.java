package collections.lists.maps.merge;
import java.util.*;
import java.util.function.*;

public class MergeWithBiFunction {
    /**
       A.
          BiFunction<String, String> f = String::concat;
           BiFunction needs three parameterized types.
        
       B.
          Function<String> f = String::concat;
         1. Function requires two parameterized types - one for the parameter type and one for the return type.
          For example, Function<String, String> f; or Function<String, Integer> f; would be valid.
         2. String.concat is invoked on a String and expects another String as an argument.
           In other word, you need two strings to work with String.contact. It cannot be used to capture Function interface, which works with just one.
           
       C. BiFunction<String, String, String> f = String::concat;
       
       D.  Function<String, String> f = String::concat;
       String.concat is invoked on a String and expects another String as an argument.
       In other word, you need two strings to work with the concat method.
       It cannot be used to capture Function interface, which works with just one.
       Therefore, even Function<String, String> f = String::concat; would not compile.
       
      Correct(C)
     */
    public static void main(String... args){
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "x");
        map1.put("b", "x");
        //INSERT CODE HERE
        BiFunction<String, String, String> f = String::concat;
        map1.merge("b", "y", f);
        map1.merge("c", "y", f);
        System.out.println(map1);
    }
}
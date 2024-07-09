package stream.collect.toList;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class Print46 {
    /**
       What will the following code print when compiled and run?
       
       A.  It will fail to compile.
       B.  null
       C.  [1]
       D.  [2]
       E.  [5, 7]
       F.  [4, 6]
       
      -------------------------------
      The given code illustrates how you can filter a stream multiple times.
      The important thing here is that only the elements that satisfy the filter condition remain in the stream.
      Rest are eliminated.

     Here, the first condition (implemented by Predicate p) is that the numbers must be even.
     This means 1, 3, 5, and 7 are out.
     Next, the second condition (specified directly in the call to filter method using lambda expression x->x>3
     means that the number must be greater than 3. This means only 4 and 6 will be left.
      
      Correct(F)

     */
    public static void main(String... args){
        List<Integer> iList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Predicate<Integer> p = x->x%2==0;
        List newList = iList.stream().filter(p).filter(x->x>3).collect(Collectors.toList());
        System.out.println(newList);
    }
}
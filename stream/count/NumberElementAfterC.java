
package stream.count;
import java.util.Arrays;
import java.util.List;

/**
 * Given the following code:
   Which of the following options will correctly print the number of elements that will come before the string "c"
   if the list were sorted alphabetically?
   
  A. int count = al.stream().filter((str)->str.compareTo("c")<0).count();
    count method returns long. You cannot assign a long to an int without an explicit cast.
   
  B. long count = al.stream().filter((str)->str.compareTo("c")<0).count();

  
  C. int count = al.stream().filter((str)->str.compareTo("c")<0).sort().count();

  
  D.  int count = al.stream().filter((str)->str.compareTo("c")<0).sorted().count();

  E. int count = 0;
    al.stream().forEach(s->{
             count = (s.compareTo("c")<0)?count+1:count;
         });
   This code would have been valid but for the fact that non-final or non-effectively final local variables cannot be used inside lambda expressions.
   Since count is being changed in this code, it is not effectively final.
   If count were a static field of TestClass, this code would have been valid even if it was not declared final.
   
  This is a very straight forward question. filter method will filter the stream based on the given criteria
  and count method will count the number of items in the resulting list. There is no need for sorting
  the list because you just want to count the number of items that satisfy the given criteria.

  Correct(B)
 */
class TestClass {
    public static void main(String[] args) {
        List<String> al = Arrays.asList("aa", "aaa", "b", "cc", "ccc", "ddd", "a");
        //INSERT CODE HERE
        long count = al.stream().filter((str)->str.compareTo("c")<0).count(); 
        
        System.out.println(count);
    }
}

public class NumberElementAfterC {
    public static void main(String[] args) {
        TestClass.main(args);
    }
}
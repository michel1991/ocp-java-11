package stream.errors;
import java.util.*;


/**
  How many lines does this code output?
    A. Two.
    B. Four.
    C. The code does not compile.
    D. The code compiles but throws an exception at runtime.

    This code is almost correct. Calling two different streams is allowed.
     The code attempts to use a method reference when calling the forEach() method.
      However, it does not use the right syntax for a method reference.
      A double colon needs to be used. The code would need to be changed to System.out::println
      to work and print two lines for each call. Since it does not compile, option C is correct.
 */
public class LinkedListForEachBadRefMethodSynthax {
  public static void main(String ... args){
      var list = new LinkedList<String>();
      list.add("Archie");
      list.add("X-Men");
      list.stream().forEach(System.out.println);
      list.stream().forEach(System.out.println);
  }
}
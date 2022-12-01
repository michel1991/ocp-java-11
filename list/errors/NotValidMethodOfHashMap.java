package list.errors;
import java.util.*;

public interface NotValidMethodOfHashMap {
    /**
    * What is the result of the following code?
    *
      A. false
      B. true
      C. Compiler error on line 4
      D. Compiler error on line 5
      E. Compiler error on line 7

      This question looks like it is about generics, but it’s not.
      It is trying to see whether you noticed that Map does not have a contains() method.
     It has containsKey() and containsValue() instead. If containsKey() was called, the answer would be false because 123 is an Integer key in the Map, rather than a String.
     */
   public static void invalidContainsMethod(){
       Map m = new HashMap();
       m.put(123, "456");
       m.put("abc", "def");
       System.out.println(m.contains("123"));
   }
}
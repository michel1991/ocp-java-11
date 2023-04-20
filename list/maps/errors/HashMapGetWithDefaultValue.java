package list.maps.errors;
import java.util.*;

public class HashMapGetWithDefaultValue {
  /**
   *  What is true of the following code? (Choose three.)
      A. One line does not compile.
      B. Two lines do not compile.
      C. If any lines that do not compile are removed, the String on line 40 is set to null.
      D. If any lines that do not compile are removed, the String on line 41 is set to "pan".
      E. If any lines that do not compile are removed, the String on line 41 is set to "x".
      F. F. If any lines that do not compile are removed, the String on line 42 is set to "x".
      
       Line 40 does not compile since getOrDefault() requires two parameters.
       This makes option A the first answer. The rest of the code does compile.
       Option D is the next answer because getOrDefault()
       returns the value from the map when the key is present.
       Finally, option F is correct because getOrDefault()
       returns the second parameter when the key is not present.
   */
   static void putAndRetrieve(){
     var names = new HashMap<String, String>(); //  36:
     names.put("peter", "pan"); //  37:
     names.put("wendy", "darling"); //    38:
     //39:
     String w = names.getOrDefault("peter"); //  40: 
     String x = names.getOrDefault("peter", "x"); //  41:
     String y = names.getOrDefault("john", "x"); //    42:
   }
}
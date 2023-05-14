package collections.sets.errors;
import java.util.*;

public class SetDoesNotHaveGetKeyMethod {
    /**
      What does the following output?
        A. peter
        B. wendy
        C. Does not compile due to line x1
        D. Does not compile due to line x2
        E. Does not compile due to another reason
        F. Throws an exception at runtime

        Line x1 returns a Set of map entries.
        Set does not have a getKey() method,
        so line x2 does not compile, and option D is the answer.
     */
   static void add(){
       var names = new HashMap<String, String>();
       names.put("peter", "pan");
       names.put("wendy", "darling");
       var first = names.entrySet();        // line x1
       System.out.println(first.getKey());  // line x2
   }
}
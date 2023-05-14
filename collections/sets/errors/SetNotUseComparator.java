package collections.sets.errors;
import java.util.*;
public class SetNotUseComparator {
    /**
     * What is the output of the following code?
     *
        A. [leo, Olivia]
        B. [Olivia, leo]
        C. The code does not compile because of line X.
        D. The code does not compile for another reason.
        E. A runtime exception is thrown.

        Set is not an ordered Collection. Since it does not have a sort() method,
        the code does not compile, making option C correct.
     */
   static void compoare(){
       Set<String> cats = new HashSet<>();
       cats.add("leo");
       cats.add("Olivia");

       cats.sort((c1, c2) -> -c1.compareTo(c2)); // line X
       System.out.println(cats);
   }
}
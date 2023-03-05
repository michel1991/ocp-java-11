package list;
import java.util.*;

public class ImmutableWithRemoveIf {
    /**
     * Which of the following are true? (Choose all that apply.)
        A. This code compiles and runs without error.
        B. Exactly one of these lines contains a compiler error.
        C. Exactly two of these lines contain a compiler error.
        D. Exactly three of these lines contain a compiler error.
        E. Exactly four of these lines contain a compiler error.
        F. If any lines with compiler errors are removed, this code runs without throwing an exception.
        G. If all lines with compiler errors are removed, this code throws an exception.

        Line 12 creates a List<?>, which means it is treated as if all the elements are of
        type Object rather than String.
        Lines 15 and 16 do not compile since they call the String
        methods isEmpty() and length(), which are not defined on Object.
        Line 13 creates a List<String> because var uses the type that
        it deduces from the context. Lines 17 and 18 do compile.
        However, List.of() creates an immutable list,
        so both of those lines would throw an UnsupportedOperationException if run.
        Therefore, options C and G are correct.
     */
   static void remove(){
       List<?> q = List.of("mouse", "parrot"); //   12:
       var v = List.of("mouse", "parrot"); //  13:
       // 14:
       q.removeIf(String::isEmpty); //  15:
       q.removeIf(s -> s.length() == 4); //  16:
       v.removeIf(String::isEmpty); //  17:
       v.removeIf(s -> s.length() == 4); //  18:
   }
}
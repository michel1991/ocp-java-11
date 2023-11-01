package lambda.errors.badParametersDeclaration;
import java.util.*;

public class ComparatorFindErrors {
    /**
     How many of these compile?

        A. 0
        B. 1
        C. 2
        D. 3
        E. 4
        F. 5

        Line 18 compiles because neither type is specified for the lambda parameters.
        Lines 19 and 22 compile because the lambda parameters use a type or var consistently.
        These are the three lines that compile, making option D correct.
        Lines 20 and 21 do not compile because var must be used for all parameters in a lambda if it is used for any.
     */
   static void findErrors(){
      Comparator<String> c1 = (j, k) -> 0; // 18:
      Comparator<String> c2 = (String j, String k) -> 0; // 19:
      Comparator<String> c3 = (var j, String k) -> 0; //   20:
      Comparator<String> c4 = (var j, k) -> 0; //  21:
      Comparator<String> c5 = (var j, var k) -> 0; //  22:
   }
}
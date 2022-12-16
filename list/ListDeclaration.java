package list;
import java.util.*;

public class ListDeclaration {
    /**
    * Which of the following compile? (Choose all that apply.)
    *   A. List<Integer> x1 = new ArrayList();
        B. List<Integer> x2 = new ArrayList<>();
        C. List<Integer> x3 = new ArrayList<Integer>();
        D. List<> x4 = new ArrayList<Integer>();
        E. List<Integer> x5 = new List<Integer>();
        F. ArrayList<int> x6 = new List<int>();

       Option A compiles since it is allowed to use generics on just one side in a declaration.
       Option B compiles using the diamond operator.
       Option C is a longer form of option B; it spells out the generics type.
       Option D does not compile because the diamond operator is allowed only on the right side.
       Option E does not compile because List is allowed only on the left side since it’s an interface rather than a concrete type.
       Option F does not compile because primitives are not allowed to be ArrayList types.
       Autoboxing works only when working with the ArrayList, not when creating it.
     */
   static void firstExample(){
       List<Integer> x1 = new ArrayList();
       List<Integer> x2 = new ArrayList<>();
       List<Integer> x3 = new ArrayList<Integer>();
   }
}
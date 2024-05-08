package sorts.tricky;
import java.util.*;


/**
 * What will the following code print when run?
    A. charlie
    B. andy
    C. dave
    D. It will throw a NullPointerException
    E. It will not compile.
        There is nothing wrong with the code.
     

   The second argument to Collections.sort is for passing a Comparator object that you want to use for comparing the objects.
   If it is null, natural sorting order for the elements is used.
   Therefore, the given list will be sorted with "andy" as the first element, which will be printed.

    Although not documented in the JavaDoc API description, passing null doesn't cause a NullPointerException.
    
       Correct(B)

 */
public class PrintAndy {
    public static void main(String[] args) {
        String[] sa = { "charlie", "bob", "andy", "dave" };
            Collections.sort(Arrays.asList(sa), null);
            System.out.println(sa[0]);
    }
}
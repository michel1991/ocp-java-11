package collections.lists.unknowMethods;
import java.util.*;

/**
    What will the following code print when compiled and run?
    A. It will not compile.
    B. It will throw an exception at run time because of line //1
    
    C. It will throw an exception at run time because of line //2
        This line is trying to put a value in an ArrayList at index 2 (i.e. 3rd position).
        To be able to put a value at index 2, the ArrayList must have atleast 2 values already.
        Therefore, it will throw java.lang.IndexOutOfBoundsException exception.
        
    D. It will throw an exception at run time because of line //3
    E. null
    
    --------
      correct(C)

 */
 class TestClass { // public
    public static void main(String[] args) throws Exception {
        List list = new ArrayList();
        list.add("val1"); //1
        list.add(2, "val2"); //2
        list.add(1, "val3"); //3
        System.out.println(list);
     }
}

public class UseAddMethodWithIndex {
     public static void main(String[] args) throws Exception {
         TestClass.main(args);
     }
}
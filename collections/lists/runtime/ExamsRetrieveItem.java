
package collections.lists.runtime;

import java.util.*;

/**
 *  How many lines does the following code output?
    A. One.
    B. Two.
    C. Four.
    D. The code does not compile.
    E. The code compiles but throws an exception at runtime.
    F. The code compiles but enters an infinite loop at runtime.
    
    The first time the inner for loop is executed,
    it calls exams.get(i) where i is equal to exams.size().
    Since the maximum element is indexed as exams.size()-1,
    this results in an IndexOutOfBoundsException, making option E correct.
    Also, notice that there are no braces {} around the inner for loop; therefore,
    even without the exception, the most lines this code would print would be one,
    since there’s only one println() statement executed.
 */
class Exams {
    public static void main(String[] args) {
        List<String> exams = List.of("1Z0-817", "1Z0-819");
        for (var e : exams)
            for (int i=exams.size(); i >0 ; i-=2)
                System.out.print(e+" "+exams.get(i));
        System.out.println();
    }
}

public class ExamsRetrieveItem {
    public static void main(String[] args) {
        Exams.main(args);
    }
}
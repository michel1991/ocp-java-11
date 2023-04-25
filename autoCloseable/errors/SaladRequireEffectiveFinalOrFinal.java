package autoCloseable.errors;

/**
    What is the output of the following program?
    A. 2459
    B. 9245
    C. 5429
    D. 9542
    E. The code does not compile.
    F. None of the above.
    
   A variable declared before the start of a try-with-resources statement
   may be used if it is final or effectively final.
   Since g is modified after it is set, it is neither;
   therefore, the class does not compile, and option E is correct.
   If the last line of the main() method were removed,
   then the code would compile and print 2459 at runtime.
 */
class Garden implements AutoCloseable {
    private final int g;
    Garden(int g) { this.g = g; }
    public void close() throws Exception {
        System.out.print(g);
    }
}
 class Salad {
    public static void main(String[] u) throws Exception {
        var g = new Garden(5);
        try (g;
            var h = new Garden(4);
            var i = new Garden(2)) {
        } finally {
            System.out.println(9);
        }
        g = null;
    }
}

public class SaladRequireEffectiveFinalOrFinal {
  
}
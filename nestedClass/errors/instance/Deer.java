package nestedClass.errors.instance;


/**
  What is printed by the following program?
    A. b
    B. bc
    C. abc
    D. The code declaration of the Diet class does not compile.
    E. The main() method does not compile.
    F. The code compiles but produces an exception at runtime.
    G. None of the above

   Diet is an inner class, which requires an instance of Deer to instantiate.
   Since the main() method is static, there is no such instance.
   Therefore, the main() method does not compile, and option E is correct.
   If a reference to Deer were used, such as calling new Deer().new Diet(),
   then the code would compile and print bc at runtime.
 */
public class Deer {
    enum Food {APPLES, BERRIES, GRASS}
    protected class Diet {
        private Food getFavorite() {
            return Food.BERRIES;
        }
    }
    public static void main() {
        switch(new Diet().getFavorite()) {
            case APPLES: System.out.print("a");
            case BERRIES: System.out.print("b");
            default: System.out.print("c");
        }
    }
}

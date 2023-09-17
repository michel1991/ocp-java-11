package exceptions.override;

/**
   What is the output of the following application?
    A. creek
    B. thud
    C. thud?
    D. The code does not compile.
    E. The code compiles, but a stack trace is printed at runtime.
    F. None of the above.

    While RuntimeException is broader than IllegalArgumentException,
    the restriction on overriding methods applies only to checked exceptions,
    not unchecked exceptions.
    In other words, the code would not compile if both of the exceptions were checked.
    Since they are unchecked, though, the method override is valid.
    The program compiles and prints thud? at runtime, making option C correct.
 */
class Chair {
    public void sit() throws IllegalArgumentException {
        System.out.print("creek");
        throw new RuntimeException();
    }
}
class Stool extends Chair {
    public void sit() throws RuntimeException {
        System.out.print("thud");
    }
    public static void main(String... c) throws Exception {
        try {
            new Stool().sit();
        } finally {
            System.out.print("?");
        }
    }
}

public class StoolUncheckedExceptionSuperTypeOnThrow {
    public static void main(String... c) throws Exception {
        Stool.main(c);
    }
}
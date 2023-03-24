package inheritance.hide;

/**
  What is the output of the InfiniteMath program?

    A. 2.0
    B. 4.0
    C. 8.0
    D. The code does not compile.
    E. The code compiles but prints an exception at runtime.
    F. None of the above.

    The code compiles without issue. Java allows methods to be overridden,
    but not variables. Therefore, marking them final
    does not prevent them from being reimplemented in a subclass.
    Furthermore, polymorphism does not apply
    in the same way it would to methods as it does to variables.
    In particular, the reference type determines the version
    of the secret variable that is selected,
    making the output 2.0 and option A the correct answer.

 */
class Math {
    public final double secret = 2;
}
class ComplexMath extends Math {
    public final double secret = 4;
}
public class InfiniteMath extends ComplexMath {
    public final double secret = 8;
    public static void main(String[] numbers) {
        Math math = new InfiniteMath();
        System.out.print(math.secret);
    }
}
package interfaces;

/**
   What does the following print?
   What is the output of the following application?
    A. 8
    B. The code does not compile because AddNumbers is not a functional interface.
    C. The code does not compile because of line j1.
    D. The code does not compile for a different reason.
    E. None of the above.
    
    The AddNumbers interface is a valid functional interface.
    While it includes both static and default methods,
    it includes only one abstract method, the precise
    requirement for it to be considered a functional interface,
    making option B incorrect. The class compiles and prints 8 at runtime, making option A correct.
 */
interface AddNumbers {
    int add(int x, int y);
    static int subtract(int x, int y) { return x-y; }
    default int multiply(int x, int y) { return x*y; }
}
public class Calculator {
    protected void calculate(AddNumbers n, int a, int b) {
        System.out.print(n.add(a, b));
    }
    public static void main(String[] moreNumbers) {
        final var ti = new Calculator() {};
        ti.calculate((k,p) -> p+k+1, 2, 5);  // j1
    }
}
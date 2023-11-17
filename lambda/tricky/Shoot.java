package lambda.tricky;

/**
 * What does the following do? (Choose two.)
    A. If any compiler errors are fixed, it prints true.
    B. If any compiler errors are fixed, it prints false.
    C. It compiles without issue.
    D. It doesn’t compile due to line k1.
    E. It doesn’t compile due to line k2.
    
    This is a correct example of code that uses a lambda.
    The interface has a single abstract method.
    The lambda correctly takes one double parameter and returns a boolean.

    This matches the interface. The lambda syntax is correct.
    Since it compiles, option C is correct.
    Finally, option A is correct because 45 is greater than 5.
 */
public class Shoot {
    interface Target {
        boolean needToAim(double angle);
    }
    static void prepare(double angle, Target t) {
        boolean ready = t.needToAim(angle);  // k1
        System.out.println(ready);
    }
    public static void main(String[] args) {
        prepare(45, d -> d > 5 || d < -5);   // k2
    }
}

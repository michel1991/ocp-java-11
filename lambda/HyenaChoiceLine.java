import lambda;
import java.util.function.*;

/**
* Which lambda expression when entered into the blank line in the following code causes the program to print hahaha? (Choose all that apply.)
    A. var -> p.age <= 10
    B. shenzi -> age==1
    C. p -> true
    D. age==1
    E. shenzi -> age==2
    F. h -> h.age < 5
    G. None of the above, as the code does not compile.

    Option A is a valid lambda expression. While main() is a static method, it can access age since it is using a reference Hyena, which is effectively final in this method.
    Remember from your 1Z0-815 studies that var is a reserved type, not a reserved word, and may be used for variable names.
    Option F is also correct, with the lambda variable being a reference to a Hyena object.
    The variable is processed using deferred execution in the testLaugh() method.
    Options B and E are incorrect; since the local variable age is not effectively final, this would lead to a compilation error.
    Option C would also cause a compilation error, since the expression uses the variable name p, which is already declared within the method.
    Finally, option D is incorrect, as this is not even a lambda expression.
 */
class Hyena {
    private int age = 1;
    public static void main() {
        var p = new Hyena();
        double height = 10;
        int age = 1;
        testLaugh(p,  h -> h.age < 5); // __________________
        age = 2;
    }
    static void testLaugh(Hyena panda, Predicate<Hyena> joke) {
        var r = joke.test(panda) ? "hahaha" : "silence";
        System.out.print(r);
    }
}
public class HyenaChoiceLine {

}
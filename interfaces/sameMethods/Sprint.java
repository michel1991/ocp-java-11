package interfaces.sameMethods;

/**
 * What is the output of the following application?
    A. Walking and running!
    B. Walking and jogging!
    C. Sprinting!
    D. The code does not compile.
    E. The code compiles but prints an exception at runtime.
    F. None of the above.

    Having one class implement two interfaces that both define the same default method signature
    leads to a compiler error unless the class overrides the default method.
    In this case, the Sprint class overrides both walk() methods correctly;
    therefore, the code compiles without issue, and option C is correct.
    Note that the return types of the two default methods are different,
    but the overridden method uses a return type that is covariant with both.
 */
interface Run {
    default CharSequence walk() {
        return "Walking and running!";
    }
}
interface Jog {
    default String walk() {
        return "Walking and jogging!";
    }
}

public class Sprint implements Run, Jog {
    public String walk() {
        return "Sprinting!";
    }
    public static void main(String[] args) {
        var s = new Sprint();
        System.out.println(s.walk());
    }
}



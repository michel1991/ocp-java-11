package interfaces.errors;

/**
   Which statements about the following Twins class are true? (Choose three.)
    A. The class fails to compile because of the write() method.
    B. The class fails to compile because of the publish() method.
    C. The class fails to compile because of the think() method.
    D. All of the methods defined in the Alex interface are accessible in the Twins class.
    E. All of the methods defined in the Michael interface are accessible in the Twins class.
    F. The Twins class cannot be marked abstract.

    All of the interface methods without a private modifier are implicitly public.
    In a class, though, a method without a modifier is package-private by default.
    For this reason, the write() and think() methods do not compile because they are missing the public modifier,
    making options A and C correct.
    These are the only compiler errors, making option B incorrect.
    Option D is incorrect because the process() method is not accessible with Twins because it is private.
    Option E is correct, as all methods are accessible.
    Even the overridden default method can be accessed in the Twins class by calling Michael.super.write().
    Finally, option F is incorrect as the class still compiles if it is marked abstract.
 */
interface Alex {
    default void write() { System.out.print("1"); }
    static void publish() {}
    void think();
    private int process() { return 80; }
}

interface Michael {
    default void write() { System.out.print("2"); }
    static void publish() {}
    void think();
    private int study() { return 100; }
}

class Twins implements Alex, Michael {
    void write() { System.out.print("3"); }
    static void publish() {}
    void think() {
        System.out.print("Thinking...");
    }
}

public class TwinsMixTypeOfMethodChoiceAnswers {

}
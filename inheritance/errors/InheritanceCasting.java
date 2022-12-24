
package inheritance.errors;
interface WaterFowl {}
class Bird {}
class Duck extends Bird implements WaterFowl {
    public void quack() {
        System.out.println("quack!");
    }
}

/**
 *
    What is the output of the following code?
    A. quack!
    B. No output
    C. The code will not compile because of line 4.
    D. The code will not compile because of line 6.
    E. The code will not compile because of line 7.
    F. The code compiles but throws an exception at runtime.

    The code compiles without issue but throws an exception at runtime.
    The first thing to notice is that the cast to Object on line 6,
    although harmless, is not actually necessary since we are casting to a super type of the class.
    Alternatively, the cast on line 7 is required to go from Object to a subclass of type Duck,
    and the compiler allows this without issue. The code fails at runtime, though,
    because the object is an instance of Bird and cannot be cast to a subclass of type Duck, so option F is correct
 */
public interface InheritanceCasting {
    public static void main(String[] args) {
        Object object = (Object)new Bird();
        Duck duck = (Duck)object;
        duck.quack();
    }
}
package interfaces.errors;

/**
 *  Given the application shown here, which lines do not compile? (Choose three.)
    A. Line h1
    B. Line h2
    C. Line h3
    D. Line h4
    E. Line h5
    F. Line h6

    All of the compilation issues with this code involve access modifiers.
    First, interface methods cannot be marked protected.
    This causes a compilation error on line h1, making option A correct.
    Next, lines h2 and h3 both override the interface method
    with the package-private access modifier.
    Since this reduces the implied visibility of public,
    the overrides are invalid and neither line compiles.
    Therefore, options B and C are also correct.
    Note that the RuntimeException is allowed in an overridden
    method even though it is not in the parent
    method signature because only new checked exceptions
    in overridden methods cause compilation errors. Line h4 is valid.
    An object can be implicitly cast to a superclass or inherited interface.
    Finally, lines h5 and h6 will compile without issue but independently
    throw a ClassCastException and a NullPointerException at runtime,
    respectively. Since the question only asks about compilation problems,
     neither of these are correct answers.

 */
interface Friend {
    protected String getName();                    // h1
}
class Cat implements Friend {
    String getName() {                             // h2
        return "Kitty";
    }
}
 class Dog implements Friend {
    String getName() throws RuntimeException {     // h3
        return "Doggy";
    }
    public static void main(String[] adoption) {
        Friend friend = new Dog();  // h4
        System.out.print(((Cat)friend).getName());  // h5
        System.out.print(((Dog)null).getName());    // h6
    }
}


public class DogNotAddPublicAccessModifier {

}
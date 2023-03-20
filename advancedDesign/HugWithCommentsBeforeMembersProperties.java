package advancedDesign;

/**
 * Given the following two classes in the same package, what is the result of executing the Hug program?
 *
    A. kitty - 5.0
    B. The Kitten class does not compile.
    C. The Hug class does not compile.
    D. The Kitten and Hug classes do not compile.
    E. None of the above.

    Both classes compile without issue, and the Hug program prints kitty - 5.0,
    making option A the answer. In the Kitten class, all of the variables
    have package-private access as the access modifiers are commented out.
    Also, there is no age variable since the entire line is commented out.
    If the comment syntax was removed around private,
    then the Hug class would not compile
    on the line that accesses the cuteness variable.
 */
class Kitten {
    /** private **/ float cuteness;
    /* public */ String name;
    // default double age;
   void meow() { System.out.println(name + " - "+cuteness); }
}

class Hug {
    public static void main(String... friends) {
        var k = new Kitten();
        k.cuteness = 5;
        k.name = "kitty";
        k.meow();
    }
}


public class HugWithCommentsBeforeMembersProperties {
    public static void main(String... friends) {
        Hug.main(friends);
    }
}
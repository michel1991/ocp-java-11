package internationalization.errors;
import java.util.*;

/**
   What is the output of the following method if props contains {veggies=brontosaurus, meat=velociraptor}?
    A. brontosaurus none
    B. brontosaurus null
    C. none none
    D. none null
    E. The code does not compile.
    
    F. A runtime exception is thrown.
    The Properties class defines a get() method that does not allow for a default value.
     It also has a getProperty() method, which returns the default value if the key is not provided.
 */
public class MethodGetOfPropertyHasNotDefaultValue {
    private static void print(Properties props) {
        System.out.println(props.get("veggies", "none")+ " " + props.get("omni", "none"));
    }

    /**
      What is the output if the solveMystery() method is applied to a Properties object loaded from mystery.properties?

       mystery.properties
        mystery=bag
        type=paper

        A. bag ? trick
        B. bag ?null
        C. bag null null
        D. bag null trick
        E. The code does not compile.
        F. An exception is thrown at runtime.

        The first line of the method is correct,
        asProperties inherits Map and has a get() method.
        The get() method does not have an overloaded version that takes a default value,
        though.For this reason, the second and third get() calls do not compile,
        and option E is correct. If getProperty() were instead
        used on the second and third call, then the output would be bag null trick.


     */
    void solveMystery(Properties props) {
        var a = props.get("mystery");
        var b = props.get("more", null);
        var c = props.get("more", "trick");
        System.out.print(a + " " + b + " " + c);
    }

    public static void main(String... args){

    }
}
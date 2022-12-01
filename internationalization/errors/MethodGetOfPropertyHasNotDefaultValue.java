package internationalization.errors;
import java.util.*;

/**
    The Properties class defines a get() method that does not allow for a default value.
     It also has a getProperty() method, which returns the default value if the key is not provided.
 */
public class MethodGetOfPropertyHasNotDefaultValue {
    private static void print(Properties props) {
        System.out.println(props.get("veggies", "none")+ " " + props.get("omni", "none"));
    }

    public static void main(String... args){

    }
}
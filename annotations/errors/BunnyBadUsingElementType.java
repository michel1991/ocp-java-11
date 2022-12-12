package annotations.errors;
import java.lang.annotation.*;

/**
* Which statement about the following code is correct?
*   A. The code compiles without any changes.
    B. The code compiles only if the type of value() is changed to a String in the annotation declaration.
    C. The code compiles only if cute() is removed from the annotation declaration.
    D. The code compiles only if @Furry includes a value for cute().
    E. The code compiles only if @Furry includes the element name for value.
    F. The code compiles only if the value in @Furry is changed to an array.

   Furry is an annotation that can be applied only to types. In Bunny, it is applied to a method; therefore, it does not compile.
   If the @Target value was changed to ElementType.METHOD (or @Target removed entirely), then the rest of the code would compile without issue.
   The use of the shorthand notation for specifying a value() of an array is correct.
 */
@Target(ElementType.TYPE) public @interface Furry {
    public String[] value();
    boolean cute() default true;
}
class Bunny {
    @Furry("Soft") public static int hop() {
        return 1;
    }
}

public class BunnyBadUsingElementType {

}
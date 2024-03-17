package annotations.meta.typeUse;
import java.lang.annotation.*;
import java.util.*;

/**
* Given the following program, which would be a valid declaration for the Slithers annotation?
*   A. @Retention(RetentionPolicy.CLASS) @interface Slithers {}
    B. @Retention(RetentionPolicy.SOURCE) @interface Slithers {}
    C. @SuppressWarnings @interface Slithers {}
    D. @Target(ElementType.TYPE) @interface Slithers {}
    E. @Target(ElementType.TYPE_USE) @interface Slithers {}
    F. @interface Slithers {}
    G. None of the above

   Using an annotation in a cast operation or object creation is not supported by default and requires @Target to include the TYPE_USE value.
   For this reason, option E is the only correct answer.
   The @Retention annotation has no bearing on targeted usage.
   Also, option C does not compile even if the proper @Target is added, as @SuppressWarnings contains a required element value.
 */

// Slithers declaration
@Target(ElementType.TYPE_USE)
@interface Slithers {

}

@Slithers
class Snake {
    public void ssss() {
        int t = (@Slithers int)2L;
        var s = new @Slithers Snake();
    }
}


public class SnakeChoiceCorrectAnnotation {

}
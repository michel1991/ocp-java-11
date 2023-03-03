package annotations.errors;
import java.lang.annotation.*;

/**
 * Fill in the blank with the value that allows the annotation to be accessible by the JVM in which it is executed?

        A. RetentionPolicy.CLASS
        B. RetentionPolicy.JRE
        C. RetentionPolicy.RUNTIME
        D. RetentionPolicy.SOURCE
        E. RetentionPolicy.LIVE
        F. None of the above

    The @Retention annotation can be applied only to an annotation declaration, not a class declaration, making option F the correct answer.
    Applying it to a class will result in a compiler error. If Corn were an annotation, though, then RetentionPolicy.RUNTIME would be correct.
 */
@Retention(RetentionPolicy.RUNTIME) // __________________
public class CornSomeAnnotationApplyOnInterface {

}
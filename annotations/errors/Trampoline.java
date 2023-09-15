package annotations.errors;
import java.lang.annotation.*;

/**
   How many lines of the following declarations contain a compiler error?
    A. None
    B. One
    C. Two
    D. Three
    E. Four
    F. Five
    
    The declaration of Colors and Bouncy compile without issue.
    The declaration of Trampoline does not compile, though.
    The Bouncy annotation has two required elements, value() and size(),
    so the name of the element valuecannot be dropped.
    For this reason, option B is correct.

 */
enum Colors { RED, BLUE, GREEN }
@Documented
public @interface Bouncy {
    int value();
    Colors color() default Colors.RED;
    double size();
}
@Bouncy(999, size=10.0) class Trampoline {}
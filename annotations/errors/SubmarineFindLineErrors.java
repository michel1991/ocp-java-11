package annotations.errors;
import java.lang.annotation.*;

/**
* Which of the following lines of code do not compile? (Choose all that apply.)
*   A. Line 1.
    B. Line 2.
    C. Line 3.
    D. Line 4.
    E. Line 6.
    F. Line 7.
    G. All of the lines compile.

  If Metal was declared as annotation with the type @interface, then all of the lines of this program would compile, and option G would be correct.
  Since it is instead declared as an interface, the code does not compile.
  Line 3 does not compile because you cannot define an element in an interface.
  If default 0 were removed, it would be interpreted as an abstract method.
  Lines 2 and 4 compile because interfaces can declare constants.
  Finally, lines 6 and 7 do not compile because Metal is not an annotation and cannot be used as one.
*
 */
@Deprecated public interface Metal { // 1:
    static short type = 0; //  2:
    long value() default 2; //   3:
    public boolean lustrous = true; //   4:
} //   5:
@Metal class Submarine {} // 6:
@Metal(10) class Boat {} // 7:

public class SubmarineFindLineErrors {

}

package annotations.errors;
import java.lang.annotation.*;

/**
* Which of the following lines of code do not compile? (Choose all that apply.)
*   A. Line 4
    B. Line 5
    C. Line 6
    D. Line 7
    E. Line 8
    F. All of the lines compile.

   Annotations cannot have constructors, so line 6 does not compile.
   Annotations can have variables, but they must be declared with a constant value.
   For this reason, line 5 does not compile.
   Line 7 does not compile as the element unit is missing parentheses after the element name.
   Lines 8 compiles and shows how to use annotation type with a default value.
 */
enum UnitOfTemp { C, F } // 2:
@interface Snow { boolean value(); } // 3:
@Target(ElementType.METHOD) @interface Cold { // 4:
    private Cold() {} //  5:
    int temperature; //    6:
    UnitOfTemp unit default UnitOfTemp.C; //  7:
    Snow snow() default @Snow(true); //   8:
} //  9:


public interface ColdChoiceInvalidLine {

}
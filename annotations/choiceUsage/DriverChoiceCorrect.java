package annotations.choiceUsage;
import java.lang.annotation.*;

/**
   Which annotations, when applied independently, allow the following program to compile? (Choose all that apply.)
    A. @Driver
    B. @Driver(1)
    C. @Driver(3,4)
    D. @Driver({5,6})
    E. @Driver(directions=7)
    F. @Driver(directions=8,9)
    G. @Driver(directions={0,1})
    H. None of the above

    The annotation declaration includes one required element, making option A incorrect.
    Options B, C, and D are incorrect because the Driver declaration does not contain an element named value().
    If directions() were renamed in Driver to value(), then options B and D would be correct.
    The correct answers are options E and G. Option E uses the shorthand form in which the array braces
    ({}) can be dropped if there is only one element.
    Options C and F are not valid annotation uses, regardless of the annotation declaration.
    In this question, the @Documented and @Deprecated annotations have no impact on the solution.
 */
@Documented @Deprecated
@interface Driver {
    int[] directions();
    String name() default "";
}
 class Taxi {} // _________________

public class DriverChoiceCorrect {

}
package annotations;
/**
   Which annotations, when applied independently, allow the following program to compile? (Choose all that apply.)
    A. @Dance(77)
    B. @Dance(33, 10)
    C. @Dance(value=5, rhythm=2, fast=false)
    D. @Dance(5, rhythm=9)
    E. @Dance(value=5, rhythm=2, track="Samba")
    F. @Dance()
    G. None of the above

    The annotation includes only one required element, and it is named value(),
    so it can be used without an element name provided it is the only value in the annotation.
    For this reason, option A is correct, and options B and D are incorrect.
    Since the type of the value() is an array, option B would work if it was changed to @Dance({33, 10}).
    Option C is incorrect because it attempts to assign a value to fast, which is a constant variable not an element.
    Option E is correct and is an example of an annotation replacing all of the optional values.
    Option F is incorrect, as value() is a required element.
 */
@interface Dance {
    long rhythm() default 66;
    int[] value();
    String track() default "";
    final boolean fast = true;
}
class Sing {
    @Dance(77) String album; // _________________
}

public class DanceChoiceCorrect {

}
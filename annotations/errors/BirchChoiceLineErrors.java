package annotations.errors;
import java.lang.annotation.*; // 1:

/**
   Given the Floats annotation declaration,
   which lines in the Birch class contain compiler errors? (Choose all that apply.)

    A. Line 3
    B. Line 4
    C. Line 5
    D. Line 6
    E. Line 7
    F. Line 8
    G. None of the above. All of the lines compile without issue.

    Line 6 contains a compiler error since the element name buoyancy is required in the annotation.
    If the element were renamed to value() in the annotation declaration,
    then the element name would be optional.
    Line 8 also contains a compiler error.
    While an annotation can be used in a cast operation, it requires a type.
    If the cast expression was changed to (@Floats boolean), then it would compile.
    The rest of the code compiles without issue.


 */

// Floats.java
import java.lang.annotation.*;
@Target(ElementType.TYPE_USE)
public @interface Floats {
    int buoyancy() default 2;
}

// Birch.java
 interface Wood {} // 2:
@Floats class Duck {} // 3:
 @Floats // 4:
class Birch implements @Floats Wood { // 5:
     @Floats(10) boolean mill() { //   6:
         Predicate<Integer> t = (@Floats Integer a) -> a > 10; //  7:
         return (@Floats) t.test(12); //  8:
     } } //  9:


public class BirchChoiceLineErrors {

}
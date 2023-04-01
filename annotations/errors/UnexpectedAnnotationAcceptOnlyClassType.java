package annotations.errors;
import java.lang.annotation.*;

/*
   Which of the following lines of code do not compile? (Choose all that apply.)
    A. Line 3
    B. Line 4
    C. Line 5
    D. Line 6
    E. Line 7
    F. Line 8
    G. All of the lines compile.

   Line 4 does not compile because the default value of an element
   must be a non-null constant expression.
   Line 5 also does not compile because an element type
   must be one of the predefined immutable types: a primitive, String,
   Class, enum, another annotation, or an array of these types. T
   he rest of the lines do not contain any compilation errors.
*/
public class UnexpectedAnnotationAcceptOnlyClassType {
     static class Food {}
    @Inherited public @interface Unexpected {
         public String rsvp() default null; // Line 4
          Food food(); // Line 5
          public String[] dessert();
          final int numberOfGuests = 5;
          long startTime() default 0L;
     }
}
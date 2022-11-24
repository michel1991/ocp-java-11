package annotations;
import java.lang.annotation.*;

/*
* Line 4 does not compile because the default value of an element must be a non-null constant expression.
*  Line 5 also does not compile because an element type must be one of the predefined immutable types: a primitive, String,
* Class, enum, another annotation, or an array of these types. The rest of the lines do not contain any compilation errors.
*/
public class ErrorProoveAssertionAcceptOnlyClassType {
     static class Food {}
    @Inherited public @interface Unexpected {
         public String rsvp() default null;
          Food food();
          public String[] dessert();
          final int numberOfGuests = 5;
          long startTime() default 0L;
     }
}
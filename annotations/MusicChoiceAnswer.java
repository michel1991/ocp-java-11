package annotations;
import java.lang.annotation.*;

/**
  Given the following declarations, which annotations can fill in
   the blank that would allow the code to compile? (Choose three.)
    A. @Music(super="piccolo")
    B. @Music("viola")
    C. @Music(value()="bass")
    D. @Music
    E. @Music(default="flute")
    F. @Music(value="cello")

   Option B is correct and relies on the fact that the singleelementvalue()
   can be used without an element name. Option D is correct
   because the annotation has a default value; therefore,value is optional.
   Option F is correct and uses the correct name for value.
   Options A, C, and E are incorrect because they use the wrong name for the element.

 */
 @interface Music {
    String value() default "violin";
}

class Orchestra {
    @Music("viola") void play() {} // ______________
}

public class MusicChoiceAnswer {
  
}
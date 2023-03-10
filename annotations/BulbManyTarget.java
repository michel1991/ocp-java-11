package annotations;
import java.lang.annotation.*;

/**
 * Fill in the blank with the correct value for @Target that allows the code to compile.
    A. ElementType.METHOD, ElementType.CONSTRUCTOR
    B. ElementType.ANNOTATION_TYPE
    C. ElementType.CONSTRUCTOR, ElementType.TYPE,ElementType.METHOD
    D. ElementType.TYPE_USE
    E. ElementType.LOCAL_VARIABLE, ElementType.FIELD
    F. None of the above

   Option C uses the correct values and allows all three annotations to compile.
   Option A is incorrect because the class declaration usage does not compile.
   Using option B or E does not allow any of the annotations to compile.
   Option D allows the class and constructor annotations to compile, but not the method usage.
 */

@Target({ElementType.CONSTRUCTOR, ElementType.TYPE,ElementType.METHOD}) // ____________________
@interface LightSource {}

@LightSource class Bulb {
    @LightSource void lightSwitch() {}
    @LightSource private Bulb() {}
}


public class BulbManyTarget {

}
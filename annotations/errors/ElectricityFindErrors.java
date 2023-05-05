package annotations.errors;
import java.lang.annotation.*;
import java.lang.annotation.*; // 1: 

/**
 * Given the Electricity annotation, how many lines of the Solar class contain a compiler error?
    A. One.
    B. Two.
    C. Three.
    D. Four.
    E. Five.
    F. Six.
    G. None of the above.

  Line 7 does not compile because the @Target
  annotation with the METHOD value prohibits usage on a class.
  Line 8 does not compile because Electricity is not marked as a repeatable annotation.
  Lines 10 and 11 do not compile because the braces, {},
  are required around the list of elements. The rest of the lines compile.
  Note that the value name is optional since
  there are no required elements beyond the value() element.
 */



  @Target(ElementType.METHOD) // 2:
 public @interface Electricity { // 3: 
    int[] value() default 100; //   4:  
    short type() default 1; //   5:  
} //  6: 
 @Electricity() class Solar { // 7: 
    @Electricity(2) @Electricity(0) void charge() {} //   8: 
    @Electricity(value=9) void turnOn() {} //  9: 
    @Electricity(6,5) void install() {} //   10: 
    @Electricity(value=1,7) void turnOff() {} //     11: 
    @Electricity(value=8) void storePower() {} //    12:
} //  13:


public class ElectricityFindErrors {
    
}
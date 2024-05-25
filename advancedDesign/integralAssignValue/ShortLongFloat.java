package advancedDesign.integralAssignValue;

/**
   Which of these assignments are valid?
    A. short s = 12 ;
        This is valid since 12 can fit into a short and an implicit narrowing conversion can occur.
    B. long g = 012 ;
        012 is a valid octal number.
    C. int i = (int) false;
        Values of type boolean cannot be converted to any other types.
    D. float f = -123;
        Implicit widening conversion will occur in this case.
    E. float d = 0 * 1.5;
        double cannot be implicitly narrowed to a float even though the value is representable by a float.
        
     ----------------------------------------------------
     Note that
    float d = 0 * 1.5f; and float d = 0 * (float)1.5 ; are OK
    
    An implicit narrowing primitive conversion may be used if all of the following conditions are satisfied:
    
    1. The expression is a compile time constant expression of type byte, char, short, or int.
    
    2. The type of the variable is byte, short, or char.
    
    3. The value of the expression (which is known at compile time, because it is a constant expression) is representable in the type of the variable.
    
    Note that implicit narrowing conversion does not apply to long or double.
    So, char ch = 30L; will fail even though 30 is representable in char.
      
     Correct(A,B, D)
 */
public class ShortLongFloat {
    public static void main(String... args){
        short s = 12 ;
        long g = 012 ;
        float f = -123;

    }    
}
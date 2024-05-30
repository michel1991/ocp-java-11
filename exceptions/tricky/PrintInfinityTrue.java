
package exceptions.tricky;
/**
   What will the following code print when compiled and run?
   A.
    Exception
    false
    
   B.
    Exception
    true
    
   C.
    Exception
    <stack trace for a NullPointerException>
    
    D.
    Infinity
    true
    
    E.
    Infinity
    Exception
    <stack trace for a NullPointerException>
   
   -----------------------------------------------------------------------------------------------------------------------
   Integral division i.e. dividing an integer value with 0 will cause an java.lang.ArithmeticException: / by zero to be thrown.
    But a floating point division with 0 (i.e. dividing a float or double value with 0 or 0.0) will
    result in Float.POSITIVE_INFINITY or Float.NEGATIVE_INFINITY (or Double.POSITIVE_INFINITY or Double.NEGATIVE_INFINITY,
    if the operands are double instead of float).
    
    Float and Double classes have the following methods that let you check for infinite values:
    Static methods : Float.isInfinite(float) and Double.isInfinite(double).
    Instance methods: Foat.isInfinite() and Double.isInfinite().
    
    They return true if the value represents positive or negative infinity.
    Correct(D)
    

 */
public class PrintInfinityTrue {
    public static void main(String[] args) {
        Float f1 = 10.0f;
        Float f2 = 0.0f;

        Float f3 = null;
        
        double f = 0.0;
        try{
            f = f1/f2;
            System.out.println(f);
            f3 = f1/f2;
        }catch(Exception e){
            System.out.println("Exception");
        }
        System.out.println(f3.isInfinite());
    }
}
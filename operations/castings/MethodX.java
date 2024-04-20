package operations.castings;

/**
 * What should be the return type of the following method?
    public RETURNTYPE methodX( byte by){
        var d = 10.0;
        return (long) by/d*3;
    }
    
    A. int
    B. long
    C. double
    D. float
    E. byte
    
    1. Since 10.0 is a double value, the type of d will be double.

    2. The cast ((long)) applies to 'by' and not to the whole expression. You may look at it like this:
    ( (long) by ) / d * 3;
    Now, division operation on a long by a double gives you a double. So, the return type should be double.
    Had b been a float, the resulting value would have been a float.
    
    Correct(C)
    
 */
public class MethodX {
    public double  methodX( byte by){
        var d = 10.0;
        return (long) by/d*3;
    }
}
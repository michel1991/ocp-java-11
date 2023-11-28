package numericPromotion.errors;

public class ShortChar {
    /**
     * The following code snippet will print 'true'.
       A. True
       B. False

     
      This will not compile because a short "variable" can never be assigned to a char without explicit casting.
      A short "constant" i.e. a short variable defined as final, can be assigned to a char only if the value fits into a char.

        short s = 1; byte b = s; => this will also not compile because although value is small enough
        to be held by a byte but the Right Hand Side i.e. s is a variable and not a constant.
        
        final short s = 1; byte b = s; => This is fine because s is a constant and the value fits into a byte.
        final short s = 200; byte b = s; => This is invalid because although s is a constant but the value does not fit into a byte.
        
        Implicit narrowing occurs only for byte, char, short, and int. Remember that it does not occur for long, float, or double.
        * So, this will not compile: int i = 129L;
        However, an implicit widening conversion from long to a float or a double is valid:
        
        long l = 10L;
        float f = l; //valid
        double d = l; //valid
        
        (correct is B)
     */
    public static void main(String... args){
        short s = Short.MAX_VALUE;
        char c = s;
        System.out.println( c == Short.MAX_VALUE);
    }
}
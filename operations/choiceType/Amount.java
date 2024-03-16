package operations.choiceType;

public class Amount {
    /**
     * Given the following code snippet:
        A. int
        B. long
        C. only double
        D. double or float
        F. float

       What can XXX be?
       (Correct C)
       Note: decimal value is by default double
       
       here is no need for analyzing the whole code. XXX amount = 1000.0; will be valid only
       if XXX is double because 1000.0 is a double value. float will not work because float is a smaller type than double.

        Note that the options do not include wrapper classes. Otherwise, Double is also valid because of auto boxing.
        
        var would also be valid because compiler would automatically infer the type as double
        from the value 1000.0 that is being assigned to it.
        
        You may want to check out the free video by Dr. Sean Kennedy explaining this question: https://youtu.be/qfBBi10hvRU
       
     */
    public static void main(String... args){
        int rate = 10;
        int t = 5;
        // can be var, Double also
       double  amount = 1000.0; // correct XXX
        for(int i=0; i<t; i++){
            amount = amount*(1 - rate/100);
        }
    }
}
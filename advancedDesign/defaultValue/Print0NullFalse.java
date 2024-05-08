package advancedDesign.defaultValue;

/**
 * What would be the result of trying to compile and run the following program?
    A. The program will fail to compile, because of uninitialized variable 'bool'.
      No, All the instance variables are initialized by default values.
   
    B. The program will throw a java.lang.NullPointerException when run.
     No reason for this at all.
     
    C. The program will print "0 null false".
    D. The program will print "0 null true".
        All the variables, including the array elements, will be initialized to their default values.
        
    E. The program will print null and false but will print junk value for ia[0].
    All the elements of the arrays of primitives are initialized to default values.
    
    Following are the default values that instance variables are initialized with if not initialized explicitly:
        types (byte, short, char, int, long, float, double) to 0 ( or 0.0 ).
    All Object types to null.
    boolean to false.
    
     Correct(C)
    
 */
 class Test{
    int[] ia = new int[1];
    Object oA[]  = new Object[1];
    boolean bool;
    public static void main(String args[]){
        var test = new Test();
        System.out.println(test.ia[0] + "  " + test.oA[0]+"  "+test.bool);
    }
}


public class Print0NullFalse {
    public static void main(String args[]){
        Test.main(args);
    }
}
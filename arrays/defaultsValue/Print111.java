package arrays.declaration.defaultsValue;
/**
 *  What will the following program print?
    A. 111
    B. 222
    C. It will not compile as bA[0] is uninitialized.
    D. It will throw an exception at runtime.
    E. None of the above.
    
    -----------------
    All the arrays are initialized to contain the default values of their type. This means,
    int[] iA = new int[10]; will contain 10 integers with a value of 0.
    Object[] oA = new Object[10]; will contain 10 object references pointing to null.
    boolean[] bA = new boolean[10] will contain 10 booleans of value false.
    So, as bA[0] is false, the if condition fails and str remains 111.
    
     correct(A)

 */
class TestClass{ // public 
    public static void main(String[] args){
        var str = "111";
        boolean[] bA = new boolean[1];
        if( bA[0] ) str = "222";
        System.out.println(str);
    }
}

public class Print111 {
    public static void main(String[] args){
        TestClass.main(args);
    }
}
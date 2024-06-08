package charSequence.errors;

/**
  What will be the result of attempting to compile and run the following program?
   A. Compilation error.
        There is no reverse() method in String class.
   B. It will print 'Equal'.
   C. It will print 'Not Equal'.
   C. Runtime error.
   D.  None of the above.
   
    ---------
     Correct(A)

 */
 class TestClass{ // public
    public static void main(String args[ ] ){
        String s = "hello";
        StringBuilder sb = new StringBuilder( "hello" );
        sb.reverse();
        s.reverse();
        if( s == sb.toString() )  System.out.println( "Equal" );
        else System.out.println( "Not Equal" );
    }
}

public class HelloNotReverseMethod {
    
}
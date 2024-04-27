package arrays.tricky;

/**
 *  What will be the result of trying to compile and execute the following program?
   A.  It will throw ArrayIndexOutOfBoundsException at Runtime.
   B.  Compile time Error.
   C.  It will print 10 20 30
   D.  It will print 30 20 30
   E.  It will print 0 20 30
  
  explanation:
  The statement iA[i] = i = 30 ; will be processed as follows:
    iA[i] = i = 30; => iA[0] = i = 30 ;  =>  i = 30; iA[0] = i ; =>   iA[0] = 30 ;
    
    Here is what JLS says on this:
    1 Evaluate Left-Hand Operand First  
    2 Evaluate Operands before Operation  
    3 Evaluation Respects Parentheses and Precedence  
    4 Argument Lists are Evaluated Left-to-Right  
    
    For Arrays: First, the dimension expressions are evaluated, left-to-right. If any of the expression evaluations completes abruptly,
    the expressions to the right of it are not evaluated.
   Correct(D)
    
 */
class TestClass{ // public
    public static void main(String args[] ){
        var i = 0 ;
        int[] iA = {10, 20} ;
        iA[i] = i = 30 ;
        System.out.println(""+ iA[ 0 ] + " " + iA[ 1 ] + "  "+i) ;
    }
}

public class Print302030 {
    public static void main(String args[] ){
        TestClass.main(args);
    }
}
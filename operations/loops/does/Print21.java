package operations.loops.does;

/**
    What will the following code print when compiled and run:
    
    A.
       1
       
    B.
       1
       0
       
    C.
       2
       1
       
       ----
       
       --k>0 implies, decrement the value of k and then compare with 0. Therefore, the loop will only execute twice, printing 2 and 1.

        Had it been k-->0, it would imply, first compare k with 0, and then decrement k.
        In this case, the loop would execute thrice, printing 2, 1, and 0.
       
    D.
       2
       1
       0
       
    E. It will keeping printing numbers in an infinite loop.

    F. It will not compile.
    
    ---
      Correct(C)

 */
 class TestClass { // public
    
    public static void main(String[] args){
        var k = 2;
        do{
            System.out.println(k);
        }while(--k>0);
    }
}

public class Print21 {
    
    public static void main(String[] args){
        TestClass.main(args);
    }
}
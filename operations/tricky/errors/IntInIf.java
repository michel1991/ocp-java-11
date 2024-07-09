package operations.tricky.errors;

/**
   What will the following program print?
   A. Good
   B. Bad
   C.  Exception at runtime saying division by Zero.
   
   D.  It will not compile.
      You need a boolean in the 'if' condition.
      Here, compiler sees that there is no way x/y can produce a boolean so it generates an error at compile time.
      
   F. None of the above.
   
   Correct(D)

 */
public class TestClass{
    public static void main(String[] args){
       int x = 1;
       int y = 0;
       if( x/y ) System.out.println("Good");
       else  System.out.println("Bad");
    }
  }

public class IntInIf {
   public static void main(String[] args){
      
   }
}
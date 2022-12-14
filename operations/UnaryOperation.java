package operations;

public class UnaryOperation {
    /**
    *  What is the result of the following code snippet?
        A. -1
        B. 9
        C. 81
        D. 90
        E. The code will not compile because of line 4.

       The code compiles and runs without issue, so option E is incorrect.
       The pre-increment operator is applied to x, resulting in a value of 9 * (long)10.
       The upcast to long is unnecessary here—the result will be upcast to long after the multiplication.
       The result is a value of 90, so option D is the correct answer.
     */
   static void print90(){
        System.out.println("begin print 90");
       var x = 9; // 3:
       long y = x * (long) (++x); //  4:
       System.out.println("\t" + y); //   5:
       System.out.println("End print 90");
   }

    public static void main(String... args){
        print90();
    }
}
package operations.unary;

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

    /**
    *  What are the outputs of the following code snippet?
        A. 5 4
        B. 14 5
        C. 4 5
        D. 16 5
        E. 14 4
        F. The code does not compile.

        The code compiles, so option F is incorrect.
        We start with webby having a value of 2. On line 4, we increment webby to 4 and store the same value in georgette.
        On line 5, we multiple webby by 3, resulting in a value of 12 for webby.
        Line 7 is where things get interesting, though.
        Although this might look like an equality (==) test, the assignment operator (=) is used, resulting in both variables now having the same value as georgette, which is 4.
        The return value of this assignment also has a value of 4, and since 4>3, webby is then incremented by 1.
        The final result is webby has a value of 5, and georgette has a value of 4, making option A the correct answer.

     */
    static void printFiveAndFour(){
        System.out.println("begin print 5 4");
        long webby = 2; // 4:
        int georgette = (int)(webby += 2); // 5:
        webby *= 3; //  6:
        if((webby = georgette)>3) ++webby; //  7:
        System.out.println(webby + " " + georgette); //  8:
        System.out.println("End print 5 4");
    }

    /**
      What is the value of tip after executing the following code snippet?
         A. 1
         B. 2
         C. 3
         D. 7
         E. None of the above

         In a ternary expression, only one of the two right-most expressions is evaluated.
         Since meal˃6 is false, tip-- is evaluated, and tip++ is skipped.
         The result is that tip is changed from 2 to 1,
         making option A the correct answer.
         The value of total is 7, since the post-decrement
         operator was used on tip, although you did not need to know this to solve the question.
     */
    static void meal(){
        int meal = 5;
        int tip = 2;
        var total = meal + (meal > 6 ? tip++ : tip--);
    }

    public static void main(String... args){
        print90();
    }
}
package operations.unary;

public class UnaryOperation {


    

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


}
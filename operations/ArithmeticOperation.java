package operations;
public class ArithmeticOperation {

    /**
    * First off, the * and % have the same operator precedence,
    * so the expression is evaluated from left to right unless parentheses are present.
    * The first expression evaluates to 8 % 3, which leaves a remainder of 2.
    * The second expression is just evaluated left to right since * and % have the same operator precedence,
    * and it reduces to 6 % 3, which is 0. The last expression reduces to 5 * 1, which is 5. Therefore,
    * the output on line 6 is 2-0-5, making option D the correct answer.
     */
    static class ArithmeticSample
    {
         public static void compute() {
                int sample1 = (2 * 4) % 3;
                int sample2 = 3 * 2 % 3;
                int sample3 = 5 * (1 % 2);
              System.out.println(sample1+"-"+sample2+"-"+sample3);
           }
    }

    /**
    * The first expression is evaluated from left to right since the operator precedence of & and ^ is the same,
    * letting us reduce it to false ^ sunday, which is true, because sunday is true. In the second expression,
    * we apply the negation operator, !, first, reducing the expression to sunday && true, which evaluates to true.
    *  The last expression returns true if both of the previous values are false. Since neither is false,
    * the output is false. For these reasons, option F is the correct answer.
     */
    static void complexBoolean(){
        boolean sunny = true, raining = false, sunday = true;
        boolean goingToTheStore = sunny & raining ^ sunday;
        boolean goingToTheZoo = sunday && !raining;
        boolean stayingHome = !(goingToTheStore && goingToTheZoo);
        System.out.println(goingToTheStore + "-" + goingToTheZoo + "-" +stayingHome);
    }

    /**
    * The starting values of ticketsTaken and ticketsSold are 1 and 3, respectively.
    * After the first compound assignment, ticketsTaken is incremented to 2.
    * The ticketsSold value is increased from 3 to 5 since the post-increment operator was used the value of ticketsTaken++ returns 1.
    * On the next line, ticketsTaken is doubled to 4. On the final line, ticketsSold is increased by 1 to 6.
    * The final values of the variables are 4 and 6, for ticketsTaken and ticketsSold, respectively, making options C and F the correct answers.
    * Note the last line does not trigger a compilation error as the compound operator automatically casts the right-hand operand.
    */
    public static void sumAndCompound(){
        int ticketsTaken = 1;
        int ticketsSold = 3;
        ticketsSold += 1 + ticketsTaken++;
        System.out.println();
        ticketsTaken *= 2;
        ticketsSold += (long)1;
        System.out.println("ticketsTaken: " + ticketsTaken + " ticketsSold: " + ticketsSold);
    }

    /**
    * What are the unique outputs of the following code snippet? (Choose all that apply.)
    *
    * The code compiles without issue, so option G is incorrect.
    * In the first expression, a > 2 is false, so b is incremented to 5 but since the post-increment operator is used, 4 is printed, making option D correct.
    * The --c was not applied, because only one right side of the ternary expression was evaluated. In the second expression, a!=c is false since c was never modified.
    * Since b is 5 due to the previous line and the post-increment operator is used, b++ returns 5.
    *  The result is then assigned to b using the assignment operator, overriding the incremented value for b and printing 5, making option E correct.
    * In the last expression, parentheses are not required but lack of parentheses can make ternary expressions difficult to read.
    *  From the previous lines, a is 2, b is 5, and c is 2. We can rewrite this expression with parentheses as (2 > 5 ? (5 < 2 ? 5 : 2) : 1).
    * The second ternary expression is never evaluated since 2 > 5 is false, and the expression returns 1, making option A correct.
     */
    public static void complexTernary(){
        int a = 2, b = 4, c = 2;
        System.out.println(" begin complexTernary ");
        System.out.println(a > 2 ? --c : b++);
        System.out.println(b = (a!=c ? a : b++));
        System.out.println(a > b ? b < c ? b : 2 : 1);
        System.out.println(" end complexTernary ");


    }

    public static void main(String[] args) {
        new ArithmeticSample().compute();
        new ArithmeticOperation.ArithmeticSample().compute();
        System.out.println();
        complexBoolean();
        System.out.println();
        sumAndCompound();
        System.out.println();
        complexTernary();
    }

}
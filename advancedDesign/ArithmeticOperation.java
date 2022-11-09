package advancedDesign;
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

    public static void main(String[] args) {
        new ArithmeticSample().compute();
        new ArithmeticOperation.ArithmeticSample().compute();
    }

}
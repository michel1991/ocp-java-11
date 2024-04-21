package operations.ternary;
public class ComplexTernary {
    /**
        * What are the unique outputs of the following code snippet? (Choose all that apply.)
            A. 1
            B. 2
            C. 3
            D. 4
            E. 5
            F. 6
            G. The code does not compile.
    
            The code compiles without issue, so option G is incorrect.
            In the first expression, a > 2 is false, so b is incremented to 5 but since the post-increment operator is used, 4 is printed, making option D correct.
            The --c was not applied, because only one right side of the ternary expression was evaluated. In the second expression, a!=c is false since c was never modified.
            Since b is 5 due to the previous line and the post-increment operator is used, b++ returns 5.
            The result is then assigned to b using the assignment operator, overriding the incremented value for b and printing 5, making option E correct.
            In the last expression, parentheses are not required but lack of parentheses can make ternary expressions difficult to read.
            From the previous lines, a is 2, b is 5, and c is 2. We can rewrite this expression with parentheses as (2 > 5 ? (5 < 2 ? 5 : 2) : 1).
            The second ternary expression is never evaluated since 2 > 5 is false, and the expression returns 1, making option A correct.
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
        complexTernary();
    }
}
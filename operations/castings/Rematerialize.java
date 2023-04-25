package operations.castings;

/**
 * What is the output of the following application?
    A. 9
    B. 11
    C. 12
    D. 15
    E. The code does not compile.
    F. None of the above.
    
    The code compiles and runs without issue, making option E incorrect.
    In this example, partA is the integer division of the two numbers.
    Since 3 does not divide 11 evenly, it is rounded down to 3.
    The variable partB is the remainder from the first expression, which is 2.
    The results are added together, resulting in the expression 3 * 5, or 15,
    and making option D correct.
 */
public class Rematerialize {
    public static void main(String[] input) {
        int init = 11;
        int split = 3;
        int partA = init / split;
        int partB = init % split;
        int result = split * (partB + partA);
        System.out.print(result);
    }
}
package scope;

/**
 *  What is the output of the following application?
    A. 2 5
    B. 8 5
    C. 6 5
    D. The code does not compile.
    E. None of the above.
    
    The code compiles, so option D is incorrect.
    The input to the constructor is ignored, making the assignment of end to be 4.
    Since start is 2, the subtraction
    of 4 by 2 results in the application printing 2, followed by 5, making option A the correct answer.
 */
public class Airplane {
    static int start = 2;
    final int end;
    public Airplane(int x) {
        x = 4;
        end = x;
    }
    public void fly(int distance) {
        System.out.print(end-start+" ");
        System.out.print(distance);
    }
    public static void main(String... start) {
        new Airplane(10).fly(5);
    }
}
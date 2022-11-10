package operations;
import java.util.*;

/**
* Option C is incorrect because there is no method named squareRoot.
* There is a sqrt() method; however, you aren’t expected to know it for the exam.
* Options A and D are incorrect because they do not cast to double. 1/2 is integer division, which results in 0 rather than one half.
* Option F is incorrect for the same reason. The cast occurs after all the math has already been done.
* By contrast, option E is correct because the cast to double occurs on the number 1.
* Therefore, dividing by 2 properly results in one half. Options B and E correctly represent the formulas described in the question.
 */
public class TriangleCasting {
    public static double pythagorean(int a, int b) {
        // A. Math.pow(Math.pow(a, 2) + Math.pow(b, 2), 1/2)
        var result = Math.pow(Math.pow(a, 2) + Math.pow(b, 2), .5); // B
        return result;
    }
    public static double area(int base, int height) {
        // D (1/2) * (base*height);
        // F (double) (1/2) * (base*height)
        return ((double)1/2) * (base*height); // E
    }

    public static void main(String... args) {
        var math = new ArrayList<>();
        math.add(pythagorean(3, 4));
        math.add(area(3, 8));
        System.out.println(math);
    }

}
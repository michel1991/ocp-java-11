package overloadWhithoutInheritance;

/**
 *  What is the output of the method that main() calls?
 *  A. longs
    B. nums
    C. shorts
    D. varargs
    E. The code does not compile.

    This code is tricky.
    Java picks the most specific method signature it can find in an overloading situation.
    Normally, that would be the one with the two int parameters.
    However, that method is an instance method,
    and the main() method is looking for a static method.
    The next choice is the varargs one, making option D the answe
 */
public class Hippo {
    private static void hippo(short num1, short num2) {
        System.out.println("shorts");
    }
    private static void hippo(int... nums) {
        System.out.println("varargs");
    }
    private void hippo(long num1, long num2) {
        System.out.println("longs");
    }
    private void hippo(int num1, int num2) {
        System.out.println("nums");
    }
    public static void main(String... args) {
        hippo(1, 5);
    }
}

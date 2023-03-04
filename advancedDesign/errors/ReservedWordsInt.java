package advancedDesign.errors;
public class ReservedWordsInt {
    /**
     * Given the following method, what is the first line that does not compile?
        A. k1
        B. k2
        C. k3
        D. k4
        E. k5

        Integer is the name of a class in Java.
        While it is bad practice to use the name of a class as your local variable name, this is legal.
        Therefore, k1 does compile. It is not legal to use a reserved word as a variable name.
        All of the primitives including int are reserved words.
        Therefore, k2 does not compile, and option B is the answer.
        Lines k4 and k5 don’t compile either, but the question asks about the first line to not compile.
     */
    public static void main(String[] args) {
        int Integer = 0;        // k1
        Integer int = 0;        // k2
        Integer ++;             // k3
        int++;                  // k4
        int var = null;         // k5
    }
}
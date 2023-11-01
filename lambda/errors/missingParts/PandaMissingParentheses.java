package lambda.errors.missingParts;
import java.util.function.*; // 1

/**
*   What is the result of the following class?
    A. match
    B. not match
    C. Compiler error on line 8
    D. Compiler error on lines 10 and 11
    E. Compile error on lines 12 and 13
    F. A runtime exception is thrown.

    Line 8 is missing parentheses around the parameter list.
    In a lambda, the parentheses are allowed to be omitted only when there is one parameter and its type is not declared.
 */
//2:
class Panda { // 3:
    int age; //  4:
    public static void main(String[] args) { //  5:
        Panda p1 = new Panda(); //  6:
        p1.age = 1; //  7:
        check(p1, Panda p -> p.age < 5); //  8:
    }  // 9:
    private static void check(Panda panda, //  10:
                              Predicate<Panda> pred) { //  11:
        String result = pred.test(panda) //  12:
        ? "match" : "not match"; //  13:
        System.out.print(result); //  14:
    } } // 15:

public class PandaMissingParentheses {

}
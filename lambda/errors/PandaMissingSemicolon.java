package lambda.errors;
import java.util.function.*; //1

/**
 * What is the result of the following class?
    A. match
    B. not match
    C. Compiler error on line 8.
    D. Compiler error on line 10.
    E. Compile error on line 12.
    F. A runtime exception is thrown.

    Line 8 uses braces around the body.
    This means the return keyword and semicolon are required.

 */

//2:
class Panda { // 3:
    int age; //  4:
    public static void main(String[] args) { //   5:
        Panda p1 = new Panda(); //  6:
        p1.age = 1; //  7:
        check(p1, p -> {p.age < 5}); //  8:
    } //  9:
    private static void check(Panda panda, //  10:
                              Predicate<Panda> pred) { // 11:
        String result = pred.test(panda) // 12:
            ? "match" : "not match"; //  13:
        System.out.print(result); //  14:
    } } // 15:
public class PandaMissingSemicolon {

}
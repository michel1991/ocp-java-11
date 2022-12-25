package operations.errors;

/**
 * What is the result of executing the following program?
    A. 5 - 3.0 - 5
    B. 6 - 3.0 - 3
    C. 5 - 2.0 - 3
    D. 4 - 2.0 - 4
    E. The program does not compile due to line 4.
    F. The program does not compile for some other reason.
    G. The program compiles but throws an exception at runtime.

   The code does not compile because of line 5. The cast operator is applied to lion,
    resulting in a type value of long. Because the cast operator is unary, it is not applied to the 1.0f,
    which means the addition operator (+) promotes the entire expression to a float.
    The result is an attempt to store a float value in a long variable tiger,
    resulting in a compiler error and making option F the correct answer.
    If parentheses were added around (lion + 1.0f), then the rest of the code would compile, run, and print 5 - 2.0 - 3,
     and option C would be the correct answer.
 */
class Jungle { // 1:
    public static void main(String... zoo) { //  2:
        short cheetah = 4; // 3:
        double lion = (int)cheetah++ - 2; //  4:
        final long tiger = (long)lion + 1.0f; //    5:
        System.out.println(cheetah+" - "+lion+" - "+tiger); //  6:
    } } // 7:
public class JungleFloatGreatThanLong {

}
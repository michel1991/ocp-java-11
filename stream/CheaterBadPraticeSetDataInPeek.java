package stream;
import java.util.stream.*;
import java.util.*;


/**
 * Which of the following fills in the blank so that the code outputs one line but uses a poor practice?
    A. peek(System.out::println)
    B. peek(System.out::println).findFirst()
    C. peek(r -˃ System.out.println(r)).findFirst()
    D. peek(r -˃ {count++; System.out.println(r); }).findFirst()
    E. None of the above compile.
    F. None of these are bad practice.

    Option A is incorrect because it doesn’t print out one line.
    The peek() method is an intermediate operation.
    Since there is no terminal operation, the stream pipeline is not executed,
    so the peek() method is never executed, and nothing is printed.
    Options B and C are incorrect because they correctly
    output one line using a method reference and lambda,
    respectively, and don’t use any bad practices.
    Option D is the correct answer. It does output one line.
    However, it is bad practice to have a peek() method that has side effects like modifying a variable.
 */
class Cheater {
    int count = 0;
    public void sneak(Collection<String> coll) {
        coll.stream(). peek(r -> {count++; System.out.println(r); }).findFirst(); //_____________________________;
    }

    public static void main(String[] args) {
        var c = new Cheater();
        c.sneak(Arrays.asList("weasel"));
    }
}

public class CheaterBadPraticeSetDataInPeek {

}
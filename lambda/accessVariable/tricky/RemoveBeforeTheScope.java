
package lambda.accessVariable.tricky;
import java.util.*;

public class RemoveBeforeTheScope {

    /**
    *  Which of the following can be inserted without causing a compilation error? (Choose all that apply.)
        A. char start = 'a';
        B. char c = 'x';
        C. chars = null;
        D. end = '1';
        E. None of the above

       Lambdas are not allowed to redeclare local variables, making options A and B incorrect.
       Option D is incorrect because setting end prevents it from being effectively final.
       Lambdas are only allowed to reference effectively final variables.
       Option C is tricky because it does compile but throws an exception and runtime.
       Since the question only asks about compilation, option C is correct.
     */
    public void removeBefore(List<Character> chars) {
        char end = 'z';
        // INSERT LINE HERE
        chars = null;
        chars.removeIf(c -> {
            char start = 'a'; return start <= c && c <= end; });
    }
}
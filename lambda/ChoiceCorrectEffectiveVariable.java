
package lambda;
import java.util.*;

public class ChoiceCorrectEffectiveVariable {
    /**
    *  Which of the following can be inserted without causing a compilation error? (Choose all that apply.)
    *   A. char start = 'a';
        B. char c = 'x';
        C. chars = null;
        D. end = '1';
        E. None of the above

      Since the scope of start and c is within the lambda, the variables can be declared after it without issue, making options A, B, and C correct.
      Option D is incorrect because setting end prevents it from being effectively final. Lambda are only allowed to reference effectively final variables.
     */
    public static void remove(List<Character> chars) {
        char end = 'z';
        chars.removeIf(c -> {
            char start = 'a'; return start <= c && c <= end; });
        // INSERT LINE HERE
        char c = 'x';
        char start = 'a';
        chars = null;
    }

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

    public static void main(String... args){
        remove(new ArrayList<Character>());
    }
}
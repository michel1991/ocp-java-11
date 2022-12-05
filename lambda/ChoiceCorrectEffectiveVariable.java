
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

    public static void main(String... args){
        remove(new ArrayList<Character>());
    }
}
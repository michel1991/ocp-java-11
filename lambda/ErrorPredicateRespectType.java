package lambda;
import java.util.function;
public class ErrorPredicateRespectType {
    private static boolean test(Predicate<Integer> p) {
        return p.test(5);
    }

    public static void main(String[] args) {
        System.out.println(____________________________);
        test((int i ) -> i ==5);
        test((int i ) -> {
            return i == 5;
        });
    }

}
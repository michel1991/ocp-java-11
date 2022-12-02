package list;
import java.util.*;
public class LimitContentWithGenerics {
    /**
    *  Which of these statements compile? (Choose all that apply.)
    *   A. HashSet<Number> hs = new HashSet<Integer>();
        B. HashSet<? super ClassCastException> set = new HashSet<Exception>();
        C. List<> list = new ArrayList<String>();
        D. List<Object> values = new HashSet<Object>();
        E. List<Object> objects = new ArrayList<? extends Object>();
        F. Map<String, ? extends Number> hm = new HashMap<String, Integer>();
        Option A does not compile because the generic types are not compatible.
        We could say HashSet<? extends Number> hs2 = new HashSet<Integer>();.
        Option B uses a lower bound, so it allows superclass generic types.
        Option C does not compile because the diamond operator is allowed only on the right side.
        Option D does not compile because a Set is not a List.
        Option E does not compile because upper bounds are not allowed when instantiating the type.
        Finally, option F does compile because the upper bound is on the correct side of the =.
     */
    static void choiceCorrectFirst(HashSet<? super ClassCastException> set, Map<String, ? extends Number> hm){
      }

    public static void main(String... args){
        HashSet<? super ClassCastException> set = new HashSet<Exception>();
        Map<String, ? extends Number> hm = new HashMap<String, Integer>();
        choiceCorrectFirst(set, hm);
    }
}
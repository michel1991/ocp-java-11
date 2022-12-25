package list;
import java.util.*;
import java.io.*;
import java.sql.*;
import java.time.*;

/**
*  Which of these statements can fill in the blank so that the Wildcard class compiles successfully? (Choose all that apply.)
    A. List<?> list = new HashSet <String>()
    B. ArrayList<? super Date> list = new ArrayList<Date>()
    C. List<?> list = new ArrayList<?>()
    D. List<Exception> list = new LinkedList<java.io.IOException>()
    E. ArrayList <? extends Number> list = new ArrayList <Integer>()
    F. None of the above

    The showSize() method can take any type of List since it uses an unbounded wildcard.
    Option A is incorrect because it is a Set and not a List.
    Option C is incorrect because the wildcard is not allowed to be on the right side of an assignment.
    Option D is incorrect because the generic types are not compatible.
    Option B is correct because a lower-bounded wildcard allows that same type to be the generic.
    Option E is correct because Integer is a subclass of Number.
 */
class Wildcard { // 3:
    public void showSize(List<?> list) { //   4:
        System.out.println(list.size()); //   5:
    } //  6:
    public static void main() { //  7:
        Wildcard card = new Wildcard(); //  8:
        ArrayList<? super java.util.Date> list = new ArrayList<java.util.Date>() ; //      9: ____________________________________
        card.showSize(list); //  10:
    } } //   11:

public class LimitContentWithGenerics {
    /**
    *  Which of these statements compile? (Choose all that apply.)
        A. HashSet<Number> hs = new HashSet<Integer>();
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

    /**
        Which of the following statements can fill in the blank to make the code compile successfully? (Choose all that apply.)
         Set<? extends RuntimeException> mySet = new _________();

            A. HashSet<? extends RuntimeException>
            B. HashSet<Exception>
            C. TreeSet<RuntimeException>
            D. TreeSet<NullPointerException>
            E. None of the above

          The mySet declaration defines an upper bound of type RuntimeException.
          This means that classes may specify RuntimeException or any subclass of RuntimeException as the type parameter.
          Option B is incorrect because Exception is a superclass, not a subclass, of RuntimeException.
          Option A is incorrect because the wildcard cannot occur on the right side of the assignment.
          Options C and D compile and are the answers. For more information, see Chapter 3.

     */
    static void maxRuntimeException(){
        // TreeSet<NullPointerException>
        Set<? extends RuntimeException> mySet = new TreeSet<RuntimeException>(); //  _________

    }

    /**
     * Which of the following statements compile about the java.util and java.sql packages? (Choose all that apply.)

        A. List<? extends Statement> list1 = new ArrayList<>();
        B. List<? implements Statement> list2 = new ArrayList<>();
        C. List<? extends Statement> list3 = new ArrayList()<>;
        D. List<? implements Statement> list4 = new ArrayList()<>;
        E. List<? extends Statement> list5 = new ArrayList();
        F. List<? extends Statement> list6 = new List();

        Option A creates a List that can contain any implementation of the Statement interface.
        Option E does the same without specifying the generic type.
        Option B is incorrect because generic declarations use extends rather than implements regardless
        of whether classes or interfaces are specified. Option C is incorrect because the
        diamond operator must come before the parentheses. Option D is incorrect for both of these reasons.
         Option F is incorrect because List is an interface and cannot be instantiated.
     */
    public static void limitWithStatement(){
        List<? extends Statement> list1 = new ArrayList<>();
        List<? extends Statement> list5 = new ArrayList();
    }

    public static void main(String... args){
        HashSet<? super ClassCastException> set = new HashSet<Exception>();
        Map<String, ? extends Number> hm = new HashMap<String, Integer>();
        choiceCorrectFirst(set, hm);
    }
}
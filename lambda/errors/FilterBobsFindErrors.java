package lambda.errors;
import java.util.*;
import java.util.function.*;

/**
 *  What is the result of compiling and running the following application?
    A. It prints two lines.
    B. It prints three lines.
    C. One line of code does not compile.
    D. Two lines of code do not compile.
    E. Three lines of code do not compile.
    F. The code compiles but prints an exception at runtime.
    
    The code does not compile, so options A, B, and F are incorrect.
    The first compilation error is in the declaration of the lambda expression for second.
    It does not use a generic type, which means t is of type Object.
    Since equalsIgnoreCase() expects a String as a parameter,
    the lambda expression does not compile.
     The second compilation issue is in the lambda expression in the main() method.
     Notice that process() takes an ApplyFilter instance,
    and ApplyFilter is a functional interface that takes a List<String> object.
    For this reason, q in this lambda expression is treated
    as an instance of List<String>.
    The forEach() method defined in Collections requires a Consumer instance,
    not a Function, so the call q.forEach(first) does not compile.
    For these two reasons, option D is the correct answer,
    since the rest of the code compiles without issue.

 */
interface ApplyFilter {
    void filter(List<String> input);
}
 class FilterBobs {
    static Function<String,String> first = s ->
    {System.out.println(s); return s;};
    static Predicate second = t -> "bob".equalsIgnoreCase(t);
    public void process(ApplyFilter a, List<String> list) {
        a.filter(list);
    }
    public static void main(String[] contestants) {
        final List<String> people = new ArrayList<>();
        people.add("Bob");
        people.add("bob");
        people.add("Jennifer");
        people.add("Samantha");
        final FilterBobs f = new FilterBobs();
        f.process(q -> {
            q.removeIf(second);
            q.forEach(first);
            }, people);
    }
}

public class FilterBobsFindErrors {
    
}
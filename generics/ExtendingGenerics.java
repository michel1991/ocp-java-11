package generics;
import java.util.*;
import java.io.*;

/**
 *  Which fills in the blank in the method signature to allow this code to compile?
    A. ? extends Collection
    B. ? implements Collection
    C. T extends Collection
    D. T implements Collection
    E. None of the above
    
    The ? is an unbounded wildcard. It is used in variable references
    but is not allowed in declarations. In a static method,
    the type parameter specified inside the <> is used in the rest of the method declaration.
    Since it needs an actual name, options A and B are incorrect.
    We need to specify a type constraint so we can call the add() method.
    Regardless of whether the type is a class or interface,
    Java uses the extends keyword for generics. Therefore, option D is incorrect, and option C is the answer.
 */
public class ExtendingGenerics {
    private static <T extends Collection, U> U add(T list, U element) { // <____________ , U>
        list.add(element);
        return element;
    }
    
    public static void main(String[] args) {
        var values = new ArrayList<String>();
        add(values, "duck");
        add(values, "duck");
        add(values, "goose");
        System.out.println(values);
    }
}
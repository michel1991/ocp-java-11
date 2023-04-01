package generics;

/**
  Which options can fill in the blanks to print Cleaned 2 items?
    A. extends, ArrayList
    B. extends, List
    C. super, ArrayList
    D. super, List
    E. None of the above

    Options A and C are incorrect because a generic type cannot be assigned
    to another direct type unless you are using upper or lower bounds in that statement.
    Now, we just have to decide whether a lower or upper bound is correct for the T formal type parameter in Wash.
    The clue is that the method calls size(). This method is available on Collection,
    and all classes that extend/implement it. Therefore, option B is correct.
 */
import java.util.*;
class Wash<T extends Collection> { // <T ________ Collection˃ 
    T item;
    public void clean(T items) {
        System.out.println("Cleaned " + items.size() + " items");
    }
}
class LaundryTime {
    public static void main(String[] args) {
        Wash<List> wash = new Wash<List>(); // _________________
        wash.clean(List.of("sock", "tie"));
    }
}
public class LaundryTimeWithCollections {
    public static void main(String[] args) {
        LaundryTime.main(args);
    }
}
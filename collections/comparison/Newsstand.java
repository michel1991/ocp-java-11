package list.comparison;
import java.util.*;

/**
 * What is the output of the following?
    A. highlights
    B. Newsweek
    C. The code does not compile.
    D. The code compiles but throws an exception at runtime.

    This code shows a proper implementation of Comparable.
    It has the correct method signature. It compares the magazine names in alphabetical order.
    Remember that uppercase letters sort before lowercase letters.
    Since Newsweek starts with uppercase, option B is correct.

 */
class Magazine implements Comparable<Magazine>{
    private String name;
    public Magazine(String name) {
        this.name = name;
    }
   @Override
   public int compareTo(Magazine m) {
        return name.compareTo(m.name);
    }
   @Override
   public String toString() {
        return name;
    }
}
public class Newsstand {
    public static void main(String[] args) {
        var set = new TreeSet<Magazine>();
        set.add(new Magazine("highlights"));
        set.add(new Magazine("Newsweek"));
        set.add(new Magazine("highlights"));
        System.out.println(set.iterator().next());
    }
}
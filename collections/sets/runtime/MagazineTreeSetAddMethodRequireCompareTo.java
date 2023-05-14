package collections.sets.runtime;
import java.util.*;

/**
   What is the output of the following?
    A. highlights
    B. Newsweek
    C. null
    D. The code does not compile.
    E. The code compiles but throws an exception at runtime.

    The Magazine class doesn’t implement Comparable<Magazine>.
    It happens to implement the compareTo() method properly,
    but it is missing actually writing implements Comparable.
    Since TreeSet doesn’t look to see if the object can be compared until runtime,
    this code throws a ClassCastException when TreeSet calls add(), so option E is correct.
 */
class Magazine {
    private String name;
    public Magazine(String name) {
        this.name = name;
    }
    public int compareTo(Magazine m) {
        return name.compareTo(m.name);
    }
    public String toString() {
        return name;
    }
}
 class Newsstand {
    public static void main(String[] args) {
        var set = new TreeSet<Magazine>();
        set.add(new Magazine("highlights"));
        set.add(new Magazine("Newsweek"));
        set.add(new Magazine("highlights"));
        System.out.println(set.iterator().next());
    }
}


public class MagazineTreeSetAddMethodRequireCompareTo {
    public static void main(String[] args) {
        Newsstand.main(args);
    }
}
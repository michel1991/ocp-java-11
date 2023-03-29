package interfaces;

/**
 * What is the output of the following application?
    A. 2 10
    B. 5 10
    C. The code does not compile because of line n1.
    D. The code does not compile because of line n2.
    E. The code does not compile because of line n3.
    F. The code does not compile because of line n4.

    The code compiles without issue. The main() method creates an instance
    of an anonymous class of Ready. Calling r.first retrieves
    the static variable within Ready, printing 2 on line n3. On line n2,
    there is no reference so the static variable of GetSet is called,
    printing 10. For these reasons, option A is correct.
 */
interface Ready {
    static int first = 2;
    final short DEFAULT_VALUE = 10;
    GetSet go = new GetSet();            // n1
}
 class GetSet implements Ready {
    int first = 5;
    static int second = DEFAULT_VALUE;   // n2
    public static void main(String[] begin) {
        var r = new Ready() {};
        System.out.print(r.first);        // n3
        System.out.print(" " + second);   // n4
    }
}

public class GetSetOverrideMethod {
    public static void main(String[] begin) {
        GetSet.main(begin);
    }
}
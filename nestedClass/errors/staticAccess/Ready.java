package nestedClass.errors.staticAccess;

/**
 What is the output of the following application?

    A. 2, 5
    B. 5, 10
    C. 2, 10
    D. The code does not compile because of the GetSet class declaration.
    E. The code does not compile for another reason.
    
    The final variable DEFAULT_VALUE is not a static variable;
    therefore, the static nested class GetSet cannot access it without a reference to the class.
    For this reason, the declaration of the static nested class GetSet does not compile,
    and option D is the correct answer. The rest of the code compiles without issue.
    If the DEFAULT_VALUE variable was modified to be static,
    then the code would compile and print 5, 10 at runtime.

 */
public class Ready {
    protected static int first = 2;
    private final short DEFAULT_VALUE = 10;
    private static class GetSet {
        int first = 5;
        static int second = DEFAULT_VALUE;
    }
    private GetSet go = new GetSet();
    public static void main(String[] begin) {
        Ready r = new Ready();
        System.out.print(r.go.first);
        System.out.print(", "+r.go.second);
    }
}

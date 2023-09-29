package enums.errors;

/**
  What is the result of the following program?
    A. 0 1 2
    B. 1 2 3
    C. Exactly one line of code does not compile.
    D. More than one line of code does not compile.
    E. The code compiles but produces an exception at runtime.
    F. None of the above

    When an enum contains only a list of values, the semicolon (;) after the list is optional.
    When an enum contains any other members, such as a constructor or variable, then it is required.
    Since the code is missing the semicolon, it does not compile, making option C the correct answer.
    There are no other compilation errors in this code.
    If the missing semicolon was added, then the program would print 0 1 2 at runtime.
 */
 class FlavorsEnum {
    enum Flavors {
        VANILLA, CHOCOLATE, STRAWBERRY
    static final Flavors DEFAULT = STRAWBERRY;
    }
    public static void main(String[] args) {
        for(final var e : Flavors.values())
            System.out.print(e.ordinal()+" ");
    }
}

public class FlavorsEnumFindErrors {

}
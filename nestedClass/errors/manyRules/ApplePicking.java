package nestedClass.errors.manyRules;

/**
 *  What is the output of the following application?
    A. Spoiled!
    B. Yummy!
    C. The application completes without printing anything.
    D. One line of this application fails to compile.
    E. Two lines of this application fail to compile.
    F. None of the above

    This main() method declares an anonymous class that implements the Tasty interface.
    Interface methods are public, whereas the override in the anonymous class uses package-private access.
    Since this reduces the visibility of the method, the declaration of eat() on line 9 does not compile.
    Next, the declaration of the apple object must end with a semicolon (;) on line 12, and it does not.
     For these two reasons, the code does not compile, and option E is the correct answer.
     Note that if these two issues were corrected, with the public modifier and missing semicolon (;),
     then the correct answer would be option C because the code does not actually call the eat() method;
     it just declares it.
 */
 interface Tasty { // 1:
    default void eat() { //   2:
        System.out.print("Spoiled!"); //   3:
    } } //  4:
public class ApplePicking { // 5:
    public static void main(String[] food) { // 6:
        var apple = new Tasty() { //  7:
            @Override //     8:
            void eat() {  //  9:
                System.out.print("Yummy!"); //   10:
            } //  11:
        } //  12:
    } } //  13:

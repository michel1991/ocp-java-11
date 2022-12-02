package inheritance;

/**
*   What does the following program print?
    A. Elysia Sophia
    B. Webby Olivia
    C. Olivia Olivia
    D. Olivia Sophia
    E. The code does not compile.
    F. None of the above

    The code compiles and runs without issue, making option E incorrect.
    The Child class overrides the setName() method and hides the static name variable defined in the inherited Person class.
    Since variables are only hidden, not overridden, there are two distinct name variables accessible, depending on the location and reference type.
    Line 8 creates a Child instance, which is implicitly cast to a Person reference type on line 9.
    Line 10 uses the Child reference type, updating Child.name to Elysia.
    Line 11 uses the Person reference type, updating Person.name to Sophia.
    Lines 12 and 13 both call the overridden setName() instance method declared on line 6.
    This sets Child.name to Webby on line 12 and then to Olivia on line 13.
    The final values of Child.name and Person.name are Olivia and Sophia, respectively, making option D the correct answer.
 */

class Person { // 1:
    static String name; //  2:
    void setName(String q) { name = q; } } //  3:

public class ChildHideMemberProperty extends Person {
    static String name; // 5:
    void setName(String w) { name = w; } //  6:
    public static void main(String[] p) { // 7:
        final ChildHideMemberProperty m = new ChildHideMemberProperty(); //  8:
        final Person t = m; // 9:
        m.name = "Elysia"; //  10:
        t.name = "Sophia"; // 11:
        m.setName("Webby"); //  12:
        t.setName("Olivia"); //  13:
        System.out.println(m.name + " " + t.name); //    14:
    } //  15:
}
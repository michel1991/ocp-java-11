package enums.errors;

/**
   What is printed by the following program? (Choose all that apply.)
    A. PLUM is purple
    B. Fruit.PLUM is purple
    C. The enum Fruit does not compile.
    D. The class FruitShopper method does not compile.
    E. The code compiles but throws an exception at runtime.
    F. Since Fruit is an inner class, it cannot contain instance members.

    The declaration of Fruit does not compile because enums are required to list their values first.
    Even if the code was corrected to put the list of values first,
    the main() method in FruitShopper does not compile.
    The fully qualified name of the enum should be used.
    In other words, the right side of line 10 needs to be FruitStore.Fruit.PLUM.
    If all of these issues were fixed, then the code would print PLUM is purple.
    Option F is incorrect because inner classes can contain instance members.
 */
class FruitStore { // 1:
    public enum Fruit { //2:
        private Fruit(String color) { this.color = color; } // 3:
    public String color; //  4:
    APPLE("red"), BANANA("yellow"), // 5:
    ORANGE("orange"), PLUM("purple"); // 6:
    } } //  7:
public class FruitShopper { // 8:
    public static void main(String[] args) { //   9:
        var one = Fruit.PLUM; //  10:
        System.out.println(one + " is " + one.color); //   11:
    } } //    12:

public class FruitStoreValueMustBeFirst {

}
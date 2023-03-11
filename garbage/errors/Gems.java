

/**
 * How many Gems objects are eligible for garbage collection right before the end of the main() method?
    A. None
    B. One
    C. Two
    D. Three
    E. Four
    F. The code does not compile

    The code does not compile, as the constructor calls on the first
    four lines of the main() method are missing the new keyword.
    If the missing new keywords were added to each line,
    then the code would compile,
    and three Gems objects would be available for garbage collection.

 */
public class Gems {
    public String name;
    public Gems(String name) {
        this.name = name;
    }
    public static void main(String... args) {
        var g1 = Gems("Garnet");
        var g2 = Gems("Amethyst");
        var g3 = Gems("Pearl");
        var g4 = Gems("Steven");
        g2 = g3;
        g3 = g2;
        g1 = g2;
        g4 = null;
    }
}

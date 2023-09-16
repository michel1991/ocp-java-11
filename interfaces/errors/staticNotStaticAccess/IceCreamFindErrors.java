package interfaces.errors.staticNotStaticAccess;


/**
  How lines of the following code do not compile?
    A. None, they all compile
    B. One
    C. Two
    D. Three
    E. Four
    F. Five or more

    A private non-static interface method may only be accessed
    from other private or default methods declared within the interface.
    Lines 15 and 21 do not compile because the private method is called within static methods.
    Line 26 does not compile because
    a private interface method cannot be called in a method outside the interface declaration.
    Since these three lines do not compile, option D is correct.
 */
interface Flavor {  // 10:
    public default void happy() { // 11:
        printFlavor("Rocky road"); //  12:
    } //   13:
    private static void excited() { // 14:
        printFlavor("Peanut butter"); //   15:
    } //   16:
    private void printFlavor(String f) { //   17:
        System.out.println("Favorite Flavor is: "+f); // 18:
    } // 19:
    public static void sad() { //   20:
        printFlavor("Butter pecan"); //  21:
    } //  22:
} //   23:
 class IceCream implements Flavor { // 24:
    @Override public void happy() { // 25:
        printFlavor("Cherry chocolate chip"); //   26:
    } } //  27:


public class IceCreamFindErrors {

}
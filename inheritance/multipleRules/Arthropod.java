package inheritance.multipleRules;
/**
* What is the output of the following code?
*   A. SpiderSpiderArthropod
    B. SpiderSpiderSpider
    C. SpiderSpookyArthropod
    D. SpookySpiderArthropod
    E. The code will not compile because of line 5.
    F. The code will not compile because of line 9.
    G. None of the above

   The code compiles and runs without issue, so options E and F are incorrect.
    The Arthropod class defines two overloaded versions of the printName() method.
    The printName() method that takes an int value on line 5
    is correctly overridden in the Spider class on line 9.
    Remember, an overridden method can have a broader access modifier,
    and protected access is broader than package-private access.
    Because of polymorphism, the overridden method replaces the method on all calls,
    even if an Arthropod reference variable is used, as is done in the main() method.
    For these reasons, the overridden method is called on lines 14 and 15, printing Spider twice.
    Note that the short value is automatically cast to the larger type of int,
    which then uses the overridden method.
    Line 16 calls the overloaded method in the Arthropod class,
    as the long value 5L does not match the overridden method, resulting in Arthropod being printed.
    Therefore, option A is the correct answer.
 */
public class Arthropod {
    protected void printName(long input) { //  2:
        System.out.print("Arthropod"); //  3:
    } //  4:
    void printName(int input) { //  5:
        System.out.print("Spooky"); //  6:
    } } //  7:
  class Spider extends Arthropod { // 8:
    protected void printName(int input) { //  9:
        System.out.print("Spider"); //  10:
    } //  11:
    public static void main(String[] args) { //  12:
        Arthropod a = new Spider(); //  13:
        a.printName((short)4); //  14:
        a.printName(4); //  15:
        a.printName(5L); // 16:
    } //  17:
}
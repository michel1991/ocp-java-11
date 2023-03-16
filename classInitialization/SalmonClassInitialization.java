package classInitialization;

/**
  What is the output of executing the following class?

    A. 7-0-2-1-
    B. 7-0-1-
    C. 0-7-2-1-
    D. 7-0-2-4-
    E. 0-7-1-
    F. The class does not compile because of line 3.
    G. The class does not compile because of line 4.
    H. None of the above.

    The class compiles and runs without issue, so options F and G are incorrect.
    We start with the main() method, which prints 7- on line 11.
    Next, a new Salmon instance is created on line 11.
    This calls the two instance initializers on lines 3 and 4 to be executed in order.
    The default value of an instance variable of type int is 0, so 0- is printed next and count is assigned a value of 1.
    Next, the constructor is called. This assigns a value of 4 to count and prints 2-.
    Finally, line 12 prints 4-, since that is the value of count.
    Putting it altogether, we have 7-0-2-4-, making option D the correct answer.
 */

class Salmon { // 1:
    int count; // 2:
    { System.out.print(count+"-"); } //  3:
    { count++; } //     4:
    public Salmon() { //    5:
        count = 4; // 6:
        System.out.print(2+"-"); //     7:
    } //   8:
    public static void main() { //  9:
        System.out.print(7+"-"); //  10:
        var s = new Salmon(); //  11:
        System.out.print(s.count+"-"); } } //   12:

public class SalmonClassInitialization {
    public static void main(String[] args) {
        Salmon.main();
    }

}
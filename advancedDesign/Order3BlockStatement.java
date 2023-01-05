package advancedDesign;

/**
   Which of the following will compile when independently inserted in the following code? (Choose all that apply.)

    A. Insert at line 6: value1 = "green";
    B. Insert at line 6: value2 = "purple";
    C. Insert at line 6: value3 = "orange";
    D. Insert at line 9: value1 = "magenta";
    E. Insert at line 9: value2 = "cyan";
    F. Insert at line 9: value3 = "turquoise";

    The variable value1 is a final instance variable.
    It can be set only once: in the variable declaration, an instance initializer,
    or a constructor.
    Option A does not compile because the final variable was already set in the declaration.
    The variable value2 is a static variable.
    Both instance and static initializers are able to access static variables,
    making options B and E correct. The variable value3 is an instance variable.
    Options D and F do not compile because a static initializer does not have access to instance variables.

 */
class Order3 { // 1:
    final String value1 = "red"; //  2:
    static String value2 = "blue"; //   3:
    String value3 = "yellow"; //   4:
    { //  5:
        // CODE SNIPPET 1  line  6:
        value2 = "purple"; //R
        value3 = "orange"; // R
    } //   7:
    static { //   8:
        // CODE SNIPPET 2  line 9:
        value2 = "cyan"; // R
    } } //  10:
public class Order3BlockStatement {

}
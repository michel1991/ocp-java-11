package scope;

/**
 What is the result of compiling and executing the following class?
    A. The code does not compile due to line x.
    B. The code does not compile due to line y.
    C. 31
    D. 61

    The code compiles and runs without issue, so options A and B are incorrect.
    The question relies on your ability to understand variable scope.
    The variable today has local scope to the method in which it is executed.
    The variable tomorrow is re-declared in the method,
    but the reference used on line y is to the instance variable with a value of 10.
     Finally, the variable yesterday is static.
     While using an instance reference to access a static variable is not recommended,
     it does not prevent the variable from being read.
     The result is line y evaluates and prints 31 (20 + 10 + 1), making option C the correct answer.
 */
class Tolls {
    private static int yesterday = 1;
    int tomorrow = 10;

    public static void main(String[] args) {
        var tolls = new Tolls();
        int today = 20, tomorrow = 40;  // line x
        System.out.print(
                today + tolls.tomorrow + tolls.yesterday); // line y
    }
}

public class TollsScopeVariable {
    public static void main(String[] args) {
        Tolls.main(args);
    }
}
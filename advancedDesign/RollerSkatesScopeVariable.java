package advancedDesign;

/**
 * What is the result of compiling and executing the following class?
    A. The code does not compile.
    B. 4
    C. 5
    D. 10
    E. 20

    The code compiles and runs without issue, so option A is incorrect.
    The question involves understanding the value and scope of each variable at the print() statement.
    The variables feet and tracks are locally scoped and set to 4 and 15, respectively,
    ignoring the value of tracks of 5 in the instance of the class.
    Finally, the static variable s.wheels has a value of 1.
    The result is that the combined value is 20, making option E the correct answer.
 */
class RollerSkates {
    static int wheels = 1;
    int tracks = 5;
    public static void main(String[] arguments) {
        RollerSkates s = new RollerSkates();
        int feet=4, tracks = 15;
        System.out.print(feet + tracks + s.wheels);
    }
}
public class RollerSkatesScopeVariable {

}
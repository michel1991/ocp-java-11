package nestedClass.errors.requireFinal;

/*

   What is the result of the following code? (Choose all that apply.)

    A. The output is 5.
    B. The output is 10.
    C. Line 6 generates a compiler error.
    D. Line 12 generates a compiler error.
    E. Line 13 generates a compiler error.
    F. The code compiles but produces an exception at runtime.

    Popcorn is an inner class. Inner classes are only allowed
    to contain static variables that are marked final.
    Since there are no other compilation errors,
    option C is the only correct answer.
    If the final modifier was added on line 6,
    then the code would print 10 at runtime.
    Note that private constructors can be
    used by any methods within the same class.
*/
public class Movie { // 1:
    private int butter = 5; //   2:
    private Movie() {} // 3:
    protected class Popcorn { //     4:
        private Popcorn() {} //    5:
    public static int butter = 10; //  6:
    public void startMovie() { //   7:
        System.out.println(butter); //    8:
    } //  9:
    } //  10:
    public static void main(String[] args) { //  11:
        var movie = new Movie(); //   12:
        Movie.Popcorn in = new Movie().new Popcorn(); //  13:
        in.startMovie(); //     14:
    } } //  15:
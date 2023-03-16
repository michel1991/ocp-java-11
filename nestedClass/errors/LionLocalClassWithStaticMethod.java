package nestedClass.errors;

/**
* Which of the following are true statements about the following program? (Choose all that apply.)
    A. The code compiles and prints Roar! three times.
    B. Line 4 does not compile.
    C. Line 5 does not compile.
    D. Line 10 does not compile.
    E. A runtime exception is thrown because an inner class is declared in a loop.

    A local class is not allowed to have static methods, meaning line 5 does not compile.
    It also goes out of scope like a regular local variable. Cub is scoped to be inside the for loop.
    It is legal to declare an inner class inside a loop as long as it is referenced only inside that loop.
    For this reason, line 10 also does not compile.

 */
public class LionLocalClassWithStaticMethod {
    public static void main(String[] args) { //  2:
;        for (var i = 0; i < 3; i++) {  // 3:
            class Cub {  //  4:
                public static void print() { //  5:
                    System.out.print("Roar!"); //  6:
                } //  7:
            } // 8:
        } //   9:
        new Cub().print(); //   10:
    } // 11:
}
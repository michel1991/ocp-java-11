package advancedDesign;
    /**
    *  What gets printed when running the following? (Choose all that apply.)
    *   A. 1
        B. 2
        C. 3
        D. 4
        E. Stack trace of a NullPointerException
        F. The code does not compile.
       On line 5, the code throws a NullPointerException because the instance variable value is still using the default value of null.
       This is caught on line 7, and then line 8 prints 2. Line 9 immediately ends the program, and nothing else is printed.
     */
     class A {
        private String value; // 2:
        public void go() { //  3:
            try { //  4:
                System.out.print(value.toString()); //  5:
                System.out.print("1"); //  6:
            } catch (NullPointerException e) { // 7:
                System.out.print("2"); //  8:
                System.exit(0); //  9:
            } finally { //   10:
                System.out.print("3"); //  11:
            } //  12:
            System.out.print("4"); //  13:
        } //  14:
    }

public class ASystemExit {

    public static void main(String[] args) { //  15:
        new A().go(); //  16:
    } //  17:
}
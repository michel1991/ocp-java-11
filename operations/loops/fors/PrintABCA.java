package operations.loops.fors;
public class PrintABCA {
    /**
    * Which statement(s) about the following code snippet are correct? (Choose all that apply.)
        A. The code prints five As.
        B. The code prints six As.
        C. The code prints two Bs.
        D. The code prints three Bs.
        E. The code prints four Bs.
        F. The code prints no Cs.
        G. The code prints one C.
        H. The code does not compile.

        The code compiles and runs without issue, making option H incorrect.
        The first loop is equivalent to incrementing a twice per loop, so it runs exactly five times, making option A correct.
        The second loop is equivalent to incrementing b by 3 per loop, and since it starts at 1,
        the loop is executed exactly three times, making option D correct.
        Finally, the last loop is executed exactly once, as c<5 is false after the first execution.
        For this reason, option G is correct.
    *
     */
    static void printABCAccordingToLoopDefinition(){
        System.out.println(" Begin  printABCAccordingToLoopDefinition");
        for(var a = 0; a<10; ++a) {
            a++;
            System.out.print("A");
        }
        for(var b = 1; b<10; b++) {
            System.out.print("B");
            b += 2;
        }
        for(var c = 4; c<5; c+=10) {
            System.out.print("C");
        }
        System.out.println(" End  printABCAccordingToLoopDefinition");
    }

    public static void main(String... args){
        printABCAccordingToLoopDefinition();
    }
}
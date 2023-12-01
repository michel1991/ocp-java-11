package classInitialization;

/**
 * What is the output of the following program?
    A. re-fa-ti-do-mi-so-
    B. do-re-mi-fa-ti-so-
    C. ti-re-fa-do-mi-so-
    D. re-fa-la-mi-ti-do-
    E. do-re-mi-fa-so-ti
    F. The code does not compile.
    G. None of the above
    
    The code compiles, so option F is incorrect. The Music class is loaded,
    and the static initializers are executed in order, with re-fa- being printed first.
    Next, the first line of the main() method is executed, printing ti-.
    The second line of the main() method creates a Music object,
    with the instance initializers being called first, printing do-mi-.
    Finally, the no-argument constructor is executed, and so- is printed last.
 */
public class Music {
    { System.out.print("do-"); }
    static { System.out.print("re-"); }
    { System.out.print("mi-"); }
    static { System.out.print("fa-"); }

    public Music() {
        System.out.print("so-");
    }

    public Music(int note) {
        System.out.print("la-");
    }

    public static void main(String[] sound) {
        System.out.print("ti-");
        var play = new Music();
    }
}
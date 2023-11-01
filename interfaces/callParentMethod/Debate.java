package interfaces.callParentMethod;

/**
 * Fill in the blank with the line of code that allows the program to compile and print 10 at runtime.
    A. Whisper.d.getVolume()
    B. d.Whisper.getVolume()
    C. Whisper.super.getVolume()
    D. d.Whisper.super.getVolume()
    E. The code does not compile regardless of what is inserted into the blank.
    F. None of the above.

    The code compiles, even if the blank is replaced with a constant value, making option E incorrect.
    Note that the class correctly overrides both inherited default methods.
    While it is possible to call a specific inherited default method, even when it has been overridden, it requires calling super,
    which is not accessible from a static method. For these reasons, options A, B, C, and D do not work, making option F correct.
 */
interface Speak {
    public default int getVolume() { return 20; }
}
interface Whisper {
    public default int getVolume() { return 10; }
}
public class Debate implements Speak, Whisper {
    public int getVolume() { return 30; }

    public static void main(String[] a) {
        var d = new Debate();
        System.out.println(); // ______________
    }
}

package autoCloseable;
import java.io.Closeable;

/**
 * What is the output of the following application?
    A. Hello
    B. The code does not compile because of the ReadSign class.
    C. The code does not compile because of the MakeSign class.
    D. The code does not compile because of the Translate class.
    E. The code does not compile because of the try-with-resources statement.
    F. None of the above.

    The application compiles without issue and prints Hello, making option A the correct answer.
    The ReadSign and MakeSign classes are both correctly implemented,
    with both overridden versions of close() dropping the checked exceptions.
    The try-with-resources statement is also correctly implemented
    for two resources and does not cause any compilation errors or runtime exceptions.
    Note that the semicolon (;) after the second resource declaration is optional.

 */
class ReadSign implements Closeable {
    public void close() {}
    public String get() {return "Hello";}
}
class MakeSign implements AutoCloseable {
    public void close() {}
    public void send(String message) {
        System.out.print(message);
    }
}
public class Translate {
    public static void main(String... hands) {
        try (ReadSign r = new ReadSign();
MakeSign w = new MakeSign();) {
            w.send(r.get());
        }
    }
}
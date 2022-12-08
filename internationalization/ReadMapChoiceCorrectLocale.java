package internationalization;
import java.util.Locale;

/**
* Which of the following, when inserted independently in the blank, use locale parameters that are properly formatted? (Choose all that apply.)
    A. new Locale("xM");
    B. new Locale("MQ", "ks");
    C. new Locale("qw");
    D. new Locale("wp", "VW");
    E. Locale.create("zp");
    F. Locale.create("FF");
    G. The code does not compile regardless of what is placed in the blank.

   The code compiles with the appropriate input, so option G is incorrect.
  A locale consists of a required lowercase language code and optional uppercase country code.
  In the Locale() constructor, the language code is provided first. For these reasons, options C and D are correct.
  Options E and F are incorrect because a Locale is created using a constructor or Locale.Builder class.

 */
class ReadMap implements AutoCloseable {
    private Locale locale;
    private boolean closed = false;
    void check() {
        assert !closed;
    }
    @Override public void close() {
        check();
        System.out.println("Folding map");
        locale = null;
        closed = true;
    }
    public void open() {
        check();
        this.locale = new Locale("qw"); // _________________ new Locale("wp", "VW");
    }
    public void use() {
        // Implementation omitted
    }
}

public class ReadMapChoiceCorrectLocale {
   public static void main(String... args){
       new ReadMap().open();
   }
}
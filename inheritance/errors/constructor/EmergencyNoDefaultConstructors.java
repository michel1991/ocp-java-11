package inheritance.errors.constructor;

/**
* Which of the following classes contain at least one compiler error? (Choose all that apply.)
    A. Danger
    B. Catastrophe
    C. Emergency
    D. All of these classes compile correctly.
    E. The answer cannot be determined from the information given.

  Exception and RuntimeException, along with many other exceptions in the Java API,
  define a no-argument constructor,a constructor that takes a String,
  and a constructor that takes a Throwable. For this reason, Danger compiles without issue.
  Catastrophe also compiles without issue. Just creating a new checked exception,
  without throwing it, does not require it to be handled or declared. Finally, Emergency does not compile.
  The no-argument constructor in Emergency must explicitly call a parent constructor,
  since Danger does not define a no-argument constructor.

 */
class Danger extends RuntimeException {
    public Danger(String message) {
        super();
    }
    public Danger(int value) {
        super((String) null);
    }
}
class Catastrophe extends Exception {
    public Catastrophe(Throwable c) throws RuntimeException {
        super(new Exception());
        c.printStackTrace();
    }
}

class Emergency extends Danger {
    public Emergency() {}
    public Emergency(String message) {
        super(message);
    }
}

public class EmergencyNoDefaultConstructors {

}
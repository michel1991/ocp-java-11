package overloadWhithoutInheritance;

/**
* Which of the following correctly overload this method? (Choose all that apply.)
*   A. private void buzz(String sound) { }
    B. public final void buzz() { }
    C. public static void buzz() { }
    D. public static void buzz(int... time) { }
    E. public void buzz(boolean softly) { }
    F. public void buzzLouder() { }

  Options B and C are incorrect because they have
  the same name and empty parameter list as the original.
  One of these must differ to be an overload.
  Option F is incorrect because the method name is different than the original.
  It is a perfectly fine method, but it isn’t an overload.
  Options A, D, and E are correct overloads because
  the method name is the same and the method parameter list is different.
  Anything else is allowed to vary. Remember that Java is case sensitive.
 */
public class BuzzValidOverload {

    public void buzz() {

    }
    private void buzz(String sound) {

    }
    public static void buzz(int... time) {

    }
    public void buzz(boolean softly) {

    }
}
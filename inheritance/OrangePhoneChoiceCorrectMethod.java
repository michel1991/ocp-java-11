package inheritance;

/**
* Which three overridden methods, when added to the OrangePhone class, allow it to compile? (Choose all that apply.)
*   A. void turnOn() {};
    B. protected void call(long number) {}
    C. public void turnOn() throws java.io.IOException {}
    D. void call() {}
    E. public String call() { return ""; }
    F. public void call(int n) {}
    G. None of the above, as the inherited classes do not compile

  For OrangePhone to compile, it must override three inherited methods.
  First, option A correctly overrides the turnOn() method, with the unchecked NullPointerException not required to be declared in the overridden method.
  Option C is an invalid override of the turnOn() method, as an overridden method cannot declare a new checked exception.
  Next, option E correctly overrides the call() method with the broader access modifier of public.
  Notice the return type is not the same as the inherited method, but since String is a subtype of CharSequence, it is covariant, and this is allowed.
  Option D is an invalid override of the call() method, as the return type is void.
  Moving on to the last method, option F is a correct override of the call(int) method, as public is broader than protected.
  Option B is incorrect because the change in parameter type makes an overloaded method, not an overridden one.
  While including this method does allow the code to compile, the question was specifically asking for overridden methods.
  Finally, option G is incorrect as the parent classes are implemented without any errors.
 */
abstract class Device {
    abstract void turnOn() throws NullPointerException;
}
abstract class Phone extends Device {
    abstract CharSequence call();
}
abstract class MobilePhone extends Phone {
    abstract protected void call(int number);
}
class OrangePhone extends MobilePhone {
    // TODO
    @Override
    void turnOn(){

    }

    @Override
    public String call(){
      return "";
    }

    @Override
    public void call(int n) {

    }
}


public class OrangePhoneChoiceCorrectMethod {

}
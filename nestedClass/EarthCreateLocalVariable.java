package nestedClass;
/**
 * Given the following class declaration, which options correctly declare a local variable containing an instance of the class?
   A. new Sunset() extends Sky {};
    B. new Sky();
    C. new Sky() {}
    D. new Sky() { final static int blue = 1; };
    E. The code does not compile regardless of what is placed in the blank.
    F. None of the above.

    All of the options attempt to create an instance using an anonymous class that extends Sky.
    Option A is incorrect because when you create an anonymous class,
    you do not specify a name. Even if there was a Sunset class,
    the declaration of an anonymous class can only extend or implement one type directly.
    Since it would already extend Sunset, it cannot specify Sky at the same time.
    Option B is incorrect because Sky is abstract and cannot be instantiated directly.
     Option C is incorrect because it is missing a semicolon (;) at the end.
     Option D is the correct answer. Remember that all nested classes can have static variables if they are marked final.
 */
class Earth {
    private abstract class Sky {
        void fall() {
            var e = new Sky() { final static int blue = 1; };  // _______________
        }
    }
}

public class EarthCreateLocalVariable {

}
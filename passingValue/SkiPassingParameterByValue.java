package passingValue;

/**
  Given the following application, which diagram best represents the state of the mySkier,
   mySpeed, and myName variables in the main() method after the call to the slalom() method?
 
   Find answers on images ski**.jpg
   
  To solve this problem, it helps to remember that Java
  is a pass-by-value language in which copies of primitives
  and object references are sent to methods. This also means that an object’s
  data can be modified within a method and shared with the caller,
  but not the reference to the object. Any changes to the object’s reference
  within the method are not carried over to the caller.
  In the slalom() method, the Ski object is updated with an age value of 18.
  Although the last line of the slalom() method changes the variable value to null,
  it does not affect the mySkier object or reference in the main() method.
  Therefore, the mySkier object is not null, and the age variable is set to 18,
  making options A and D incorrect.
  Next, the name variable is reassigned to the Wendy object,
  but this does not change the reference in the main() method, so myName remains Rosie.
   Finally, the speed array is assigned a new object and updated.
   Since the array is updated after the reference is reassigned,
   it does not affect the mySpeed array in the main() method.
   The result is that mySpeed continues to have a single element with
   the default int value of 0. For these reasons, option B is incorrect, and option C is correct.
 */

 class Ski {
    private int age = 18;
    private static void slalom(Ski racer,
                               int[] speed, String name) {

        racer.age = 18;
        name = "Wendy";
        speed = new int[1];
        speed[0] = 11;
        racer = null;
    }

    public static void main(String... mountain) {
        final var mySkier = new Ski();
        mySkier.age = 16;
        final int[] mySpeed = new int[1];
        final String myName = "Rosie";
        slalom(mySkier,mySpeed,myName);
    }
}
public class SkiPassingParameterByValue {
  public static void main(String... mountain) {
     Ski.main(mountain);
   }
}
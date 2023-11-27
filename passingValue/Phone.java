package passingValue;

/**
 * Which of the following are correct? (Choose two.)
   A. The following is a valid constructor:
    public static Phone create(int size) {
      return new Phone(size);
   }
   
   B. The following is a valid constructor:
    public static Phone newInstance(int size) {
      return new Phone();
   }
   
   C. The following is a valid constructor:
    public Phone(int size) {
      this.size=size;
   }
   
   D. The following is a valid constructor:
    public void Phone(int size) {
      this.size=size;
   }
   
   E. With the correct constructor, the output is 3.
   F. With the correct constructor, the output is 7.
   
   Options A and B are static methods rather than constructors.
   Option D is a method that happens to have the same name as the class.
   It is not a constructor because constructors don’t have return types.
    Option C is a valid constructor.
    As for the output, the key is that Java uses “pass by value” to send object references to methods.
    Since the Phone reference p was reassigned in the first line of the sendHome() method,
    any changes to the p reference were made to a new object.
    In other words, no changes in the sendHome() method affected the object that was passed in.
    Therefore, the value of size was the same before
    and after the method call, making the output 3 and option E the correct answer.
 */
public class Phone {
   private int size;

   // insert constructor here
    public void Phone(int size) {
       this.size=size;
    }

   public static void sendHome(Phone p, int newSize) {
      p = new Phone(newSize);
      p.size = 4;
   }
   public static final void main(String... params) {
      final var phone = new Phone(3);
      sendHome(phone,7);
      System.out.print(phone.size);
   }
}

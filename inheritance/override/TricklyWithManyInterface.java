package inheritance.override;
/**
  Which statements are true about the following code? (Choose all that apply.)
  A. The CanBark declaration doesn’t compile.
  B. A class that implements HasVocalCords must override the makeSound() method.
  C. A class that implements CanBark inherits both the makeSound() and bark() methods.
  D. A class that implements Dog must be marked final.
  E. The Dog declaration does not compile because an interface cannot extend two interfaces.

  The code compiles without issue, so option A is incorrect.
  Option B is incorrect, as an abstract class could implement
  HasVocalCords without the need to override the makeSound() method.
  Option C is correct; a class that implements CanBark automatically inherits
  its abstract methods, in this case makeSound() and bark().
  Option D is incorrect, as a concrete class that implements Dog may be optionally marked final.
  Finally, an interface can extend multiple interfaces, so option E is incorrect.
 */
interface Dog extends CanBark, HasVocalCords {
    abstract int chew();
}
public interface CanBark extends HasVocalCords {
    public void bark();
}
interface HasVocalCords {
    public abstract void makeSound();
}


public class TricklyWithManyInterface {
   public static void main(String... args){

   }
}
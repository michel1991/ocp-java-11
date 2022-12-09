package interfaces.errors;
/**
* Which values can be inserted into the blank that allow the code to compile? (Choose all that apply.)
*   A. m1
    B. t1
    C. u1
    D. One line contains a compiler error.
    E. Two lines contain compiler errors.
    F. None of the above

    The variable m1 is of type Mars, which inherits Planet, so m1 can be used in the blank on line 11, making option A correct.
    Even though Titan does not inherit Planet, it is possible a subclass of Titan could implement the Planet interface.
    Therefore, the compiler allows this check, and option B is correct.
    On the other hand, because Unknown is marked final, there could not be a subclass that inherits Planet.
    The compiler can enforce this rule and report an error if u1 is used on line 11, making option C incorrect.
    Options D, E, and F are incorrect because options A and B are correct.
 */
interface Planet {} // 1:
interface Moon {} // 2:
class Mars implements Planet {} // 3:
class Titan implements Moon {} // 4:
final class Unknown extends Titan {} // 5:
class SolarSystem { // 6:
    public static void main() { //  7:
        var m1 = new Mars(); //   8:
        Titan t1 = new Titan(); //   9:
        Unknown u1 = new Unknown(); //    10:
        System.out.print(m1 instanceof Planet); //________   11:
    } //  12:
} //   13:

public class SolarSystemInstanceOf {
  public static void main(String... args){
      SolarSystem.main();
  }
}
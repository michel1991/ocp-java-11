package advancedDesign.errors;
/*
  What is the output of the following application?
    A. 2
    B. 5
    C. The first line with a compiler error is line q1.
    D. The first line with a compiler error is line q2.
    E. The first line with a compiler error is line q3.

  The Puppy class does not declare a constructor,
  so the default no-argument constructor is automatically inserted by the compiler.
  What looks like a constructor in the class is actually a method that
  has a return type of void. Therefore, the line in the main() method
  to create the new Puppy(2) object does not compile,
  since there is no constructor capable of taking an int value, making option E the correct answer.

 */
class Puppy {
    public static int wag = 5;   // q1
    public void Puppy(int wag) { // q2
        this.wag = wag;
    }
    public static void main(String[] tail) {
        System.out.print(new Puppy(2).wag); // q3
    }
}
public class PuppyNotConstructorDefined {

}
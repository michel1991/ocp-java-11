package inheritance.errors;

/**
* Question: What is the result of the following code? (Choose all that apply.)
    A. Nothing is output
    B. ==
    C. bird
    D. sparrows
    E. The code does not compile.

    This is one of those tricky questions that appears to ask about one thing but is really about something else.
    The first if statement has a scope of line 6. The second if statement has a scope of lines 7 through 10.
    The last if statement has a scope of lines 11 through 13. The problem is that s1 is declared in the second if statement and is not accessible after it ends.
    This gives a compiler error on line 11 since there is no s1 variable in scope. And yes, the exam will try to trick you with nonstandard indentation.
 */
class Sparrow extends Bird {

}
abstract class Bird {
  public static void main(String[] args) {
        Bird b = new Sparrow();
       Sparrow s = new Sparrow();
         if (b == s) {
             System.out.println("==");
         }
         if (b.equals(s)) {
               System.out.println("bird");
               Sparrow s1 = new Sparrow();
           }

     if (b.equals(s1))
       System.out.println("sparrow");
      }
}
public class HideVariableScope {
   public static void main(String... args){

   }
}
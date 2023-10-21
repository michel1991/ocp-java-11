package nio.errors.paths;
import java.nio.file.*;

/**
* What is the output of the following code?
*   A. ../../lion
    B. /user/kodiacbear.txt
    C. ../user/kodiacbear.txt
    D. /user/./root/../kodiacbear.txt
    E. The code does not compile
    F. None of the above.

   The relativize() method takes a Path value, not a String.
   For this reason, line 5 does not compile, and option E is correct.
   If line 5 was corrected to use a Path value, then the code would compile,
   but it would print the value of the Path created on line 4.
    Since Path is immutable, the operations on line 5 are not saved anywhere.
    For this reason, option D would be correct.
    Finally, if the value on line 5 was assigned to path and printed on line 6,
    then option A would be correct.
 */
public class RelativizeNotUseStringAsParameter {
  static void relativizeWithStringParameter(){
      var path = Path.of("/user/./root","../kodiacbear.txt"); // 4:
      path.normalize().relativize("/lion"); // 5:
      System.out.println(path); // 6:
  }

    public static void main(String... args){

  }
}
package advancedDesign.errors;
/**
* What is the minimum number of lines you need to remove in order to make this file compile?
*   A. 0
    B. 1
    C. 2
    D. 3
    E. 4

  Line 2 does not compile because a method must be inside a class.
  Line 6 does not compile because a file is allowed to have only one public top-level class.
  Since two lines do not compile, option C is correct.
 */

//1: package bugs;
public void fly() {} // 2:
public class LightningBug { // 3:
    String wings;  //   4:
} //    5:
public class Wings { } // 6:
public class LightningBug {

}
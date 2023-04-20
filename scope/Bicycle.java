package scope;
/**
 * What is the result of compiling and executing the following class?
 
    A. red
    B. purple
    C. blue
    D. It does not compile.

  First, the color variable defined in the instance
  and set to red is ignored in the method printColor().
  Since local scope overrides instance scope, option A is incorrect.
   The value of color passed to the printColor() method is blue,
   but that is lost by the assignment to purple, making option B the correct answer
  and option C incorrect. Option D is incorrect as the code compiles and runs without issue.
 */
public class Bicycle {
    String color = "red";
    private void printColor(String color) {
        color = "purple";
        System.out.print(color);
    }
    public static void main(String[] rider) {
        new Bicycle().printColor("blue");
    }
}

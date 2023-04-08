
package scope;
/**
   Given the following application, fill in the missing values in
   the table starting from the top and going downward.
   
    A. 2, 0, 1
    B. 2, 2, 1
    C. 1, 0, 1
    D. 0, 2, 1

  [image](./for_robot.png)
  Notice in this question that main() is not a static method; therefore,
  it can access both class and instance variables.
  Since there are two class variables and two instance variables defined, option B is the correct answer.
 */
public class Robot {
    static String weight = "A lot";
    double ageMonths = 5, ageDays = 2;
    private static boolean success = true;

    public void main(String[] args) {
        final String retries = "1";
        // P1
    }
}

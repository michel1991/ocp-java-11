package operations.errors;
public class BadCompoundOperator {
    /**
    * What is the result of executing the following code snippet?
        A. 0,1,0
        B. 1,1,4
        C. 2,1,8
        D. 0,2,1
        E. The code will not compile because of line 4.
        F. The code will not compile because of line 5.

    Line 5 uses the compound operator on the variable z, which has not yet been defined.
    The left side of the expression must reference a variable that is already declared.
    The code will therefore not compile, and option F is correct.
     */
 public static void main(String... args){
     int x = 10 % 2; //  3:
     int y = 3 / 5 + ++x; // 4:
     int z += 4 * x; //  5:
     System.out.print(x+","+y+","+z); //   6:
  }

}
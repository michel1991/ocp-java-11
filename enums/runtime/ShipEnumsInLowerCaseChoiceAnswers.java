package enums.runtime;

/**
 *  Which of the following results is not a possible output of this program?
    A. WEST is printed.
    B. south is printed.
    C. An ArrayIndexOutOfBoundsException is thrown at runtime.
    D. An IllegalArgumentException is thrown at runtime.
    E. All of the above are possible.
    
    If the program is called with a single input south,
    then south would be printed at runtime.
    If the program is called with no input,
    then the compass array would be of size zero and
    an ArrayIndexOutOfBoundsException would be thrown at runtime.
    Finally, if the program is called with a string
    that does not match one of the values in Direction,
    then an IllegalArgumentException would be thrown at runtime.
    The only result not possible is WEST,
    since the enum value is in lowercase, making option A the correct answer.
 */
enum Direction { north, south, east, west; };
 class Ship {
    public static void main(String[] compass) {
        System.out.print(Direction.valueOf(compass[0]));
    }
}


public class ShipEnumsInLowerCaseChoiceAnswers {
  
}
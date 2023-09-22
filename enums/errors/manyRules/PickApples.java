package enums.errors.manyRules;

/**
 *  What is the output of the following application?
    A. Time to pick!
    B. Time to pick! followed by Not yet!
    C. One line of code does not compile.
    D. Two lines of code do not compile.
    E. Three lines of code do not compile.
    F. The code compiles but prints an exception at runtime.
    
    Line 4 does not compile because enum constructors cannot be public.
    Line 10 also does not compile because a case statement
    must use an enum value without the type.
    In particular, FALL is permitted, but Season.FALL is not.
    For these two reasons, option D is correct.

 */
 enum Season { // 2: 
    SPRING(1), SUMMER(2), FALL(3), WINTER(4); //  3: 
    public Season(int orderId) {} //  4: 
} //   5:
  public class PickApples { // 6:
    public static void main(String... orchard) { //     7:  
        final Season s = Season.FALL; // 8: 
        switch(s) { //   9:     
            case Season.FALL: //  10:  
            System.out.println("Time to pick!"); //    11:   
            default: //   12:  
            System.out.println("Not yet!"); //   13: 
        } //  14: 
    } //    15: 
} //  16:
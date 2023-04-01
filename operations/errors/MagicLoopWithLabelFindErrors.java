package operations.errors;
/**
 *  How many lines of the magic() method contain compilation errors?
    A. Zero
    B. One
    C. Two
    D. Three
    E. Four
    
   Line 15 does not compile because the post-decrement
   operator can be applied only to variables, not values.
   Line 16 also does not compile because the label LOOP is out of scope after line 15.
   Finally, line 18 does not compile because trick is declared within
   the do/while loop and out of scope after line 17.
   For these reasons, option D is the correct answer.
    
 */
public class MagicLoopWithLabelFindErrors {
    public void magic() { // 10: 
        do { //  11: 
            int trick = 0; // 12:  
            LOOP: do { //  13:
                trick++; // 14:  
            } while (trick < 2--); //  15: 
            continue LOOP; // 16:  
        } while (1 > 2); //  17: 
        System.out.println(trick); //   18:
    } //   19:
}
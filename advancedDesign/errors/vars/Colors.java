package advancedDesign.errors.vars;

/**
 * How many lines need to be changed to make this method compile?
     A. Zero
    B. One
    C. Two
    D. Three
    E. Four
    F. Five
    
    Line 5 does not compile because the type of a variable
    cannot be inferred when the value is null.
    Line 8 does not compile because
    the type cannot be changed once the variable is declared.
    Therefore, option C is correct.

 */
public class Colors {
    public void colors() { //  1: 
        var yellow = ""; //  2: 
        yellow = null; //    3:  
        //4:
        var red = null; //   5: 
        //6:
        var blue = ""; //  7:
        blue = 1; //   8: 
        // 9:
        var var = ""; //  10: 
        var = ""; //     11:
        //12:
        var pink = 1; //  13:
    } // 14:
}
package advancedDesign.errors;

/**
 * How many lines need to be changed to make this code compile?
    A. Zero
    B. One
    C. Two
    D. Three
    E. Four
    
    Lines 2 and 3 do not compile because var can only be used for local variables.
    Line 6 does not compile because a single underscore is not permitted as a variable name.
    These three compiler errors cause option D to be the answer.
    Lines 4 and 5 use var correctly.

 */
public class Massage { // 1: 
    var name = "Sherrin"; //  2: 
    public void massage(var num) { //  3: 
        var zip = 10017; // 4: 
        var underscores = 1_001_7; //  5: 
        var _ = ""; //   6: 
    } //   7: 
} //   8:
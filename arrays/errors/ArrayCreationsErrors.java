package arrays.errors;
public class ArrayCreationsErrors {
    
    /**
     * How many of the following are legal declarations?
        A. One
        B. Two
        C. Three
        D. Four
        E. Five
        F. Six
        
        As with a one-dimensional array, the brackets, [], must be after the type,
        making alpha and beta illegal declarations. For a multidimensional
        array, the brackets may be before and/or after the variable name.
        They do not need to be in the same place. Therefore, gamma, delta,
        and epsilon are correct. Finally, var can be used as a local variable,
        but not with array brackets after it. The code would compile if it said var zeta.
        Since three options are correct, the answer is option C.
     */
    public static void greek() {
        [][]String alpha;
        []String beta;
        String[][] gamma;
        String[] delta[];
        String epsilon[][];
        var[][] zeta;
    }
}
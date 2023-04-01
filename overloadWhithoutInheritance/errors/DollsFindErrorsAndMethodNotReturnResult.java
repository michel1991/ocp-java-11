package overloadWhithoutInheritance.errors;


/**
 *  How many lines need to be removed for this code to compile?
    A. Zero
    B. One
    C. Two
    D. Three
    E. Four
    F. Five
    
    Lines 3 and 4 do not compile because the returned values
    of double and long are not compatible with int.
    Lines 6 through 8 compile without issue, since each method
    takes a different set of input arguments. The first line of
    the main() method does not compile either, making option D correct.
    The no-argument version of the nested() method does not return a value,
    and trying to output a void return type in the print() method doesn’t compile.
 */
 class Dolls { // 2: 
    public int num() { return 3.0; } // 3: 
    public int size() { return 5L; } //   4: 
    //5:
   public void nested() { nested(2,true); } // 6:  
    public int nested(int w, boolean h) { return 0; } //   7: 
    public int nested(int level) { return level+1; } //  8: 
    //9:
   public static void main(String[] outOfTheBox) { // 10: 
        System.out.print(new Dolls().nested()); // 11: 
    } //  12: 
} //  13:

public class DollsFindErrorsAndMethodNotReturnResult {
  
}
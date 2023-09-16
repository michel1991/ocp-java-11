package charSequence;

/**
 * What is the output of the following?
    A. e
    B. d
    C. ed
    D. None of the above
    
    Line 3 creates an empty StringBuilder. Line 4 adds three characters to it.
    Line 5 removes the first character, resulting in ed.
    Line 6 deletes the characters starting at position 1 and ending right before position 2,
    which removes the character at index 1, which is d.
    The only character left is e, so option A is correct.

 */
public class Legos { // 1: 
    public static void main(String[] args) { //   2:  
        var sb = new StringBuilder(); //     3:  
        sb.append("red"); //   4:  
        sb.deleteCharAt(0); //    5:  
        sb.delete(1, 2); //  6: 
        System.out.println(sb); //    7:  
    } //   8: 
} //     9: 
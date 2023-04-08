package advancedDesign;

/**
 * The code contains six pairs of curly braces. How many pairs can be removed without changing the behavior?
    A. One
    B. Two
    C. Three
    D. Four
    E. Five
    F. Six

   The braces on lines 12/27 are required because they comprise the method body.
   The braces on lines 24/26 are required because a switch statement
   needs braces regardless of how many case statements are inside.
   Finally, the braces on lines 18/21 are required because the else has two statements inside.
   The braces on lines 14/23, 15/22, and 16/18 are all optional
   because there is only one statement inside. Since there are three pairs, option C is correct.
 */
public class SecretReduceCurlyBraces {
    public static void main(String[] args) { // 12: 
        int secret = 0; //  13: 
        for (int i = 0; i < 10; i++) { //  14:  
            while (i < 10) { //   15:  
                if (i == 5) { //  16: 
                    System.out.println("if"); //  17:   
                } else { //  18: 
                    System.out.println("in"); //    19:  
                    System.out.println("else"); //   20: 
                } //   21:  
            } //   22: 
        } //    23:  
        switch (secret) { //    24: 
            case 0:  System.out.println("zero"); //    25: 
        } // 26: 
    } //   27:
    
}
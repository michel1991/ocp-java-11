package charSequence;

/**
 What is the output of the following class?
    A. 1
    B. 2
    C. 3
    D. 4
    E. Does not compile
    
    Line 4 creates a StringBuilder of length 5.
    Pay attention to the substring() method inStringBuilder.
    It returns a String with the value 321.
    It does not change the StringBuilder itself.
    Then line 6 retrieves the second
    indexed element from that unchanged value, which is 4. Therefore, option D is correct.
 */
 class Countdown { // 2: 
    public static void main(String[] args) { //  3: 
        var builder = new StringBuilder("54321"); //  4:  
        builder.substring(2); //   5: 
        System.out.println(builder.charAt(1)); //    6:  
    } //   7: 
}  //   8: 
public class CountdownSubstringStringBuilderOnlyExtractValue {
    public static void main(String[] args) {
        Countdown.main(args);
    }
        
}
package charSequence;

public class NonWhiteSpace {
    /**
     * Given: (below)
       Which of the following expressions can be inserted in the above code so
       that the validateInput method will return true if and only if the input
        string contains non-whitespace data?
        
        A. !str.isBlank()
            isBlank() returns true if the string is empty or contains only white space codepoints, otherwise false.
            
        B. !str.isEmpty()
             isEmpty returns true if, and only if, length() is 0. Thus, it will return false even if the string contains only spaces.
             
        C. str.strip() != ""
            String comparisons should never be done using == or != operators
            because these operators check whether two references point to
           the same object or not (instead of checking the contents).
           For a String that contains only white spaces, str.strip() will return an empty string,
           however, that empty string object may be different a one from "". Therefore,
           the reference returned by strip() may not be same as "" and the test will fail.
           
        D. !str.equalsIgnoreBlanks("")
         There is no such method.
         
        E. str.compareTo("") != 0
         String does have a compareTo method but unless you strip the string from
         its leading and trailing white spaces, a string containing just the white
         spaces will not match with "". Therefore, this is not a right test. You could do:
        str.strip().compareTo("") != 0
        
     */
    static boolean validateInput(String str){
        //return INSERT CODE HERE;
        return  str.isBlank();
    }
    public static void main(String... args){
        
    }
}
package compare.charSequence;

/**
   Which of these expressions will return true?
   
    A. "hello world".equals("hello world")
    
    B. "HELLO world".equalsIgnoreCase("hello world")
    equalsIgnoreCase() method treats both cases (upper and lower) as same.
    
    C.
       "hello".concat(" world").trim().equals("hello world")
    "hello".concat(" world") will return "hello world" and trim() won't do any change because
    there is no space at the beginning or end of the string.
    
    D.
       "hello world".compareTo("Hello world") < 0
        Notice that the Strings differ at the first position. The value returned by compareTo
        is (Unicode value of the left hand side - Unicode value of the right hand side).
        
        Although not required for the exam, it is good to know that for English alphabets,
        the unicode value of any lower case letter is always 32 more than the unicode value of the same letter in upper case.
        So, 'a' - 'A' or 'h' - 'H' is 32.
        
        Note that int value of ASCII 'a' is 97, while that of 'A' is 65.
        
    E. Hello world".toLowerCase( ).equals("hello world")
    toLowerCase() converts all uppercase letters to lower case.
    
    
    compareTo() does a lexicographical (like a dictionary) comparison.
    It stops at the first place where the strings have different letters.
    If left hand side is bigger, it returns a positive number otherwise it returns a negative number.
    The value is equal to the difference of their unicode values.
    If there is no difference then it returns zero. In this case,  it will return ( 'h' - 'H') which is 32.
    
    Correct(A, B, C, E)
    

 */
public class ReturnTrueWith {
    static boolean responseA(){
        return "hello world".equals("hello world");
    }
    
    static boolean responseB(){
        return "HELLO world".equalsIgnoreCase("hello world");
    }
    
    static boolean responseC(){
        return "hello".concat(" world").trim().equals("hello world");
    }
    public static void main(String... args){
        System.out.println("response A " + responseA());
        System.out.println("response B " + responseB());
        System.out.println("response C " + responseC());
    }
}
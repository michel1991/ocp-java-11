package advancedDesign;
import java.util.*;

public class ArraysComparison {

   /**
     Which of the following statements are true of the following code? (Choose all that apply.)
       String[] s1 = { "Camel", "Peacock", "Llama"};
       String[] s2 = { "Camel", "Llama", "Peacock"};
       String[] s3 = { "Camel"};
       String[] s4 = { "Camel", null};

        A. Arrays.compare(s1, s2) returns a positive integer.
        B. Arrays.mismatch(s1, s2) returns a positive integer.
        C. Arrays.compare(s3, s4) returns a positive integer.
        D. Arrays.mismatch(s3, s4) returns a positive integer.
        E. Arrays.compare(s4, s4) returns a positive integer.
        F. Arrays.mismatch(s4, s4) returns a positive integer.

        The compare() method returns a positive integer when the arrays are different and s1 is larger.
        This is the case for option A since the element at index 1 comes first alphabetically.
        It is not the case for option C because the s4 is longer or option E because the arrays are the same.
        The mismatch() method returns a positive integer when the arrays are different in a position index 1 or greater.
        This is the case for option B since the difference is at index 1.
        It is not the case for option D because the difference is at index 0 or option F because there is no difference.
    */
   static void compare(){
       String[] s1 = { "Camel", "Peacock", "Llama"};
       String[] s2 = { "Camel", "Llama", "Peacock"};
       String[] s3 = { "Camel"};
       String[] s4 = { "Camel", null};
       System.out.println( "Arrays.compare(s1, s2) returns a positive integer " + Arrays.compare(s1, s2) );
       System.out.println( "Arrays.mismatch(s1, s2) returns a positive integer " + Arrays.mismatch(s1, s2) );
       System.out.println( "Arrays.mismatch(s3, s4) returns a positive integer " + Arrays.mismatch(s3, s4) );

   }
    
    public static void main(String... args){
       compare();
   }
}
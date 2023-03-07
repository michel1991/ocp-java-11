package charSequence;

public class CharSequenceChoiceCorrectAnswer {
    /**
    * Which of the following return the number 5 when run independently? (Choose all that apply.)
    *   A. builder.charAt(4)
        B. builder.replace(2, 4, "6").charAt(3)
        C. builder.replace(2, 5, "6").charAt(2)
        D. string.charAt(5)
        E. string.length
        F. string.replace("123", "1").charAt(2)
        G. None of the above

     Remember that indexes are zero based, which means that index 4 corresponds to 5 and option A is correct.
     For option B, the replace() method starts the replacement at index 2 and ends before index 4.
     This means two characters are replaced, and charAt(3) is called on the intermediate value of 1265.
     The character at index 3 is 5, making option B correct.
     Option C is similar, making the intermediate value 126 and returning 6.
     Option D results in an exception since there is no character at index 5.
     Option E is incorrect.
     It does not compile because the parentheses for the length() method are missing.
     Finally, option F’s replace results in the intermediate value 145.
     The character at index 2 is 5, so option F is correct.
     */
   static void findToPrintFive(){
       var string = "12345";
       var builder = new StringBuilder("12345");
   }
}
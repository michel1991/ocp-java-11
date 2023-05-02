package charSequence;

public class TrimOperation {
    /**
     *  Which of the following can fill in the blank so the code prints true?
        A. happy.substring(0, happy.length() - 1)
        B. happy.substring(0, happy.length())
        C. happy.substring(1, happy.length() - 1)
        D. happy.substring(1, happy.length())
        
        The trim() method returns a String with all leading and trailing white space removed.
        In this question, that’s the seven-character String: ":) - (:".
        Options A and B are incorrect because they do not remove the first blank space in happy.
        Option D is incorrect because it does not remove the last character in happy.
        Therefore, option C is correct.
     */
   static void removeSpaceAndCompare(){
       var happy = " :) - (: ";
       var really = happy.trim();
       var question =  happy.substring(1, happy.length() - 1); // _____________________
       System.out.println(really.equals(question));
   }
    
    public static void main(String... args){
        removeSpaceAndCompare();
    }
}
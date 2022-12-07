package operations;
public class BlockStatement {
    /**
    * What is the output of the following code snippet? (Choose all that apply.)
    *   A. Too Low
        B. Just Right
        C. Too High
        D. A NullPointerException is thrown at runtime.
        E. The code will not compile because of line 7.
        F. The code will not compile because of line 8.

      The code compiles and runs without issue, so options D, E, and F are incorrect.
      Even though the two consecutive else statements on lines 7 and 8 look a little odd, they are associated with separate if statements on lines 5 and 6, respectively.
      The value of humidity on line 4 is equal to -4 + 12, which is 8.
      The first if statement evaluates to true on line 5, so line 6 is executed and its associated else statement on line 8 is not.
      The if statement on line 6 evaluates to false, causing the else statement on line 7 to activate.
      The result is the code prints Just Right, making option B the correct answer.
     */
   static void choiceTemperature(){
       int temperature = 4; //  3:
       long humidity = -temperature + temperature * 3; // 4:
       if (temperature>=4) //   5:
           if (humidity < 6) System.out.println("Too Low"); //  6:
           else System.out.println("Just Right"); // 7:
       else System.out.println("Too High"); //   8:
   }

    public static void main(String... args){

   }
}
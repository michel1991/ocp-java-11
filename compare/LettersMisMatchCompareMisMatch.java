package compare;
import java.util.*;

public class LettersMisMatchCompareMisMatch {

    /**
     *  Which of the following sequences can fill in the blanks so the code prints -1 0 2?
        A. compare, mismatch, compare
        B. compare, mismatch, mismatch
        C. mismatch, compare, compare
        D. mismatch, compare, mismatch
        E. None of the above

        When the arrays are the same, the compare() method returns 0,
        while the mismatch() method returns -1.
        This narrows it down to option C or option D.
         When the arrays are different, mismatch() returns
         the index of the first element that is different.
         In our case, this is index 2, making option D correct.
         By contrast, the compare() method would
         return a negative number if filling in the third blank since 'i' is smaller than 'o'.
     */
  static void choiceAnswer(){
      char[][] letters = new char[][] {
              new char[] { 'a', 'e', 'i', 'o', 'u'},
   new char[] { 'a', 'e', 'o', 'u'} };

      /*var x = Arrays.____________(letters[0], letters[0]);
      var y = Arrays.____________(letters[0], letters[0]);
      var z = Arrays.____________(letters[0], letters[1]);*/

        var x = Arrays.mismatch(letters[0], letters[0]);
      var y = Arrays.compare(letters[0], letters[0]);
      var z = Arrays.mismatch(letters[0], letters[1]);

      System.out.print(x + " " + y + " " + z);

  }

    public static void main(String... args){
        choiceAnswer();
    }
}
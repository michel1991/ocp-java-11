package arrays.declaration;
import java.util.*;

public class CheckSize {
    /**
      What is the output of the following?

        A. 1 2
        B. 2 1
        C. 2 2
        D. The code does not compile.
        E. The code compiles but throws an exception at runtime.

        This array has two elements, making listing.length output 2.
        While each array element does not have the same size,
        this does not matter because we are only looking at the first element.
        The first element has one. This makes the answer option B.

     */
  static void checkSize(){
      var listing = new String[][] {
              { "Book" }, { "Game", "29.99" } };
      System.out.println(listing.length + " " + listing[0].length);
  }

   public static void main(String... args){
            checkSize();
    }
}
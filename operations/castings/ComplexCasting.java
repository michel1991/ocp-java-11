package operations.castings;

public class ComplexCasting {
    /**
    * The code compiles and runs without issue, making options F and G incorrect.
    * On the first line, 5f is cast to an int and then promoted to double, resulting in key being assigned a value of 5.0.
    *  On the second line, key is incremented to 6.0, although the original value 5.0 is returned by key++.
    * After two casts, note is assigned a value of 5. Remember that char is the same size as short,
    * and every char has a numeric value when promoted to long. Finally, since note is 5, 5 % 2 is 1,
    * which is promoted to the double value 1.0 and assigned to song. For these reasons, 6.0, 5, 1.0 is printed,
    * and option E is the correct answer.
     */
  public  static void  firstCasting(){
      double key = (int)5f;
      long note = (char)(byte)key++;
      double song = note % 2;
      System.out.print(key+", "+note+", "+song);
  }

    /**
     * Which exception will the following throw?
        A. ArrayIndexOutOfBoundsException
        B. ClassCastException
        C. IllegalArgumentException
        D. NumberFormatException
        E. None of the above

        There is nothing wrong with this code. It outputs 5.
        We’ve included this question as a reminder that just because you
        are asked about exceptions doesn’t mean one is thrown.
     */
    static void castingArrayOfIntUsingObjectWithoutException(){
        int[] nums = new int[] { 1, 0, 2 };
        Object p = nums;
        int[] two = (int[]) p;
        System.out.println(10 / two[2]);
    }

    /**
       Which of the following can fill in the blank to have the code compile and run without error? (Choose all that apply.)
        A. double
        B. int
        C. long
        D. String
        E. Object
        F. None of the above

        Since the number 9 is small, it can successfully fit into any of the numeric types, making options A, B, and C correct.
        Additionally, an int can be autoboxed into an Integer. Since this is an Object, option E is also correct.

     */
    static void simple(){
        int numberReindeer = 9;
        System.out.println( (int) numberReindeer); // _____________
    }

    public static void main(String... args){
      firstCasting();
    }
}
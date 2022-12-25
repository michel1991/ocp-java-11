package operations;

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
        What is the output of the following code snippet?
        A. 1-11-2
        B. 3.0-11.0-2
        C. 1.0-11.0-3
        D. 3.0-13.0-3
        E. 3.0f-12-2
        F. The code does not compile because one of assignments requires an explicit numeric cast.

        Initially, moon is assigned a value of 9, while star is assigned a value of 8.
        The multiplication operator (*) has a higher order of precedence than the addition operator (+), so it gets evaluated first.
        Since star is not greater than 10, sun is assigned a value of 3, which is promoted to 3.0f as part of the assignment.
        The value of jupiter is (3.0f + 9) – 1.0, which is 11.0f.
        This value is implicitly promoted to double when it is assigned.
        In the last assignment, moon is predecremented from 9 to 8, with the value of the expression returned as 8.
        Since 8 less than or equal to 8 is true, mars is set to a value of 2.
        The final output is 3.0-11.0-2, making option B the correct answer.
        Note that while Java outputs the decimal for both float and double values, it does not output the f for float values.
        For more information, see Chapter 3.
    */
    static void sunJupiterMars(){
        int moon = 9, star = 2 + 2 * 3;
        float sun = star>10 ? 1 : 3;
        double jupiter = (sun + moon) - 1.0f;
        int mars = --moon <= 8 ? 2 : 3;
        System.out.println(sun+"-"+jupiter+"-"+mars);
    }

    /**
       Which exception will the following throw?
        A. ArrayIndexOutOfBoundsException
        B. ClassCastException
        C. IllegalArgumentException
        D. NumberFormatException
        E. None of the above

        The cast is fine because both types are the same. The last line refers to an invalid index of the array.
        Remember that array indexes begin with zero.
     */
    static void castingArrayOfIntUsingObject(){
        int[] nums = new int[] { 1, 4, 6};
        Object p = nums;
        int[] two = (int[]) p;
        System.out.println(two[two.length]);
    }

    public static void main(String... args){
      firstCasting();
    }
}
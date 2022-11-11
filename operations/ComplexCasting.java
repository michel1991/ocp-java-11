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

    public static void main(String... args){
      firstCasting();
   }
}
package operations;

public class ErrorPromotedToLong {
    /**
    * The first line contains a compilation error. The value 3 is cast to long.
    * The 1 * 2 value is evaluated as int but promoted to long when added to the 3.
    * Trying to store a long value in an int variable triggers a compiler error.
    * The other lines do not contain any compilation errors, as they store smaller values in larger or same-size data types, with the third and fourth lines using casting to do so.
     */
  public static void main(String... args){
      int note = 1 * 2 + (long)3;
      short melody = (byte)(double)(note *= 2);
      double song = melody;
      float symphony = (float)((song == 1_000f) ? song * 2L : song);
  }
}
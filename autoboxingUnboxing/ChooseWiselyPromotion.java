package autoboxingUnboxing;

/**
 * What is the output of the following application? (Choose two.)
 *  A. 2
    B. 3
    C. 5
    D. 6
    E. 8

  On line 10, we are passing a float.
  Since there is no exact match,
  Java attempts promotion of the primitive type to double,
  before trying to wrap it as a Float, making option D correct.
  On line 11, the value 2 is first cast to a byte.
  It is then increased by one using the addition + operator.
  The addition + operator automatically promotes all byte and short values to int.
  Therefore, the value passed to choose() in the main() method is an int.
  The choose(int) method is called, returning 5 and making option A the correct answer.
  Note that without the addition operation in the main() method,
  byte would have been used as the parameter to the choose() method,
  causing the choose(short) to be selected as the next closest type and outputting 2,
  making option C the correct answer.
 */
class ChooseWisely { // 1:
    public ChooseWisely() { super(); } //  2:
    public int choose(int choice) { return 5; } //  3:
    public int choose(short choice) { return 2; } //  4:
    public int choose(long choice) { return 11; } //   5:
    public int choose(double choice) { return 6; } // 6:
    public int choose(Float choice) { return 8; } //  7:
    public static void main(String[] path) { // 8:
        ChooseWisely c = new ChooseWisely(); //  9:
        System.out.println(c.choose(2f)); // 10:
        System.out.println(c.choose((byte)2+1)); //   11:
    } //  12:
} //    13:

public class ChooseWiselyPromotion {
    public static void main(String[] path) {
        ChooseWisely.main(path);
    }
}
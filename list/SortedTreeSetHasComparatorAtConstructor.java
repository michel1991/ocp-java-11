package list;
import java.util.*;

/**
* What is the result of the following program?
*   A. [55, 88] [55, 88]
    B. [55, 88] [88, 55]
    C. [88, 55] [55, 88]
    D. [88, 55] [88, 55]
    E. The code does not compile.
    F. A runtime exception is thrown.

   This question is difficult because it defines both Comparable and Comparator on the same object.
   The t1 object doesn’t specify a Comparator, so it uses the Comparable object’s compareTo() method.
   This sorts by the text instance variable.
   The t2 object did specify a Comparator when calling the constructor, so it uses the compare() method, which sorts by the int.
 */
class Sorted // 3:
implements Comparable<Sorted>, Comparator<Sorted> { // 4:
   // 5:
   private int num; // 6:
    private String text; //  7:
    //8:
//9:     // Assume getters/setters/constructors provided
//10:
    public Sorted(int num, String text){
      this.num = num;
      this.text = text;
    }
    public String toString() { return "" + num; } // 11:
    public int compareTo(Sorted s) { // 12:
        return text.compareTo(s.text); // 13:
    } // 14:
    public int compare(Sorted s1, Sorted s2) { // 15:
        return s1.num - s2.num; //   16:
    } //   17:
    public static void main() { // 18:
        var s1 = new Sorted(88, "a"); //  19:
        var s2 = new Sorted(55, "b"); //  20:
        var t1 = new TreeSet<Sorted>(); //   21:
        t1.add(s1); t1.add(s2); //  22:
        var t2 = new TreeSet<Sorted>(s1); //  23:
        t2.add(s1); t2.add(s2); //     24:
        System.out.println(t1 + " " + t2); //  25:
    } } //   26:

public class SortedTreeSetHasComparatorAtConstructor{
    public static void main(String... args) {
        Sorted.main();
    }

}
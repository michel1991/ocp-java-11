/*
  Which statements about the following program are true? (Choose all that apply.)

    A. Immediately after line 8, no Grasshopper objects are eligible for garbage collection.
    B. Immediately after line 9, no Grasshopper objects are eligible for garbage collection.
    C. Immediately after line 8, only one Grasshopper object is eligible for garbage collection.
    D. Immediately after line 9, only one Grasshopper object is eligible for garbage collection.
    E. Immediately after line 10, only one Grasshopper object is eligible for garbage collection.
    F. The code does not compile.

   Immediately after line 8, only Grasshopper g1, created on line 6,
   is eligible for garbage collection since both one and two point to Grasshopper g2,
   making option C correct and option A incorrect.
   Immediately after line 9, we still only have Grasshopper g1 eligible for garbage collection,
   since one points to it. For this reason, option B is incorrect and option D is correct.
   Reference two now points to null.
   Immediately after line 10, both Grasshopper objects are eligible for garbage collection
    since both one and two point to null,making option E incorrect.
   The code does compile, so option F is incorrect.
   Although it is traditional to declare instance variables early in the class, you don’t have to.
   For more information, see Chapter 2.

   Response are. C. D
   *
 */
package garbage;

class Grasshopper { // 1:
    public Grasshopper(String n) { //   2:
        name = n; //   3:
    } //  4:
    public static void main(String[] args) { //   5:
        Grasshopper one = new Grasshopper("g1"); //  6:
        Grasshopper two = new Grasshopper("g2"); //   7:
        one = two; //   8:
        two = null; //    9:
        one = null; //  10:
    } //    11:
    private String name; //  12:
} //   13:

public class GrasshopperGarbageCollector {

    public static void main(String[] args) {
        Grasshopper.main(args);
    }

}
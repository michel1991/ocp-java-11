package advancedDesign;
interface Hops {} // 1:
/**
* Which statements about the following class are correct? (Choose all that apply.)
    A. The object created on line 4 is eligible for garbage collection after line 8.
    B. The object created on line 4 is eligible for garbage collection after line 13.
    C. The object created on line 5 is eligible for garbage collection after line 9.
    D. The object created on line 5 is eligible for garbage collection after line 13.
    E. The object created on line 6 is eligible for garbage collection after line 11.
    F. The object created on line 6 is eligible for garbage collection after line 13.
    G. The call to System.gc() guarantees garbage collection will run.
    H. The call to System.gc() is the only time garbage collection will run in this program.

  The JVM controls when and if garbage collection happens, with no guarantees to the application code when it might occur, making options G and H both incorrect.
  To solve this problem, we need to track the number of references for each object created on lines 4 through 6.
  The object created on line 4 has two references to it after line 7 and drops down to just one reference, hopper, after line 8.
  After line 9, the object created on line 4 now has two references, hopper and silly, although the object created on line 5 is now inaccessible, making option C correct.
  After line 10, the object created on line 4 has one reference, silly, while the object created on line 6 also has two references, hopper and snuggly.
  One of those references for this object is dropped after line 11.
  The result is the method ends with one reference to the object created on line 4, silly, and one reference to the object created on line 6, hopper.
  These objects go out of scope when the method ends, making options B and F correct.

 */
public class HopsEligibleForGarbageCollection implements Hops { // 2:
    public static void main(String... unusedData) { // 3:
        Bunny fluffy = new Bunny(); //   4:
        Bunny silly = new Bunny(); //   5:
        Bunny snuggly = new Bunny(); //  6:
        Hops hopper = fluffy; //  7:
        fluffy = null; // 8:
        silly = (Bunny)hopper; //  9:
        hopper = snuggly; //  10:
        snuggly = null; //  11:
        System.gc(); //  12:
    } //  13:
}// 14
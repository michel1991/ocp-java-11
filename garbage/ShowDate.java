package garbage;
import java.util.Date; // 1

/**
* Suppose we have the following class named ShowDate. Which one of the statements is true?
*
    A. The Date object from line 4 is eligible for garbage collection immediately following line 6.
    B. The Date object from line 4 is eligible for garbage collection immediately following line 8.
    C. The Date object from line 4 is eligible for garbage collection immediately following line 9.
    D. The code does not compile.
    E. The code throws an exception.

   The Date object from line 4 has two references to it: a and c.
   It becomes eligible for garbage collection after line 9, when both a and c no longer point to the object.
   Therefore, the answer is option C.
 */
public class ShowDate { // 2:
    public static void main(String [] args) { //     3:
        var a = new Date(); //   4:
        var b = new Date(); //   5:
        var c = a; //  6:
        System.out.println(c.toString()); //   7:
        a = null; //  8:
        c = null; // 9:
    } } //  10:

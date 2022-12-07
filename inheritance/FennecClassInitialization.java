package inheritance;
/**
* What is the output of the following program?
* A. qpz
  B. qpzj
  C. jzpa
  D. apj
  E. apjm
  F. The code does not compile.
  G. None of the above

  The program compiles, making option F incorrect.
  The constructors are called from the child class upward, but since each line of a constructor is a call to another constructor, via this() or super(),
  they are ultimately executed in top-down manner.
  On line 29, the main() method calls the Fennec() constructor declared on line 19.
   Remember, integer literals in Java are considered int by default.
  This constructor calls the Fox() constructor defined on line 12, which in turn calls the overloaded Fox() constructor declared on line 11.
  Since the constructor on line 11 does not explicitly call a parent constructor, the compiler inserts a call to the no-argument super() constructor,
  which exists on line 3 of the Canine class.
  Since Canine does not extend any classes, the compiler will also insert a call to the no-argument super() constructor defined in java.lang.Object,
  although this has little impact on the output.
  Line 3 is then executed, adding q to the output, and the compiler chained is unwound.
  Line 11 then executes, adding p, followed by line 14, adding z.
  Finally, line 21 is executed, and j is added, resulting in a final value for logger of qpzj, and making option B correct.
  For the exam, remember to follow constructors from the lowest level upward to determine the correct pathway,
  but then execute them from the top down using the established order.

*
 */
   class Canine { // 1
       public Canine(boolean t) { logger.append("a"); } // 2:
    public Canine() { logger.append("q"); } //   3:
    //4:
    private StringBuilder logger = new StringBuilder(); // 5:
    protected void print(String v) { logger.append(v); } // 6:
    protected String view() { return logger.toString(); } //  7:
   } //  8:
  //9:
  class Fox extends Canine { // 10:
       public Fox(long x) { print("p"); } // 11:
    public Fox(String name) { //  12:
           this(2); // 13:
        print("z"); // 14:
       } //  15:
   } // 16:
// 17:
class Fennec extends Fox { // 18:
       public Fennec(int e) { // 19:
           super("tails"); // 20:
           print("j"); //  21:
       } //  22:
    public Fennec(short f) { //  23:
           super("eevee"); //  24:
        print("m"); // 25:
       } //  26:
   // 27:
 } // 30:
public class FennecClassInitialization {
    public static void main(String... unused) { // 28:
        System.out.println(new Fennec(1).view()); // 29:
    }
}
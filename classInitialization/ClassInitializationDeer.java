package classInitialization;

/**
* What is the output of the following program?
* A. ReindeerDeer,false
  B. DeerAgeReindeer,true
  C. DeerReindeer,true
  D. DeerReindeer,false
  E. ReindeerDeer,true
  F. DeerAgeReindeer,false
  G. The code will not compile because of line 4.
  H. The code will not compile because of line 12.

   The code compiles and runs without issue, so options G and H are incorrect.
   First, the Reindeer object is instantiated using the constructor that takes an int value.
  Since there is no explicit call to the parent constructor, the compiler inserts super() as the first line of the constructor on line 7.
  The parent constructor is called, and Deer is printed on line 2.
  The flow returns to the constructor on line 7, which prints Reindeer.
  Next, the method hasHorns() is called. The reference type is Deer, and the underlying object type is Reindeer.
  Since Reindeer correctly overrides the hasHorns() method, the version in Reindeer is called, printing true.
  For these reasons , option C is the correct answer. For more information, see Chapter 8.
 */
 class Deer { // 1:
     public Deer() {System.out.print("Deer");} // 2:
    public Deer(int age) {System.out.print("DeerAge");} //  3:
    protected boolean hasHorns() { return false; } //  4:
 } //  5:

class Reindeer extends Deer { // 6:
     public Reindeer(int age) {System.out.print("Reindeer");} //  7:
    public boolean hasHorns() { return true; } // 8:
     } //  12:
public class ClassInitializationDeer {
    public static void main(String[] args) {  //    9:
        Deer deer = new Reindeer(5);  //  10:
        System.out.println("," + deer.hasHorns()); //   11:
    } //  12:
}
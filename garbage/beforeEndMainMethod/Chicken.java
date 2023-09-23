package garbage.beforeEndMainMethod;

/**
  Suppose you have the following code. Which of the images
  best represents the state of the references c1, c2, and c3, right before
  the end of the main() method, assuming garbage collection hasn’t run? In the diagrams,
   each box represents a Chicken object with a number of eggs. (See chicken images)

    A. Option A.
    B. Option B.
    C. Option C.
    D. Option D.
    E. The code does not compile.
    F. None of the above.


    Three instances of Chicken are created on lines 8–10. On line 11,
    the value of eggs in the first two instances is set to 2,
    while the third instance has a value of 3.
    
    On line 12, the original instance that was pointed to by c1 (with an eggs value of 2)
    is dereferenced and eligible for garbage collection.
    
    The c1 and c2 variables now both point to the same instance with an egg value of 2.
    Finally, on line 13, the eggs value for c3 is changed from 3 to null.
 */
public class Chicken { // 1:
    private Integer eggs = 2; // 2:
    { this.eggs = 3; } //  3:
    public Chicken(int eggs) { //    4:
        this.eggs = eggs; //  5:
    } //  6:
    public static void main(String[] r) { //   7:
        var c1 = new Chicken(1); // 8:
        var c2 = new Chicken(2); // 9:
        var c3 = new Chicken(3); // 10:
        c1.eggs = c2.eggs; //  11:
        c2 = c1; //  12:
        c3.eggs = null; //   13:
    } } //   14:

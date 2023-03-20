package garbage;

/**
 *  How many objects are eligible for garbage collection right before the end of the main() method?
    A. None.
    B. One.
    C. Two.
    D. Three.
    E. The code does not compile.

    On line 9, all three objects have references.
    The elena and zoe objects have a direct reference.
    The janeice object is referenced through the elena object.
    On line 10, the reference to the janeice object is replaced
    by a reference to the zoe object.
    Therefore, the janeice object is eligible to be garbage collected, and option B is correct.

 */
public class Person { // 1:
    public Person youngestChild; //  2:
   // 3:
    public static void main(String... args) { // 4:
        Person elena = new Person(); // 5:
       Person janeice = new Person(); //  6:
       elena.youngestChild = janeice; //  7:
       janeice = null; //   8:
       Person zoe = new Person(); // 9:
       elena.youngestChild = zoe; //   10:
       zoe = null; //  11:
    } } //     12:
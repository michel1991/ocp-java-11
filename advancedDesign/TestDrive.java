package advancedDesign;

/**
 * What is the output of the following code? (Choose all that apply.)
    A. 0
    B. 10
    C. 20
    D. 30
    E. 40
    F. The code does not compile.

    The code compiles, so option F is incorrect.
    The Car object on line 6 has an initial velocity of 10 from the Car object instantiation.
    The call to go() on line 7 changes its velocity to 20.
    The stolen reference on line 9 points to the same Car object, so calling go() changes the velocity to 30.

 */
class Car { // 1:
    public int velocity = 10; //   2:
} //  3:
public class TestDrive {
    public static void go(Car c) {
        c.velocity += 10; //  3:
    } // 4:
    public static void main(String[] args) { //  5:
        Car porsche = new Car(); // 6:
        go(porsche); //  7:
       // 8:
        Car stolen = porsche; //  9:
        go(stolen); // 10:
        // 11:
        System.out.println(porsche.velocity); //  12:
    } //  13:
}
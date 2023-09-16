package interfaces.errors.finalConstant;

/**
*  What is the result of compiling the following code?
*   A. The code compiles without issue.
    B. The first compiler error is on line 2.
    C. The first compiler error is on line 3.
    D. The first compiler error is on line 5.
    E. The first compiler error is on line 6.
    F. The first compiler error is on line 7.
    G. The code compiles but throws an exception at runtime.

   The code does not compile properly, so options A and G are incorrect.
   The compilation error is in line 2; SPEED is an interface variable,
   and all interface variables are implicitly assumed public static final.
   Since SPEED is assumed final, it must declare a value when it is initialized.
   Because there is no such default value, the code will not compile, and option B is the correct answer.
 */
interface CanSwim { // 1:
    public static int SPEED; //  2:
    public void swim(); //   3:
} //  4:
public class MantaRay implements CanSwim { // 5:
    public void swim() {  //   6:
        System.out.println("MantaRay is swimming: "+SPEED); //   7:
    } //  8:
}//9:

public class CanSwimImplicitFinalSpecifierOnConstant {

}
package inheritance.override;

import java.util.*; // 1:

interface CanSwim {} // 2:
class Amphibian implements CanSwim {} //3:
abstract class Tadpole extends Amphibian {} //4:

/*
  Which of the following types can be inserted into
  the blank that allows the program to compile successfully? (Choose all that apply.)

    A. CanSwim
    B. Boolean
    C. Amphibian
    D. Tadpole
    E. Object
    F. None of the above; the program contains a compilation error.

   The for-each loop implicitly casts each Tadpole object to an Amphibian reference,
   which is permitted because Tadpole is a subclass of Amphibian.
   From there, any supertype of Amphibian is permitted without an explicit cast.
   This includes CanSwim, which Amphibian implements, and Object,
   which all classes extend from, making options A and E correct.
   Option C is also correct since the reference is being cast to the same type.
   Option B is incorrect, since Boolean is not a supertype of Amphibian. Option D is also incorrect.
   Even though the underlying object is a Tadpole instance,
  it requires an explicit cast on line 9 since the reference type is Amphibian.
   Option F is incorrect because there are options that allow the code to compile.
   For more information, see Chapter 8.

 */
public class FindAllTadpole {
    public static void main(String[] args) { //  6:
        var tadpoles = new ArrayList<Tadpole>(); //  7:
        for (Amphibian amphibian : tadpoles) { //  8:
            CanSwim tadpole = amphibian; //  9:  ____________ 
        } } //  10:
}
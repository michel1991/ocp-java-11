package encapsulation;

/**
 *  Which changes made to the following class would help to properly encapsulate the data in the class?
    A. Add a getter method for material.
    B. Add a setter method for material.
    C. Change the access modifier of material to protected.
    D. Change the access modifier of strength to private.
    E. None of the above.

   The access modifier of strength is protected, meaning subclasses and classes within the same package can modify it.
   Changing the value to private would improve encapsulation by making
   the Protect class the only one capable of directly modifying it.
   For these reasons, option D is correct.

 */
class Protect {
    private String material;
    protected int strength;

    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
}
public class ProtectChangeToImproveEncapsulation {

}
package inheritance.errors.visibility;

/**
   What is the output of the Rocket program?
    A. 2,5
    B. 3,4
    C. 5,2
    D. 3,5
    E. The code does not compile.
    F. None of the above.

    The code does not compile because super.height
    is not visible in the Rocket class, making option E the correct answer.
    Even though the Rocket class defines a height value,
    the super keyword looks for an inherited version.
    Since there are none, the code does not compile.
     Note that super.getWeight() returns 3 from the variable in the parent class,
     as polymorphism and overriding do not apply to instance variables.
 */
class Ship {
    protected int weight = 3;
    private int height = 5;
    public int getWeight() { return weight; }
    public int getHeight() { return height; }
}

class Rocket extends Ship {
    public int weight = 2;
    public int height = 4;
    public void printDetails() {
        System.out.print(super.getWeight()+","+super.height);
    }
    public static final void main(String[] fuel) {
        new Rocket().printDetails();
    }
}

public class RocketCannotAccessOnPrivateMemberOfParent {

}
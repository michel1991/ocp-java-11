package inheritance;
class Bird {
    int feathers = 0;
    Bird(int x) { this.feathers = x; }
    Bird fly() {
        return new Bird(1);
    }
}

class Parrot extends Bird {
    protected Parrot(int y) { super(y); }
    protected Parrot fly() {
        return new Parrot(2);
    }
}

class Macaw extends Parrot {
    public Macaw(int z) { super(z); }
    public Macaw fly() {
        return new Macaw(3);
    }
}

/*
  * The compiles and runs without issue, making options A through D incorrect.
  * The fly() method is correctly overridden in each subclass since the signature is the same,
  *  the access modifier is less restrictive, and the return types are covariant.
  * For covariance, Macaw is a subtype of Parrot, which is a subtype of Bird,
  * so overridden return types are valid. Likewise, the constructors are all implemented properly,
  * with explicit calls to the parent constructors as needed.
  * Line 19 calls the overridden version of fly() defined in the Macaw class, as overriding replaces the method
  * regardless of the reference type. This results in feathers being assigned a value of 3.
  * The Macaw object is then cast to Parrot, which is allowed because Macaw inherits Parrot.
  * The feathers variable is visible since it is defined in the Bird class, and line 19 prints 3,
  * making option E the correct answer.
*/
public class AccesFieldWithPrivatePackageAndInheritance {
    public static void main(String... sing) {
        Bird p = new Macaw(4);
        Macaw m = new Macaw(5);
        System.out.print(((Parrot)p.fly()).feathers);
    }
}

package inheritance.casting;

/**
 * What is the output of the ElectricCar program?
    A. Driving vehicle
    B. Driving electric car
    C. Driving car
    D. The code does not compile.
    E. The code compiles but produces a ClassCastException at runtime.
    F. None of the above.
    
    The drive() method in the Car class does not override
    the private version in the Automobile class since the method
    is not visible to the Car class. Therefore,
    the final attribute in the Automobile class does not prevent
    the Car class from implementing a method with the same signature.
    The drive() method in the ElectricCar class is a valid override
    of the method in the Car class, with the public access modifier
    expanding access in the subclass. In the main() method, the object created is an ElectricCar,
    even if it is assigned to a Car or Automobile reference.
    Due to polymorphism, the method from the ElectricCar will be invoked,
    making option B the correct answer.
 */
class Automobile {
    private final String drive() { return "Driving vehicle"; }
}
class Car extends Automobile {
    protected String drive() { return "Driving car"; }
}
public class ElectricCar extends Car {
    public final String drive() { return "Driving electric car"; }
    public static void main(String[] wheels) {
        final Automobile car = new ElectricCar();
        var v = (Car)car;
        System.out.print(v.drive());
    }
}
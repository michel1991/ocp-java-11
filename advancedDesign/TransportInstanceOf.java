package advancedDesign;

/**
  What does the following print?
    A. false false false
    B. false false true
    C. false true true
    D. true false true
    E. true true false
    F. true true true

    While using null with instanceof compiles,
    it always returns false. The other two instanceof
    calls show that instanceof can be used with both classes and interfaces.
    They both return true since Bus implements Vehicle, making option C correct.
 */
interface Vehicle {}
class Bus implements Vehicle {}

class Transport {
    public static void main(String[] args) {
        Bus bus = new Bus();
        boolean n = null instanceof Bus;
        boolean v = bus instanceof Vehicle;
        boolean b = bus instanceof Bus;
        System.out.println(n + " " + v + " " + b);
    }
}


public class TransportInstanceOf {
    public static void main(String[] args) {
        Transport.main(args);
    }
}
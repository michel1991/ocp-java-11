package compare;

/**
 * Fill in the blank to make this code compile:
    A. compare(Truck t)
    B. compare(Truck t1, Truck t2)
    C. compareTo(Truck t)
    D. compareTo(Truck t1, Truck t2)
    E. None of the above

    When implementing Comparable˂Truck˃, you implement the compareTo() method.
    Since this is an instance method, it already has a reference to itself and
    only needs the item it is comparing. Only one parameter is specified,
    and option C is correct. By contrast, the Comparator˂Truck˃ interface uses the compare() method,
    and the method takes two parameters.
 */
public class Truck implements Comparable<Truck>{
    private int id;
    public Truck(int id) {
        this.id = id;
    }
   @Override
   public int compareTo(Truck t) { // int _______________________ {
        return id - t.id;
    }
}
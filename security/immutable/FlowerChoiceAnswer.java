package security.immutable;

import java.util.*;

/**
 *
    Which statement about the following classes is correct?
    
    A. Only Floweris immutable.
    B. Only Plantis immutable.
    C. Both classes are immutable.
    D. Neither class is immutable.
    E. None of the above as one of the classes does not compile.
    
    An immutable class must not allow the state to change. The Flower class does this correctly.
    While the class isn’t final, the getters are, so subclasses can’t change the value returned.
    The Plant class lacks this protection, which makes it mutable. Option A is correct.
    Note: This is mine, subclass could not change value

 */
class Flower {
    private final String name;
    private final List<Integer> counts;
    public Flower(String name, List<Integer> counts) {
        this.name = name;
        this.counts = new ArrayList<>(counts);
    }
    public final String getName() {return name; }
    public final List<Integer>getCounts() {
        return new ArrayList<>(counts);
    }}

class Plant {
    private final String name;
    private final List<Integer> counts;
    public Plant(String name, List<Integer> counts) {
        this.name = name;
        this.counts = new ArrayList<>(counts);
    }
    public String getName() { return name; }
    public List<Integer>getCounts() {
        return new ArrayList<>(counts);
    }}



public class FlowerChoiceAnswer {
  
}
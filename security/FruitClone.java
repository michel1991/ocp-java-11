package security;
import java.util.*;

class Fruit implements Cloneable{
    protected ArrayList sweet;
   @Override
    public Object clone(){
        Fruit clone =  new Fruit();
        clone.sweet = new ArrayList<>();
        return clone;
    }
}

public class FruitClone {
    /**
     * The following code prints false. Which statements best describe the Fruit class? (Choose three.)
        A. It does not implement Cloneable.
        B. It performs a deep copy.
        C. It performs a shallow copy.
        D. It overrides clone().
        E. It implements Cloneable.
        F. It does not override clone().
        
        The Fruit class must implement Cloneable;
        otherwise,an exception would be thrown at runtime, making option E correct.
        The Fruit class must also override the clone() method.
        If it did not, then a shallow copy would be performed on the sweet object,
        resulting in the code printing true at runtime. Since this is not the case,
        option D is correct. Finally, we’ve already ruled out a shallow copy,
        so by process of elimination it must perform a deep copy.
        For this reason, option B is correct.
     */
    static void applyClone(){
        var original = new Fruit();
        original.sweet = new ArrayList<>();
        var cloned = (Fruit) original.clone();
        System.out.print(original.sweet == cloned.sweet);
    }
  public static void main(String... args){
        applyClone();
  }
}
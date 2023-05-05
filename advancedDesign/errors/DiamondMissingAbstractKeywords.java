package advancedDesign.errors;
import java.io.*;

/**
    Given that FileNotFoundException is a subclass of IOException and Long is a subclass of Number,
    what is the output of the following application?
    
    A. 15
    B. It does not compile because of line q1.
    C. It does not compile because of line q2.
    D. It does not compile because of line q3.
    E. It does not compile because of line q4.
    F. The class compiles but produces an exception at runtime.
    
    This problem appears to be about overriding a method, but in fact, it is much simpler.
    The class CarbonStructure is not declared abstract,
    yet it includes an abstract method. To fix it,
     the definition of CarbonStructure would have to be changed to be an abstract class,
     or the abstract modifier would need to be removed from getCount()
     in CarbonStructure and a method body added. Since the only answer
     choice available is to change the getCount() method on line q1, option B is the correct answer.
      Note that the rest of the application, including the override on line q2,
      is correct and compiles without issue. The return types Long and
      Number are covariant since Number is a superclass of Long.
      Likewise, the exception thrown in the subclass method is narrower,
      so no compilation error occurs on q2.
 */
class CarbonStructure {
    protected long count;
    public abstract Number getCount() throws IOException; // q1
    public CarbonStructure(int count) { this.count = count; }
}
 class Diamond extends CarbonStructure {
    public Diamond() { super(15); }
    public Long getCount() throws FileNotFoundException { // q2
        return count;
    }
    public static void main(String[] cost) {
        try {
            final CarbonStructure ring = new Diamond(); // q3
            System.out.print(ring.getCount()); // q4
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class DiamondMissingAbstractKeywords {
    
}
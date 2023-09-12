package collections.errors;
import java.util.*;

/**
   What is the output of the following application?
    A. [JENNY, GRACE]
    B. [ted]
    C. [tps.Boss@4218224c, tps.Boss@815f19a]
    D. The code does not compile because of the lambda expression.
    E. The code does not compile for a different reason.
   
   The lambda expression is invalid because the input argument is of type Boss,
   and Boss does not define an equalsIgnoreCase() method, making option D the correct answer.
   If the lambda was corrected to use s.getName() instead of s,
   the code would compile and run without issue, printing [JENNY, GRACE]
   at runtime and making option A the correct answer.


 */
class Boss {
    private String name;
    public Boss(String name) {
        this.name = name;
    }
    public String getName() {return name.toUpperCase();}
    public String toString() {return getName();}
}
public class Initech {
    public static void main(String[] reports) {
        final List<Boss> bosses = new ArrayList(8);
        bosses.add(new Boss("Jenny"));
        bosses.add(new Boss("Ted"));
        bosses.add(new Boss("Grace"));
        bosses.removeIf(s -> s.equalsIgnoreCase("ted"));
        System.out.print(bosses);
    }
}
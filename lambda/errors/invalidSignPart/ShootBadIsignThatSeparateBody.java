package lambda.errors.invalidSignPart;
import java.util.*; // 2:
 import java.util.function.*; //: 3:

/**
 * What does the following do?
    A. It prints true.
    B. It prints false.
    C. It doesn’t compile due to line k1.
    D. It doesn’t compile due to line k2.
    E. It doesn’t compile due to another line.
    
    The lambda syntax is incorrect. It should be ->, not =>.
    Therefore, option D is correct. If this was fixed, option A would be correct.

 */
class Shoot {
    interface Target {
        boolean needToAim(double angle);
    }
    static void prepare(double angle, Target t) {
        boolean ready = t.needToAim(angle);  // k1
        System.out.println(ready);
    }
    public static void main(String[] args) {
        prepare(45, d ==> d > 5 || d < -5);   // k2
    }
}


public class ShootBadIsignThatSeparateBody {
    
}
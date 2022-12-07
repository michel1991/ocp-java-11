package lambda;
import java.util.List;

/**
* Which lambdas can replace the new Sloth() call in the main() method and produce the same output at runtime? (Choose all that apply.)
    A. (z,f) -> { String x = ""; return "Sleep: " + x }
    B. (t,s) -> { String t = ""; return "Sleep: " + t; }
    C. (w,q) -> {"Sleep: " + w}
    D. (e,u) -> { String g = ""; "Sleep: " + e }
    E. (a,b) -> "Sleep: " + (double)(b==null ? a : a)
    F. (r,k) -> { String g = ""; return "Sleep:"; }
    G. None of the above, as the program does not compile.

   Option A does not compile because the second statement within the block is missing a semicolon (;) at the end.
   Option B is an invalid lambda expression because t is defined twice: in the parameter list and within the lambda expression.
   Options C and D are both missing a return statement and semicolon.
   Options E and F are both valid lambda expressions, although only option E matches the behavior of the Sloth class.
   In particular, option F only prints Sleep:, not Sleep: 10.0.
 */
interface Yawn {
    String yawn(double d, List<Integer> time);
}
class Sloth implements Yawn {
    public String yawn(double zzz, List<Integer> time) {
        return "Sleep: " + zzz;
    }
}
class Vet {
    public static String takeNap(Yawn y) {
        return y.yawn(10, null);
    }
    public static void main() {
        System.out.print(takeNap(new Sloth()));
    }
}

public class VetChoiceCorrectMethod {
  
}
package lambda;
import java.util.*;

/**
    Which lambda expression can replace the instance of new BiologyMaterial()
    in the Scientist class and produce the same results under various inputted values?

     A. (p,q) -˃ q==null ? p : p+1
     B. (c,d) -˃ {int d=1; return c!=null ? d+1 : d;}
     C. (x,y) -˃ {return x==null ? y : y+1;}
     D. (a,b) -˃ 1
     E. None of the above

     First, option A does not compile, since the variables p and q are reversed,
     making the return type of the method and usage of operators invalid.
     The first argument p is a String and q is an int, but the lambda expression reverses them,
     and the code does not compile. Option B also does not compile.
     The variable d is declared twice, first in the lambda argument list
     and then in the body of the lambda expression.
     The second declaration in the body of the lambda expression causes the compiler
     to generate a duplicate local variable message.
     Note that other than it being used twice, the expression is valid;
     the ternary operator is functionally equivalent to the learn()
     method in the BiologyMaterial class.
     Option C is the correct answer since it compiles and handles the input
     in the same way as the learn() method in the BiologyMaterial class.
      Option D compiles but does not return the same result.

 */
@FunctionalInterface interface Study {
    abstract int learn(String subject, int duration);
}

class BiologyMaterial implements Study {
    @Override public int learn(String subject, int duration) {
        if(subject == null)
            return duration;
        else
            return duration+1;
    }
}

class Scientist {
    public static void main(String[] courses) {
        final Study s = new BiologyMaterial();
        System.out.print(s.learn(courses[0],
                                 Integer.parseInt(courses[1])));
    }
}

public class ScientistChoiceCorrectLambda {
    public static void main(String[] courses) {

    }
}
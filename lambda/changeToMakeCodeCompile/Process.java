package lambda.changeToMakeCodeCompile;
import java.util.function.*;


/**
 *  What changes, when applied independent of each other, will enable the following code to compile?
 
    A. Change //1 to
        final double defaultrate = 0.10;
        If you make it final, //2 will not compile.
    
   B. Remove code at //2.
        A local variable needs to be final or effectively final to be accessed from an inner class or lambda expression.
        If you remove //2, that means defaultrate never changes and is therefore effectively final.
        
   C. Replace lines at //3 and //4 with:
        BiFunction<Integer, Double, Integer> f = (m, n)->m+(int)(n*m);
        return f.apply((int)data, defaultrate);
        This will still not solve the problem with using non-final variable from an inner class.
        f.apply((int)data, defaultrate); will still not compile because default rate is not final (or effectively final).
        
   D. Change //3 to:
    Function<Integer, Integer> f = x->x+(int)(x*rate);

        
 */
//assume appropriate import statements
class TestClass{
    public double process(double payment, int rate)
    {
        double defaultrate = 0.10;        //1
        if(rate>10) defaultrate = rate;  //2
        class Implement{
            public int apply(double data){
                Function<Integer, Integer> f = x->x+(int)(x*defaultrate);  //3
                return f.apply((int)data); //4
            }
        }
        Implement i = new Implement();
        return i.apply(payment);
    }
}

public class Process {
    
}
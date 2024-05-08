package notObjectiveExams;
import java.util.*;
import java.util.stream.*;

/**
 * Which of the following code snippet will print 10 random double values?

    Note: Although not mentioned in the exam objectives, we have seen questions that require knowledge about java.lang.Random class on the exam.
    
    A.  new Random().doubles(10).forEach(System.out::print);
    
    B.
       andom r = new Random();
        DoubleStream rDoubles = r.generate().limit(10);
        rDoubles.forEach(System.out::print);
       
    C.
       Random r = new Random();
        DoubleStream rDoubles = r.doubles().limit(10);
        rDoubles.forEach(System.out::print);
        
    D.
       Random r = new Random();
    DoubleStream.generate(()->r.nextDouble()).limit(10).forEach(System.out::print);
    DoubleStream has a generate method that takes a DoubleSupplier as an argument.
    The DoubleSupplier is used to supply the double values to the stream.
    
    You could also do r::nextDouble instead of ()->r.nextDouble().
    
    E. DoubleStream.generate(Random::nextDouble).limit(10).forEach(System.out::print);
        nextDouble() is an instance method of Random. So, Random::nextDouble is incorrect here.
    
     Correct(A, C, D)
 */
public class Print10RandomDoubleValues {
    static void responseA(){
        new Random().doubles(10).forEach(System.out::print);
    }
    
    static void responseC(){
        Random r = new Random();
        DoubleStream rDoubles = r.doubles().limit(10);
        rDoubles.forEach(System.out::print);
    }
    
    static void responseD(){
        Random r = new Random();
        DoubleStream.generate(()->r.nextDouble()).limit(10).forEach(System.out::print);
    }
    
    public static void main(String...args){
        responseA();
        responseC();
    }
}
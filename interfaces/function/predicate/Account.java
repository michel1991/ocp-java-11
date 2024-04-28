package interfaces.function.predicate;
import java.util.function.*;

/**
   An existing application contains the following code:
   
   which interface from java.util.function package should be used to refactor this code?
   
   A. Consumer
    Represents an operation that accepts a single input argument and returns no result.
    
   B.  Function
    Represents a function that accepts one argument and produces a result.
    
   C. Predicate
    Represents a predicate (boolean-valued function) of one argument.
    This interface is used when you want to check for some condition. For example, the given code can be easily refactored as follows -
    
    public void updateBalance(double bal ){
    
        //using lamba expression to create a Predicate
        Predicate<Double> p = val -> val>=0.0;
    
        boolean isOK = p.test(bal);
        //other irrelevant code
    }
    
    There is no need to create the AmountValidator interface and the anonymous class.
    
    D. Supplier
    Represents a supplier of results.
-----------------------------------------------------
  All non-trivial applications perform some routine operations such as validating an object, converting some data from one type to another,
  filter a collection, and so on. Just like a for loop is not specific to an application, these operations are not really specific to an application.
  They are just common programming elements used to build higher level business logic that is specific to an application.
  The boiler plate code for such functions is common across all applications.
  java.util.function package of Java 8 captures a lot of such common operation in functional interfaces.
  Check out these links to learn the basic of this topic:
    http://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html#approach6
    http://radar.oreilly.com/2014/08/java-8-functional-interfaces.html
    
    
    The exam requires you to know about pretty much all the functional interfaces in java.util.function package.
    But don't be alarmed by the large number of interfaces.
    Most are just duplicates created to support operations on primitives such as int, double, and long.
    Check out https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html to learn more.
 Correct(C)

 */
interface AmountValidator{
    public boolean checkAmount(double value);
}
public class Account {
    public void updateBalance(double bal ){

        boolean isOK = new AmountValidator(){
            public boolean checkAmount(double val){
                return val >= 0.0;
            }
        }.checkAmount(bal);
    
        //other irrelevant code
    }
}

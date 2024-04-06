package stream.tricky;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class MappingToSameStream {
    /**
     *  Given:
        DoubleStream ds =  DoubleStream.of(1.0, 2.0, 3.0);
        //INSERT CODE HERE
        ds.map(doubleF.apply(5.0)).forEach(System.out::println);
        
        Which of the following statements can be inserted in the above code?
        
        A. DoubleFunction<IntUnaryOperator> doubleF = m->n->(int)m+n;
            This statement is correct in itself but it cannot be used in the given situation because DoubleStream's
            map method expects an argument of type DoubleUnaryOperator, but if you define doubleF as given in this option,
            calling doubleF.apply(5.0), will return an IntUnaryOperator.
            
        B. DoubleFunction<DoubleUnaryOperator> doubleF = m->n->m+n;
        
        C. DoubleFunction<Double> doubleF = m->n->m+n;
            This statement is invalid in itself and will not compile because Double is not a functional interface.
            Therefore, n->m+n cannot be used to return a Double instance.
           
        D. DoubleFunction<Double> doubleF = m->n->m*1.0/n;
            This statement is invalid in itself and will not compile because Double is not a functional interface.
            Therefore, n->m*1.0/n cannot be used to return a Double instance.
            
        The basic idea behind the map method is to convert each element of a stream to a different value using some form of a unary operator.
        This unary operator is applied on each original element and the resulting value of that operation is then used in the resulting stream.

        Now, in this question we are using a DoubleStream and so, its map method expects an operation
        that can accept a double value and convert it to some other double value. (Note that the resulting stream, therefore,
        will also be of type DoubleStream).
        
        Thus, it is clear that we cannot use IntUnaryOperator or Double as an argument to the map method.
        DoubleUnaryOperator is a function that accepts a double value and returns a double and can be used here.
        
        Let us now look at the lambda expression m->n->m+n. It looks complicated but it is actually simple if you group it like this:
        m->(n->m+n);
        
        Since we are assigning this lambda expression to a DoubleFunction<DoubleUnaryOperator>,
        it implies that we are trying to using this lambda expression to implement a DoubleFunction
        that converts a double into a DoubleUnaryOperator. Thus, m will be the argument
        to this DoubleFunction and  n->m+n will be used as the body of the DoubleFunction's apply method
        that generates an instance of DoubleUnaryOperator. In this DoubleUnaryOperator instance, n will be the argument and m+n will be the body.
        
        So, when you call ds.map(doubleF.apply(5.0)), doubleF's apply method is invoked for each element
        of the stream with m as 5.0. The apply method will return an instance of DoubleUnaryOperator, where
        the variable n will hold the value of the stream element for which it is invoked. It will returns 5.0 + n.
        
        The following is an expanded form of the same lambda expression that makes it a little easier to understand:
        
        DoubleFunction<DoubleUnaryOperator> doubleF = (m)->{
            System.out.println("m is "+m);
            return (n)->{
                System.out.println("n is "+n);
                return m+n;
            };
                    };
        
            Here is the output:
            
            m is 5.0
            n is 1.0
            6.0
            n is 2.0
            7.0
            n is 3.0
            8.0

     */
    
    
    public static void main(String...args){
        DoubleStream ds =  DoubleStream.of(1.0, 2.0, 3.0);
        //INSERT CODE HERE
        DoubleFunction<DoubleUnaryOperator> doubleF = m->n->m+n;
        ds.map(doubleF.apply(5.0)).forEach(System.out::println);
       
        
    }
}
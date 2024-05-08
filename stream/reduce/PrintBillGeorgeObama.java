package stream.reduce;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;


public class PrintBillGeorgeObama {
    
    /**
     * What will the following code print when compiled and run?
       A. Hello : BillGeorgeObama
       B. Hello : BillHello : GeorgeHello : Obama
       C.  BillGeorgeObamaHello :
       D.  BillGeorgeObama
       E. It will throw an exception at run time.
       
      -----------------
      This question tests you on Lambda expressions, Functional interfaces, and Stream API.
    
        1. The lambda expression (s1, s2) -> s1.concat(s2); is quite straight forward.
      It implements the functional interface BinaryOperator, which has one abstract method apply(T, T).
      Here, T is typed to String and the method body simply returns the concatenated String.
        
        2. The reduce method of a Stream is mean to reduce a stream into just one value.
        It combines two elements of a stream at a time using a given BinaryOperator,
       and replaces those two elements in the stream with the return value of the apply method of BinaryOperator.
       It keeps on doing this reduction until there is just one value left.
        
        There are three versions of reduce :
        Optional<T>  reduce(BinaryOperator<T> accumulator)
        Performs a reduction on the elements of this stream, using an associative accumulation function,
        and returns an Optional describing the reduced value, if any.
        
        T  reduce(T identity, BinaryOperator<T> accumulator)
        Performs a reduction on the elements of this stream, using the provided identity value and an associative accumulation function,
        and returns the reduced value.
        
        <U> U  reduce(U identity, BiFunction<U,? super T,U> accumulator,
            BinaryOperator<U> combiner)
        Performs a reduction on the elements of this stream, using the provided identity, accumulation and combining functions.
        
        The second version is used in this question.
        This version ensures that there is always a resulting value unlike the first version, which may return an empty Optional.
        We suggest you to go through the API description of these methods.
    
       Correct(A)
     */
    public static void main(String... args){
        BinaryOperator<String> bo = (s1, s2) -> s1.concat(s2);
        List<String> names  = new ArrayList<>();
        names.add("Bill"); names.add("George"); names.add("Obama");
        String finalvalue = names.stream().reduce("Hello : ", bo);
        System.out.println(finalvalue);
    }
}
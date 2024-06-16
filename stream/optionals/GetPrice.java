package stream.optionals;
import java.util.*;

public class GetPrice {
    /**
       Given that a method named Double getPrice(String id) exists and may potentially return null,
       about which of the following options can you be certain that a run time exception will not be thrown?
       
       A.
         Optional<Double> price = Optional.of(getPrice("1111"));
           ---
            Optional.of method throws NullPointerException if you try to create an Optional with a null value.
            If you expect the argument to be null, you should use Optional.ofNullable method, which returns an empty Optional if the argument is null
            
       B. Optional<Double> price = Optional.ofNullable(getPrice("1111"));
          Double x = price.orElse(getPrice("2222"));
       
       C.
           Optional<Double> price = Optional.ofNullable(getPrice("1111"));
            Double y = price.orElseGet(()->getPrice("333"));
            
            ---
            Optional's orElseGet method takes a java.util.function.Supplier function as an argument
            and invokes that function to get a value if the Optional itself is empty.
            Just like the orElse method, this method does not throw any exception even if the Supplier returns null.
            It does, however, throw a NullPointerException if the Optional is empty and the supplier function itself is null.
            
       D.
          Optional<Double> price = Optional.of(getPrice("1111"), 10.0);
            This will not compile because Optional.of takes only one argument.
            
       E.
           Optional<Double> price = Optional.of(getPrice("1111"));
            Double z = price.orElseThrow(()->new RuntimeException("Bad Code"));
            -----
            The orElseThrow method takes a Supplier function that returns an Exception.
            This method is useful when you want to throw a custom exception in case the Optional is empty
            
            ------------
             correct(B, C)
     */
    static Double getPrice(String id){
        return 0.0;
    }
    
    public static void main(String... args){
        Optional<Double> priceResponseB = Optional.ofNullable(getPrice("1111"));
        Double xpriceResponseB = priceResponseB.orElse(getPrice("2222"));
        
        Optional<Double> priceResponseC = Optional.ofNullable(getPrice("1111"));
        Double y = priceResponseC.orElseGet(()->getPrice("333"));
    }
}
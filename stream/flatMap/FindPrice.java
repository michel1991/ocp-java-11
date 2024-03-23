package stream.flatMap;
import java.util.stream.*;
import java.util.*;

/**
 * Given that Book is a valid class with appropriate constructor and getPrice
  and getTitle methods that returns a double and a String respectively, consider the following code:
  What can be inserted in the above code so that it will print 26.0?
  
    A.
        .flatMap(bs)
        and
        .mapToDouble(book.getPrice())

    B.
        .flatMap(bs.stream())
        and
        .mapToDouble(book.getPrice())
        
    C.
        .flatMap(bs->bs.stream())
          and
        .map(book->book.getPrice()).toDouble()
       
   D.
     .flatMap(bs.stream())
         and
    .map(book->book.getPrice()).toDouble()
    
   E.
        .flatMap(bs->bs.stream())
          and
        .mapToDouble(book->book.getPrice())
        
   Correct(E)
   
   The flatMap method expects a Function that will take an element and create a Stream out of it.
   It then joins each of those streams (one stream for each element in the original stream)
   to return a big combined stream of elements. bs->bs.stream() correctly captures such a Function.

    The mapToDouble method expects a ToDoubleFunction object that will take an argument and return a double.
    It then returns a DoubleStream containing double primitives.
    
    DoubleStream has method sum that simply returns the sum of all the elements.
    
    None of the other options will compile.


 */

class Book{
    String title;
    double price;
    
    Book(String title, double price){
        this.title = title;
        this.price = price;
        
    }
    
    public double getPrice(){
        return price;
    }
}
public class FindPrice {
    public static void main(String... argd){
        List<List<Book>> books = Arrays.asList(
                Arrays.asList(
                        new Book("Windmills of the Gods", 7.0),
                        new Book("Tell me your dreams",9.0) ),
                Arrays.asList(
                        new Book("There is a hippy on the highway", 5.0),
                        new Book("Easy come easy go", 5.0)) );

        double d = books.stream()
                     .flatMap(bs->bs.stream())
                     .mapToDouble(book->book.getPrice())
                     .sum();

        //INSERT CODE HERE //1
        //INSERT CODE HERE //2
        //   .sum();
        System.out.println(d);
        
        /*double d = books.stream()
        INSERT CODE HERE //1
        INSERT CODE HERE //2
        .sum();
        System.out.println(d);*/
    }
   
    
}
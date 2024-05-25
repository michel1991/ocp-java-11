package stream.mapping;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

/**
 Given that Book is a valid class with appropriate constructor and getTitle and getPrice methods that return a String and a Double respectively, what can be inserted at //1 and //2 so that it will print the price of all the books having a title that starts with "A"?

    List<Book> books = Arrays.asList(
        new Book("Atlas Shrugged", 10.0),
        new Book("Freedom at Midnight", 5.0),
        new Book("Gone with the wind", 5.0)
    );
    
    Map<String, Double> bookMap = //1 INSERT CODE HERE
    //2 INSERT CODE HERE
    bookMap.forEach(func);
    
    A.
      books.stream().collect(Collectors.toMap((b->b.getTitle()), b->b.getPrice()));
        and
        BiConsumer<String, Double> func = (a, b)->{
                    if(a.startsWith("A")){
                        System.out.println(b);
                    }
                };
         -----------------------------
        1. The first line generates a Map<String, Double> from the List using Stream's collect method.
        The Collectors.toMap method uses two functions to get two values from each element of the stream.
        The value returned by the first function is used as a key and the value returned by the second function
        is used as a value to build the resulting Map.
        
        2. The forEach method of a Map requires a BiConsumer. This function is invoked for each entry,
        that is each key-value pair, in the map. The first argument of this function is the key and the second is the value.
        
    B.
      books.stream().toMap((b->b.getTitle()), b->b.getPrice()));
        and
        BiConsumer<String, Double> func = (a, b)->{
                    if(a.startsWith("A")){
                        System.out.println(b);
                    }
                };
       -------------------------------
        toMap is not a valid method in Stream.
        
    C.
       books.stream().toMap((b->b.getTitle()), b->b.getPrice()));
        and
        BiConsumer<Map.Entry> func = (b)->{
                    if(b.getKey().startsWith("A")){
                        System.out.println(b.getValue());
                    }
                };
       ---------------
        1. toMap is not a valid method in Stream.
        2. BiConsumer requires two generic types and two arguments.
        
    D.
      books.stream().collect(Collectors.toMap((b->b.getTitle()), b->b.getPrice()));
        and
        Consumer<Map.Entry<String, Double>> func = (e)->{
                    if(e.getKey().startsWith("A")){
                        System.out.println(e.getValue());
                    }
            };
           ---------------------
        The implementation of Consumer is technically correct. However, the forEach method requires a BiConsumer.

     Correct(A)
 */

class Book{
    String title;
    double price;
    
    Book(String title, double price){
        this.title = title;
        this.price = price;
        
    }
    
    String getTitle(){
        return title;
    }
    
    double getPrice(){
        return price;
    }
}
public class PrintPriceOfBookHavingTitleThatStartWithA {
    public static void main(String... args){
        List<Book> books = Arrays.asList(
                new Book("Atlas Shrugged", 10.0),
                new Book("Freedom at Midnight", 5.0),
                new Book("Gone with the wind", 5.0)
            );
        Map<String, Double> bookMap = books.stream().collect(Collectors.toMap((b->b.getTitle()), b->b.getPrice())); //1 INSERT CODE HERE
        //2 INSERT CODE HERE
        BiConsumer<String, Double> func = (a, b)->{
            if(a.startsWith("A")){
                System.out.println(b);
            }
        };
        bookMap.forEach(func);
    }
}
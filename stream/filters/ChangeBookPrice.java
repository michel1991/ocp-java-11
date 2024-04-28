package stream.filters;
import java.util.*;
import java.util.stream.*;


class Book{
    private String title;
    private double price;
    
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
    
    void setPrice(double value){
         price = value;
    }
}
public class ChangeBookPrice {
    /**
       Assuming that Book has appropriate constructor and accessor methods, what will the following code print?
       A.
          Freedom at Midnight:5.0
         Gone with the wind:5.0
         Midnight Cowboy:15.0
         
       B.
         Freedom at Midnight:5.0
        Gone with the wind:10.0
        Midnight Cowboy:10.0
        
       C.
          Freedom at Midnight:10.0
        Gone with the wind:5.0
        Midnight Cowboy:15.0
        
       D.
         Freedom at Midnight:10.0

       E. Exception at run time
    
       --------------------
       Correct(C)
       
     This code illustrates how you can go through a list of elements, filter the elements based on a criteria,
     and call methods on each of the elements in the filtered list.
    
    filter method removes all the elements for which the given condition (i.e. b.getTitle().startsWith("F")) returns false from the stream.
    These elements are not removed from the underlying list but only from the stream.
    Therefore, when you create a stream from the list again, it will have all the elements from the list.
    Since the setPrice operation changes the Book object contained in the list, the updated value is shown the second time when you go through the list.   
     */
    public static void main(String... args){
        List<Book> books = Arrays.asList(
            new Book("Freedom at Midnight", 5.0),
            new Book("Gone with the wind", 5.0),
            new Book("Midnight Cowboy", 15.0)
        );
        
        books.stream()
        .filter(b->b.getTitle().startsWith("F"))
        .forEach(b->b.setPrice(10.0));
        books.stream()
        .forEach(b->System.out.println(b.getTitle()+":"+b.getPrice()));
        
    }
}
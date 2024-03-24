package stream.findMethods;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

/***
 * Given:

 creating Book objects using Book(String title, String author) constructor
    var books = List.of(new Book("Where the Crawdads Sing", "Dalia Owens" ),
                                  new Book("The Outsider", "Stephen King"),
            new Book("Elevation", "Stephen King"),
            new Book("Coffin from Hong Kong", "James Hadley Chase") );
    Stream<Book> bkStrm = books.stream();
    
    *INSERT CODE HERE*
    
    Assuming Book class has appropriate constructor and accessor methods,
    which of the following lines of code will get you the first book written by Stephen King from the list of of books?
    
    A.
        Optional<Book> bk = bkStrm.findFirst(b->b.getAuthor().equals("Stephen King"));
        As much sense as it makes, it is not valid because Stream's findFirst() method does not take any parameter.
        It simply returns the first element in the stream. Similarly, the findAny() method does not take any parameter either.
        It returns any element from the stream.
    
        Although, one would expect overloaded findFirst/findAny methods that took a Predicate as a parameter, they are not there in Stream interface.
        
    B. Book bk = bkStrm.findFirst(b->b.getAuthor().equals("Stephen King"));
        
    C. Optional<Book> bk = bkStrm.filter(b->b.getAuthor().equals("Stephen King"))
               .findFirst();
               
    D.
       Book bk = bkStrm.filter(b->b.getAuthor().equals("Stephen King")).findFirst();
    findFirst and findAny methods return an Optional object. If there is no element in the stream, the returned Optional is empty.
    By the way, an empty Optional is tested using Optional's isEmpty() method.
    For example, bk.isEmpty() and not by doing bk.get() == null.
    Calling bk.get() if bk refers to an empty Optional will throw a java.util.NoSuchElementException exception.
    
    E.
       Optional<Book> bk = bkStrm.firstMatch(b->b.getAuthor().equals("Stephen King"));
        There is no such method as firstMatch in Stream
        
    F. Optional<Book> bk = bkStrm.anyMatch(b->b.getAuthor().equals("Stephen King"));
        There is an anyMatch(Predicate ) method in Stream. However, it just returns a boolean and not an object from the stream.
        
    G.
       Optional<Book> bk = bkStrm.filter(b->b.getAuthor().equals("Stephen King")).findAny();
        Although this code is correct, it may not return the first object from the stream.
        It may return any object from the stream.


 */
class Book{
    String author;
    String title;
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    
    public String getAuthor(){
        return author;
    }
}
public class FirstBookStephenKing {
    
    /**
     * 
     */
    public static void main(String... args){
        //creating Book objects using Book(String title, String author) constructor
        var books = List.of(new Book("Where the Crawdads Sing", "Dalia Owens" ),
                            new Book("The Outsider", "Stephen King"),
                            new Book("Elevation", "Stephen King"),
                            new Book("Coffin from Hong Kong", "James Hadley Chase") );
        Stream<Book> bkStrm = books.stream();
        
        Optional<Book> bk = bkStrm.filter(b->b.getAuthor().equals("Stephen King"))
               .findFirst();
    }
}
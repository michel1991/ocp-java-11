package interfaces.sam;
import java.util.*;

/**
 Given:
    public class Book {
        private String title;
        private String genre;
        public Book(String title, String genre){
            this.title = title; this.genre = genre;
        }
        //accessors not shown
    }
    
    and the following code:
    
    List<Book> books = List.of(
            new Book("Gone with the wind", "Fiction"),
            new Book("Bourne Ultimatum", "Thriller"),
            new Book("The Client", "Thriller")
    );
    
    Reader r = b->{
        System.out.println("Reading book "+b.getTitle());  
    };
    books.forEach(x->r.read(x));
    
    What would be a valid definition of Reader for the above code to compile and run without any error or exception?
    
    A.
    
    abstract class Reader{
       abstract void read(Book b);
    }
    
   B.
      abstract class Reader{
            void read(Book b);
        }
         This is invalid code because read method doesn't have a body and is not declared abstract either.
         
   C.
      interface Reader{
            void read(Book b);
            default void unread(Book b){     }
      }
        Since the given code uses lambda expression, Reader must be a functional interface
        (i.e. an interface with exactly one abstract method). The interface can have other default and/or static method.
   D.
      interface Reader{
        default void read(Book b){ }
        void unread(Book b);
    }
       This is a valid functional interface and so the code will work fine.
       However, observe that the lambda expression in the code will capture the unread method
       (not the read method, because read method is not abstract).
       Therefore, r.read() will cause the read method defined in this interface to be invoked instead
        of the code implemented by the lambda expression.
        
   E. interface Reader{
        default void read(Book b){ System.out.println("Default read");};
    }
    This interface code itself is valid but it is not a valid functional interface because it has no abstract method.
    Therefore, the code for lambda expression will not compile.
   

     ---------
       Correct(D, E)
      Java 9 has added List.of/Set.of methods that return an unmodifiable list/set containing an arbitrary number of elements.


 */

interface Reader{
    void read(Book b);
    default void unread(Book b){     }
    
}
public class Book {
    private String title;
    private String genre;
    public Book(String title, String genre){
        this.title = title; this.genre = genre;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getGenre(){
        return genre;
    }
    
    public static void main(String... args){
        List<Book> books = List.of(
                new Book("Gone with the wind", "Fiction"),
                new Book("Bourne Ultimatum", "Thriller"),
                new Book("The Client", "Thriller")
            );
            
            Reader r = b->{
                System.out.println("Reading book "+b.getTitle());  
            };
        books.forEach(x->r.read(x));
    }
}
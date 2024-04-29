package stream.filters.print30DaysWired;
import stream.filters.print30DaysWired.model.*;
import java.util.*;

/**
 A java programer has written the following code:

    public class Book {
    private int id;
    private String title;
    private String genre;
    private String author;
    
        public Book(String title, String genre, String author){
            this.title = title; this.genre = genre; this.author = author;
        }
    
        //accessors for instance fields not shown here
        
        public static class BookFilter {
            public boolean isFiction(Book b){
                return b.getGenre().equals("fiction");
            }
    
        }
    }
    
    He wants to make use of the above code in another class as follows -
    
    List<Book> books = Arrays.asList(new Book("30 Days", "fiction", "K Larsen"),
        new Book("Fast Food Nation", "non-fiction", "Eric Schlosser"),
        new Book("Wired", "fiction", "D Richards"));
            
    books.stream()
    
        .filter(new Book.BookFilter()) //LINE 10
    
        .forEach((Book b) -> System.out.print(b.getTitle()+", "));
    
    What changes mentioned below can he make independent of each other so that the above code will print 30 Days, Wired, ?
    
    A.
        Replace LINE 10 with:
        .filter((Book b)->Book.BookFilter::isFiction(b))
    
   B.
        Replace LINE 10 with:
        .filter((Book b)->new Book.BookFilter(b))
    
   C.
      Make the isFiction method in BookFilter class static and replace LINE 10 with:
    .filter((Book b)->Book.BookFilter.isFiction(b))
    
   D.
     Make the isFiction method in BookFilter class static and replace LINE 10 with:
    .filter(Book.BookFilter::isFiction)
    
    This option illustrates the use of "method references".
    You are, essentially, creating an anonymous Predicate by passing a method reference.
    Internally, a Predicate instance will be created with a test(Book b) method that calls BookFilter's isFiction method.
    
    The method reference (Book.BookFilter::isFiction) is semantically the same as the lambda expression (Book b) -> Book.BookFilter.isFiction(b)
    
    You may also do it without making the method static as follows:
    .filter(new Book.BookFilter()::isFiction)
    
  E. Add implements Predicate<Book> to BookFilter declaration.
    If you declare that BookFilter implements Predicate<Book>, you will need to add
    boolean test(Book b) method to the class as well.
    
   ------------------------------------------------------
   Correct(C, D)
  The filter method of a stream expects a Predicate. So you can either write a class that implements Predicate and pass its instance to filter,
  or use a lambda expression to create a Predicate on the fly.
  Option 3 shows a way to write such a lambda expression. A simpler way to use a lambda expression would be:
    (Book b)->b.getGenre().equals("fiction") In some cases,
    this approach is considered better because the filter condition can be changed without disrupting much code.
    
    
    Yet another way to do it is to make BookFilter class implement Predicate interface:
    
        static class BookFilter implements Predicate<Book>{
            public static boolean isFiction(Book b){
                return b.getGenre().equals("fiction");
            }
            public boolean test(Book b) {
                return isFiction(b);
            //or return b.getGenre().equals("fiction");
            }
        }
    This code reuses the isFiction method. But the test method can be eliminated altogether using a method reference as shown in option 4.
    
    You may check out the basics of method references here: https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html
    
 */
public class Print30DaysWired {
    
    public static void responseeC(List<Book> books){
        books.stream()
                
                    // .filter(new Book.BookFilter()) //LINE 10
                    .filter((Book b)->Book.BookFilter.isFiction(b)) //LINE 10
                
                    .forEach((Book b) -> System.out.print(b.getTitle()+", "));
    }
    
    public static void responseeD(List<Book> books){
        books.stream()
            
            // .filter(new Book.BookFilter()) //LINE 10
            .filter(Book.BookFilter::isFiction) //LINE 10
            
            .forEach((Book b) -> System.out.print(b.getTitle()+", "));
    }
    
    public static void main(String...args){
        List<Book> books = Arrays.asList(new Book("30 Days", "fiction", "K Larsen"),
            new Book("Fast Food Nation", "non-fiction", "Eric Schlosser"),
            new Book("Wired", "fiction", "D Richards"));
        
        // not compile original
        /*books.stream()
            .filter(new Book.BookFilter()) //LINE 10
            .forEach((Book b) -> System.out.print(b.getTitle()+", "));*/
        
        responseeC(books);
        responseeD(books);
    }
}
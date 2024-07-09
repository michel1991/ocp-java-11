package interfaces.function.consumer;
import java.util.function.*;

/**
  Given:
  Assuming that book is a reference to a valid Book object, which of the following code fragments correctly prints the details of the Book?
  
  A. Consumer<Book> c = b->b.getId()+":"+b.getTitle();
    c.accept(book);
    ------
    Remember that Consumer doesn't return anything.
    Therefore, the body of the lambda expression used to capture Consumer must be an expression of type void.
    Here, the type of the expression is String and so it will not compile.
    
   B.
      Consumer<Book> c = b->System.out.println(b.getId()+":"+b.getTitle());
        c.accept(book);
        
   C.
     Consumer<Book> c = b->{ String details = b.getId()+":"+b.getTitle();};
        c.accept(book);
        System.out.println(c);
        ---
        This will compile fine but will not print the details of the book. It will print the details of Consumer.
        Something like: Book$$Lambda$1/1175962212@24d46ca6
        
   D.
     Consumer<Book> c = System.out::println;
        c.accept(book);
        ----
        This will compile fine but will not print the details of the book because
        there is no mention of a toString() method in Book class that would print the details
  
    Correct(B)
 */
public class Book {
    private int id;
    private String title;
   //constructors and accessors not shown
    
    public Book(int id, String title){
        this.id = id;
        this.title = title;
    }
    
    public int getId(){
        return id;
    }
    
    public String getTitle(){
        return title;
    }
    
    public static void main(String... args){
        Consumer<Book> c = b->System.out.println(b.getId()+":"+b.getTitle());
        var book = new Book(1, "hexagonal architecture");
        c.accept(book);
    }
}
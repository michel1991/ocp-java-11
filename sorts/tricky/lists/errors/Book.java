package sorts.tricky.lists.errors;
import java.util.*;
/**
   Given:
    public class Book{
        String isbn;
        String title;
        public Book(String isbn, String title){
            this.isbn = isbn;
            this.title = title;
        }
        public int compareTo(Book b){
            return this.isbn.compareTo(b.isbn);
        }
        //accessors not shown
    }
    
    and the following code snippet:
    
    List<Book> books = getBooksByAuthor("Ludlum");
    Collections.sort(books, (b1, b2)->b1.getTitle().compareTo(b2.getTitle())); //1
    Collections.sort(books); //2
    
    Assuming that getBooksByAuthor is a valid method that returns a List of Books, which of the following statements is/are true?
    
    A. Compilation failure at //1.
        This is a valid usage of a lambda expression to implement a Comparator.
        
    B. Compilation failure at //2.
        For Collections.sort(List ) method to work, the elements of the passed List must implement Comparable interface.
        Here, Book does not implement Comparable and therefore this line will fail to compile.
        It is important to understand that compilation failure occurs because books is declared as List<Book>.
        If it were declared as just List, compilation would succeed and it would fail at run time with a ClassCastException.
        
    C. Exception at run time because of //1.
    D. Exception at run time because of //2.
    E. Elements in books List will be sorted by title and then by isbn.

 */
public class Book{
    String isbn;
    String title;
    public Book(String isbn, String title){
        this.isbn = isbn;
        this.title = title;
    }
    public int compareTo(Book b){
        return this.isbn.compareTo(b.isbn);
    }
    //accessors not shown
    
    String getTitle(){
        return title;
    }
    
    String getIsbn(){
        return isbn;
    }
    
    static List<Book> getBooksByAuthor(String author){
        List<Book> books = new ArrayList<>();
        return books;
    }
    
    public static void main(String...args){
        List<Book> books = getBooksByAuthor("Ludlum");
        Collections.sort(books, (b1, b2)->b1.getTitle().compareTo(b2.getTitle())); //1
        Collections.sort(books); //2
    }
}
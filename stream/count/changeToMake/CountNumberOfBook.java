
package stream.count.changeToMake;
import java.util.*;
import java.util.stream.*;
class Book{
    private String title;
        private String author;
        
        Book(String title, String author){
            this.title = title;
            this.author = author;
        }
        
        String getTitle(){
            return title;
        }
}


public class CountNumberOfBook {
    
    /**
     Given: 
     var books = new ArrayList<Book>(List.of(new Book("The Outsider", "Stephen King"),
        new Book("Becoming", "Michelle Obama" ), new Book("Uri", "India")));
        Stream bkStrm = books.stream(); //1
        int count = bkStrm.peek(x->x.getTitle()).count();//2
        
        Assuming that the Book class has appropriate constructor and method,
        what changes can be made to the above code independent of each other to make it will compile ?
        
        A. Change //1 to
        Stream<Book> bkStrm = books.stream();//1
        This change is good but not enough. The return type of the count() method is long. So, the count variable must also be declared as long.
        
        B.
           Change //2 to :
        long count = bkStrm.peek(x->x.getTitle()).count();
        The declared type of bkStrm is just Stream instead of Stream<Book>,
        the compiler will not allow you to call methods of Book class on its elements without casting the variable x to Book.
        
        C.
          Change //2 to :
        int count = bkStrm.peek(x->((Book)x).getTitle()).count();

         D.
           Change //2 to :
        int count = bkStrm.peek((Book x)->x.getTitle()).count();

         E.
           Change //2 to :
          long count = bkStrm.peek(x->((Book)x).getTitle()).count();
        
         F.
           Change //2 to :
        long count = bkStrm.peek((Book x)->x.getTitle()).count();

       Correct (E)        
        
     */
    public static void main(String... args){
        var books = new ArrayList<Book>(List.of(new Book("The Outsider", "Stephen King"),
        new Book("Becoming", "Michelle Obama" ), new Book("Uri", "India")));
        Stream bkStrm = books.stream(); //1
        //int count = bkStrm.peek(x->x.getTitle()).count();//2
        long count = bkStrm.peek(x->((Book)x).getTitle()).count();
    }
}
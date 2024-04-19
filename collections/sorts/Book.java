package collections.sorts;
import java.util.*;

/**
 Given:
     public class Book {
       private String title;
       private String genre;
       public Book(String title, String genre){
            this.title = title; this.genre = genre;
       }
       //accessors and toString code not shown
    }
    
    and the following code:
    
    var books = new ArrayList<Book>(List.of(
                                           new Book("The Outsider", "fiction"),
                                           new Book("Becoming", "non-fiction"),
                                           new Book("Uri", "non-fiction")));
    
    books.sort(Comparator.comparing(Book::getGenre)
             .thenComparing(Book::getTitle).reversed());
    System.out.println(books);
    
    
    What will be the result?
    
   A. 
    [non-fiction:Uri, non-fiction:Becoming, fiction:The Outsider]
    The thenComparing method adds on a Comparator to the existing Comparator.
    This additional Comparator is used only when two objects are determined to be equal by the first Comparator.
    Thus, in the given question, the books will be first sorted by their genre and title
    (i.e. if the genre of two books is same, then they will be sorted as per their title). This means the list will be ordered as :
    [fiction:The Outsider, non-fiction:Becoming, non-fiction:Uri]
    
    Next, the reversed method generates a Comparator that reverses the order of the Comparator on which it is invoked.
    Thus, whatever is order of the list produced by Book::getGenre).thenComparing(Book::getTitle), that order is reversed.
    Therefore, the final order will be :
    [non-fiction:Uri, non-fiction:Becoming, fiction:The Outsider]
    
   B.  [non-fiction:Becoming, non-fiction:Uri, fiction:The Outsider]
   C.   [fiction:The Outsider, non-fiction:Becoming, non-fiction:Uri]
   D.  [fiction:The Outsider, non-fiction:Uri, non-fiction:Becoming ]
   E.  [non-fiction:Becoming, fiction:The Outsider, non-fiction:Uri]
   F.
      The code will fail to compile.
    There is nothing wrong with the code.
    
    Here, the argument to thenComparing is a method reference to a method that returns a String.
    This obviously does not capture Comparator interface. However, Comparator has three flavors of thenComparing method.
    One of them takes a Function (instead of a Comparator). It is this method that is being used here.
    
    public <U extends Comparable<? super U>> Comparator<T>
        thenComparing(Function<? super T,? extends U> keyExtractor) This method uses the supplied Function
        to get a value from the objects to be compared and then compares that value. The value returned by the function must be Comparable.
    
    
    The third flavor of thenComparing is similar to the second except that the value returned by the function is compared using a given Comparator:
    public <U> Comparator<T> thenComparing(Function<? super T,? extends U> keyExtractor,
         Comparator<? super U> keyComparator) : Returns a lexicographic-order comparator with a function that extracts
         a key to be compared with the given Comparator.
    This is useful when the value returned by the Function does not implement Comparable.
    
    Correct(A)

 */
public class Book {
    private String title;
    private String genre;
    private int age;
    public Book(String title, String genre, int age){
        this.title = title; this.genre = genre;
        this.age = age;
    }
    //accessors and toString code not shown
    public String getTitle(){
        return title;
    }
    
    public String getGenre(){
        return genre;
    }
    
    public int getAge(){
        return age;
    }

    public String toString(){
      var builder =  new StringBuilder("{ title=");
      builder
          .append(title)
          .append(", genre=")
          .append(genre)
          .append(" }")
      ;
      return builder.toString();
    }

    public static void main(String[] args) {
        var books = new ArrayList<Book>(List.of(
                new Book("The Outsider", "fiction", 1),
                new Book("Becoming", "non-fiction", 7),
                new Book("Uri", "non-fiction", 9)));

        books.sort(Comparator.comparing(Book::getGenre)
         .thenComparing(Book::getTitle).reversed());
        System.out.println(books);
        
    }
}

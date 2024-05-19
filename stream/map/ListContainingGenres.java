
package stream.map.errors;
import java.util.*;
import java.util.stream.*;


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
    
    List<Book> books = Arrays.asList(
            new Book("Gone with the wind", "Fiction"),
            new Book("Bourne Ultimatum", "Thriller"),
            new Book("The Client", "Thriller")
    );
    
    List<String> genreList = new ArrayList<>();
    //INSERT CODE HERE
    System.out.println(genreList);
    
    Which of the following options will correctly make genreList refer to a List containing the genres of the books present in books List?
 
  A. books.stream().map(Book::getGenre).forEach(s->genreList.add(s));
  
    1. map(Book::getGenre) will replace each element of the Stream with the value returned by calling getGenre method on that element.
    Thus, the stream will now contain genre values.
    2. The forEach method expects a Consumer instance, which is correctly captured by the lambda expression s->genreList.add(s).
    This expression adds each element to genreList
    
   B.
      genreList = books.stream().map(Book::getGenre).collect(Collectors.toList());
      
        1. map(Book::getGenre) will replace each element of the Stream with the value returned by calling getGenre method on that element.
        Thus, the stream will now contain genre values.
        2. The Collector returned by Collectors.toList() will cause the collect method to return a List of elements in the stream.
        This list is assigned to genreList.
   C.
     books.stream().map(Book::getGenre).collect(Collectors.toList(genreList));
        Collectors.toList doesn't take any argument.

   D. books.stream().map(Book::getGenre).forEach(genreList::add);

   E. books.stream().map(b->b.getGenre()).forEach(genreList::add);
   
   F. books.stream().flatMap(b->b.getGenre()).forEach(g->genreList.add(g));
        flatMap is used when each element of a given stream can itself generate a Stream of objects.
        The purpose of this method is to extract the elements of each of those individual streams and return a stream that contains all those elements

   
   Correct(A, B, D, E)
 */
class Book { // public 
    private String title;
    private String genre;
    public Book(String title, String genre){
        this.title = title; this.genre = genre;
    }

    //accessors not shown
    
    String getTitle(){
        return title;
    }
    
    String getGenre(){
        return genre;
    }
}

public class ListContainingGenres {
    public static void main(String... args){
        List<Book> books = Arrays.asList(
                new Book("Gone with the wind", "Fiction"),
                new Book("Bourne Ultimatum", "Thriller"),
                new Book("The Client", "Thriller")
            );
        
        List<String> genreList = new ArrayList<>();
        //INSERT CODE HERE
        books.stream().map(Book::getGenre).forEach(s->genreList.add(s));
        System.out.println(genreList);
    }
    
    
}
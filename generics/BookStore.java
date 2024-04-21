package generics;
import java.util.*;

/**
 * What changes should be applied to the following class to update it to use generics without changing any functionality?
 * Choose minimal changes that are necessary to take advantage of generics.
 
    A. Replace line //1 with Map<Book, Integer> map = new HashMap<Book, Integer>();
    Note that we could also use a TreeMap here if it were known that class Book implements Comparable.
    
    B. Replace line //2 with map.put(new Book("A111"), 10); //2
    While this is ok, it is not absolutely required because 10 will be autoboxed to an Integer object anyway. Further,
    it is not related to generics.
    
    C. Replace line //3 with: public Integer getNumberOfCopies(Book b) {
    It will change the signature of the method and will break existing code that depends on the fact that this method return an int (instead of Integer).
    
    D. Replace line //4 and //5 with: return map.get(b);
    This will cause a NullPointerException if there is no value for a Book in the map.
    The existing code checks for this condition and returns 0 in such a case.
    
    E. Replace line //4 and //5 with:
    Integer i = map.get(b);
    return i == null? 0:i;
    This change is fine if coupled with option 2 but it is not required.
    
    F. There is no need to change //4 and //5.
    
    Generics allow you to write type safe code by letting you specify what kinds of object you are going to store in a collection.
    Here, by replacing Map with Map<Book, Integer>, we are making sure that only Book-Integer pairs are stored in the map.


 */

class Book{
   String title;
   Book(String title){
      this.title = title;
   }
}
public class BookStore {
    Map map = new HashMap();    //1
    
    public BookStore(){
        map.put(new Book("A111"), new Integer(10)); //2
    }
    
    public int getNumberOfCopies(Book b){ //3
        Integer i = (Integer) map.get(b); //4
        return i == null? 0:i.intValue();  //5
    }
}
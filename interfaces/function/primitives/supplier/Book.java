package interfaces.function.primitives.supllier;
import java.util.function.*;
/**
 * Given :
   public class Book{
    private String title;
    private Double price;
    public Book(String title, Double price){
        this.title = title;
        this.price = price;
    }
    //accessor methods not shown

    What will the following code print when compiled and run?
    
    Book b1 = new Book("Java in 24 hrs", null);
    DoubleSupplier ds1 = b1::getPrice;
    System.out.println(b1.getTitle()+" "+ds1.getAsDouble());
    
    A. Java in 24 hrs null
    B. Java in 24 hrs 0.0
    C. Java in 24 hrs
    D. It will throw a NullPointerException.
    E. It will not compile.
        There is no problem with the code.
        
    ---------------------------------------
     
      java.util.function.DoubleSupplier (and other similar Suppliers such as IntSupplier and LongSupplier)
      is a functional interface with the functional method named getAsDouble.
      The return type of this method is a primitive double (not Double).
      Therefore, if your lambda expression for this function returns a Double,
      it will automatically be converted into a double because of auto-unboxing.
      However, if your expression returns a null, a NullPointerException will be thrown.
      
      correct(D)

 */
public class Book {
    
    private String title;
    private Double price;
    public Book(String title, Double price){
        this.title = title;
        this.price = price;
    }
    //accessor methods not shown
    
    public String getTitle(){
        return title;
    }
    
    public Double getPrice(){
        return price;
    }
    
    public static void main(String... args){
        Book b1 = new Book("Java in 24 hrs", null);
        DoubleSupplier ds1 = b1::getPrice;
        System.out.println(b1.getTitle()+" "+ds1.getAsDouble());
    }
}
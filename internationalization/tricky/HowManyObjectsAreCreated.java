package internationalization.tricky;
import java.time.*;

/**
 Note: java.time API is not mentioned in the exam objectives. However, some candidates have reported getting a similar question
   that requires a little bit of knowledge about the java.time.LocalDate class. The information given in the explanation
   should be sufficient to answer such questions.

    Given the following code:
    
    How many objects are created/instantiated by the given code?
    
   A. 4
   B.  5
   C.  6
   D.  7
   E.  8
   F.  9
   
    1. Classes including LocalDate, LocalTime, LocalDateTime, Period, and Duration from the java.time package are immutable.
  Which means, once you create an object of these classes, that object's properties can't be changed.
    2. These classes don't even have public constructors. Objects of these classes are created using static factory methods
   (such as now and of) and instance methods that create new objects by building upon the current objects (such addDays, minusWeeks and so on).
    
    Based on the above information, you can see that the given code creates 7 LocalDate objects:
    
    LocalDate d1 = LocalDate.now(); // LocalDate object 1
    d1.plusDays(10); // LocalDate object 2, remember object 1 itself remains unchanged
    LocalDate d2 = d1.minusWeeks(1); //LocalDate object 3
    d1 = null; //no object created here
    
    //LocalDate object 4, 5, and 6
    LocalDate d3 = LocalDate.now().plusYears(3).minusMonths(4);
    
    d2.plusWeeks(5); //LocalDate object 7.
    d1 = d2; //no object created here
    
    
    You may want to check out the free video by Dr. Sean Kennedy explaining this question: https://youtu.be/-_ouj8NRWu8  
    Correct(D)
 */
public class HowManyObjectsAreCreated {
    public static void main(String... args){
        LocalDate d1 = LocalDate.now();
        d1.plusDays(10);
        LocalDate d2 = d1.minusWeeks(1);
        d1 = null;
        LocalDate d3 = LocalDate.now().plusYears(3).minusMonths(4);
        d2.plusWeeks(5);
        d1 = d2;
    }
}
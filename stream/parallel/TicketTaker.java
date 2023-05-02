package stream.parallel;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

/**
 * Which statements about the following application are correct? (Choose two.)
    A. The TicketTaker constructor does not compile.
    B. The performJob() method does not compile.
    C. The class compiles.
    D. The first number printed is consistently 100.
    E. The second number printed is consistently 500.
    F. A ConcurrentModificationException is thrown at runtime.
    
    The class compiles and runs without throwing an exception,
    making option C correct and options A, B, and F incorrect.
    The class defines two values that are incremented by multiple threads in parallel.
    The first IntStream statement uses an atomic class to update a variable.
    Since updating an atomic numeric instance is thread-safe by design,
    the first number printed is always 100, making option D correct.
    The second IntStream statement uses an int with the pre-increment operator (++),
    which is not thread-safe.
    It is possible two threads could update and set the same value at the same time,
    a form of race condition, resulting in a value less than 500 and making option E incorrect.
 */
public class TicketTaker {
    long ticketsSold;
    final AtomicInteger ticketsTaken;
    public TicketTaker() {
        ticketsSold = 0;
        ticketsTaken = new AtomicInteger(0);
    }
    public void performJob() {
        IntStream.iterate(1, p -> p+1)
         .parallel()
         .limit(100)
         .forEach(i -> ticketsTaken.getAndIncrement());
        IntStream.iterate(1, q -> q+1)
         .parallel()
         .limit(500)
         .forEach(i -> ++ticketsSold);
        System.out.print(ticketsTaken+" "+ticketsSold);
    }
    public static void main(String[] matinee) {
        new TicketTaker().performJob();
    } }

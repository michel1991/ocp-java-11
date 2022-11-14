package io;
 import java.time.LocalDate;

 /**
 * The program executes normally until line 12, at which point an exception is thrown and caught on line 13.
 * Before line 13 is reached, though, the close() method is executed as soon as the body of the try-with-resource statement is exited.
 * The close() method also throws an exception on line 7, but this exception is suppressed.
 * Returning to line 14, another exception is thrown.
 * This exception would be returned to the called, if not for the exception thrown inside the finally block on line 16.
 * The exception on line 16 replaces the exception on 14 and is thrown to the caller, making option D correct.
  */
 class Farm {
  class Cow implements AutoCloseable {
    protected LocalDate n;
    public Cow(LocalDate n) { this.n = n; }
    public void close() {
          throw new RuntimeException("X");
         }
  }
    public void moo() {
      try (var mooooo = new Cow(LocalDate.now())) {
           throw new RuntimeException("W");
            } catch (Exception e) {
            throw new RuntimeException("Y");
             } finally {
         throw new RuntimeException("Z");
           }
   }
 }

public class AlwaysClosingResourceEventIfException {
     public static void main(String... league) {
         new Farm().moo();
     }
}
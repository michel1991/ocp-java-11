package io;
 import java.time.LocalDate;

 /**
    What is the output of the following program? (Choose all that apply.)
     A. A stack trace with message W
     B. A stack trace with message X
     C. A stack trace with message Y
     D. A stack trace with message Z
     E. The code does not compile.
     F. None of the above

     The program executes normally until line 12, at which point an exception is thrown and caught on line 13.
     Before line 13 is reached, though, the close() method is executed as soon as the body of the try-with-resource statement is exited.
     The close() method also throws an exception on line 7, but this exception is suppressed.
     Returning to line 14, another exception is thrown.
     This exception would be returned to the called, if not for the exception thrown inside the finally block on line 16.
     The exception on line 16 replaces the exception on 14 and is thrown to the caller, making option D correct.
  */
 class Farm { //2
  class Cow implements AutoCloseable { //3
    protected LocalDate n; //4
    public Cow(LocalDate n) { this.n = n; } //5
    public void close() { //6
          throw new RuntimeException("X"); // 7
         } //8
  } //9
    public void moo() { //10
      try (var mooooo = new Cow(LocalDate.now())) { //11
           throw new RuntimeException("W"); //12
            } catch (Exception e) { //13
            throw new RuntimeException("Y"); //14
             } finally { //15
         throw new RuntimeException("Z"); //16
           } //17
   } //18
 }

public class FarmAlwaysClosingResourceEventIfException {
     public static void main(String... league) { //19
         new Farm().moo();//20
     } //21
} //21
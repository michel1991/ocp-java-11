package io;
import java.io.*;

//---------------------- QUESTION/Response (1) -------------------------------------------------------------------

/**
* Question: Which of the following exceptions do not need to be handled or declared in the method in which they are thrown? (Choose all that apply.)
* An exception that does not need to be handled or declared is an unchecked exception.
* An unchecked exception inherits RuntimeException or Error. The entire hierarchy counts, so options A, B, and E are all correct.
*  Even if you don’t know what OutOfMemoryError is, the fact that it ends with an Error is a strong indication that it is an unchecked exception.
 */
class Robot extends NullPointerException {}
class Rosey extends OutOfMemoryError {}
class Six extends Prime {}
class Johnny extends NotSerializableException {}
class Wally extends IllegalArgumentException {}
class Prime extends IOException {}

//---------------------- QUESTION -------------------------------------------------------------------

//---------------------- QUESTION/Response (2) -------------------------------------------------------------------
/**
  *  Question: Which of the following exceptions need to be handled or declared in the method in which they are thrown? (Choose all that apply.)
  *
  *  Checked exceptions include any class that inherits Exception, but not RuntimeException, while unchecked exceptions include any class that inherits RuntimeException or (less commonly) Error.
  *  Both ParseException and SQLException extend Exception, while FileNotFoundException extends IOException, which in turn extends Exception.
 */

//---------------------- QUESTION/Response (2) -------------------------------------------------------------------

public class ListExceptions {
  public static void main(String... args){
      System.out.println("hold exception");
  }
}
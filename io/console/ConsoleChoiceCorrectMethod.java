package io.console;
import java.io.*;

public class ConsoleChoiceCorrectMethod {
    /**
    * Which values when inserted into the blank independently would allow the code to compile? (Choose all that apply.)
    *   A. reader().print
        B. reader().println
        C. format
        D. writer().print
        E. writer().println
        F. None of the above

    Console includes a format() method that takes a String along
    with a list of arguments and writes it directly to the output stream, making option C correct.
    Options A and B are incorrect, as reader() returns a Reader, which does not define any print methods.
    Options D and E would be correct if the line was just a String.
    Since neither of those methods take additional arguments, they are incorrect.

     */
   void choiceCorrectMethod(){
       Console console = System.console();
       String color = console.readLine("Favorite color? ");
       console.format("Your favorite color is %s", color); // ____________
   }

    public static void main(String... args){
        
    }
}
package workingWithDatesAndTimes;
import java.time.*;
import java.time.format.*;

class AddingCustomTextValues{
  static void basicExample(){
    var dt = LocalDateTime.of(2020, Month.OCTOBER, 20, 6, 15, 30);
    var f1 = DateTimeFormatter.ofPattern("MMMM dd, yyyy ");
     var f2 = DateTimeFormatter.ofPattern(" hh:mm");
    System.out.println(dt.format(f1) + "at" + dt.format(f2) );
  
  }


 static void usingPairOfSingleQuoteToEscapeText(){
    var dt = LocalDateTime.of(2020, Month.OCTOBER, 20, 6, 15, 30);
    var f1 = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm ");
    System.out.println(dt.format(f1));

  }

  static void doubleQuoteExample(){
    var dt = LocalDateTime.of(2020, Month.OCTOBER, 20, 6, 15, 30);
    var g1 = DateTimeFormatter.ofPattern("MMMM dd', party''s at' hh:mm");
    System.out.println(dt.format(g1));

    var g2 = DateTimeFormatter.ofPattern("'System format, hh:mm: 'hh:mm");
    System.out.println(dt.format(g2));

    var g3 = DateTimeFormatter.ofPattern("'NEW!' yyyy', yaay!'");
    System.out.println(dt.format(g3));
   }

  public static void main(String[] args){
    basicExample();
    System.out.println();

    System.out.println("Escape the text by surrounding it with a pair of single quote, below");
    usingPairOfSingleQuoteToEscapeText();

    System.out.println();
    System.out.println("More Escape the text by surrounding it with a pair of single quote, below");
    doubleQuoteExample();
  }

}

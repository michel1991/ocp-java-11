package workingWithDatesAndTimes;
import java.time.*;
import java.time.format.*;

class ErrorWithoutEscapingTextValueWithSingleQuote {
  public static void main(String[] args){
     DateTimeFormatter.ofPattern("Time is: hh:mm:"); 
  }
}

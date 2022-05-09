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

  public static void main(String[] args){
    basicExample();
  }

}

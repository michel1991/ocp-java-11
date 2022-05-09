package workingWithDatesAndTimes;
import java.time.*;
import java.time.format.*;

class SelectingAFormat{
  static void basicExample(){
    var dt = LocalDateTime.of(2020, Month.OCTOBER, 20, 6, 15, 30);
    var formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
    System.out.println(dt.format(formatter));
    System.out.println(formatter.format(dt));
  }

  public static void main(String[] args){
    basicExample();
  }

}

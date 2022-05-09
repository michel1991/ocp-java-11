package workingWithDatesAndTimes;
import java.time.*;

class BasicCreation{

  static void createWithOf(){
     LocalDate date1 = LocalDate.of(2020, Month.OCTOBER, 20);
     LocalDate date2 =  LocalDate.of(2020, 10, 20);
    System.out.println(date1);
     System.out.println(date2);
   }

  public static void main(String[] args){
    System.out.println(LocalDate.now());
   System.out.println(LocalTime.now());
   System.out.println(LocalDateTime.now());
   System.out.println(ZonedDateTime.now());
   System.out.println();
   System.out.println("Creation using of method below");
   createWithOf();
  }

}

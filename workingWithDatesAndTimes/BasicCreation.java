package workingWithDatesAndTimes;
import java.time.*;

class BasicCreation{

  static void createWithOf(){
     LocalDate date1 = LocalDate.of(2020, Month.OCTOBER, 20);
     LocalDate date2 =  LocalDate.of(2020, 10, 20);
    System.out.println(date1);
     System.out.println(date2);
   }


  static void createTimeWithOf(){
     LocalTime time1 = LocalTime.of(6, 15);
     LocalTime time2 =  LocalTime.of(6, 15, 30); // + seconds
     LocalTime time3 =  LocalTime.of(6, 15, 30, 200); // + seconds + nanoseconds
     System.out.println(time1);
     System.out.println(time2);
     System.out.println(time3);
   }

  static void combinaisonDateAndTimeToCreateLocalDateTime(){
      var dt1 = LocalDateTime.of(2020, Month.OCTOBER, 20, 6, 15, 30);
      LocalDate date = LocalDate.of(2020, Month.OCTOBER, 20);
      LocalTime time = LocalTime.of(6, 15);
      var dt2 = LocalDateTime.of(date, time);
      System.out.println(dt1);
      System.out.println(dt2); 
   }

  public static void main(String[] args){
    System.out.println(LocalDate.now());
   System.out.println(LocalTime.now());
   System.out.println(LocalDateTime.now());
   System.out.println(ZonedDateTime.now());
   System.out.println();

   System.out.println("LocalDate: Creation Date using of method below");
   createWithOf();
   System.out.println();
  
   System.out.println("LocalTime: Creation Time using of method below");
   createTimeWithOf();
   System.out.println();

   System.out.println("LocalDateTime:  Creation LocalDateTime using date and time below");
   combinaisonDateAndTimeToCreateLocalDateTime();
   System.out.println();
  }

}

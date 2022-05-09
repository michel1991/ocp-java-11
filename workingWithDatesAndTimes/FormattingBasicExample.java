package workingWithDatesAndTimes;
import java.time.*;
import java.time.format.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

class FormattingBasicExample{
  static void basicExample(){
     LocalDate date = LocalDate.of(2020, Month.OCTOBER, 20);
     LocalTime time = LocalTime.of(11, 12, 34);
     LocalDateTime dt = LocalDateTime.of(date, time);

     System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
     System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
     System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
  }

  static void formatingUsingCustomFormat(){
      LocalDate date = LocalDate.of(2020, Month.OCTOBER, 20);
     LocalTime time = LocalTime.of(11, 12, 34);
     LocalDateTime dt = LocalDateTime.of(date, time);
     var f = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm");
     System.out.println(dt.format(f));
   }

 static void formatWithSimpleDateFormat(){
     DateFormat s = new SimpleDateFormat("MMMM dd, yyyy 'at' hh:mm");
     Date dt = new Date();
     System.out.println(s.format(dt)); 
 }

   public static void main(String[] args){
      System.out.println("Format using using predefined formats below "); 
      basicExample();
      System.out.println();
      System.out.println("Custom format MMMM dd, yyyy 'at' hh:mm below ");
      formatingUsingCustomFormat();
      System.out.println();

       System.out.println("Custom format MMMM dd, yyyy 'at' hh:mm with java.util.Date and SimplateDateFormat old version below ");
      formatWithSimpleDateFormat();
   }
}

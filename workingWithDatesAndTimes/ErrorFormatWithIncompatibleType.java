package workingWithDatesAndTimes;
import java.time.*;
import java.time.format.*;

public class ErrorFormatWithIncompatibleType {
    public static void main(String[] args){
        LocalDate date = LocalDate.of(2020, Month.OCTOBER, 20);
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }
}
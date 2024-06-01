package internationalization.dateTimeFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.text.*;

public class PrintInFrenchFormat {
    
    /**
       Consider the following code.

        LocalDate d = LocalDate.now();
        Locale loc = new Locale("fr", "FR");
        // 1 insert code here.
        
        What should be inserted at //1 above so that it will print the date in French format?
        
        A.
           DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MMM yyyy", loc);
            System.out.println(df.format(d));
            
        B.
           DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MMM yyyy");
            System.out.println(df.format(d, loc));
            
        C.
            DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MMM yyyy");
            df.setLocale(loc);
            System.out.println(df.format(d));
            ----
                    There is no setLocale method in DateTimeFormatter. Locale must be passed while creating the formatter.
        D.
            d.setLocale(loc);
                DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MMM yyyy");
                System.out.println(df.format(d));
     */
    public static void main(String... args){
        LocalDate d = LocalDate.now();
        Locale loc = new Locale("fr", "FR");
        // 1 insert code here.
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MMM yyyy", loc);
        System.out.println(df.format(d));
        
       
    }
}
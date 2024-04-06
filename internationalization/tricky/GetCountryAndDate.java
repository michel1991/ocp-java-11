package internationalization.tricky;
import java.time.*;
import java.util.*;
import java.text.*;

public class GetCountryAndDate {
    /**
       Assume that dt refers to a valid java.util.Date object and that df is a reference variable of class DateFormat.
        Which of the following code fragments will print the country and the date in the correct local format?
        A. 
            Locale l = Locale.getDefault();
            DateFormat df = DateFormat.getDateInstance(l);
            System.out.println(l.getCountry()+" "+ df.format(dt));
            getDateInstance(Locale); is wrong. There is not such method in DateFormat.
            
        B.
           Locale l = Locale.getDefault();
            DateFormat df = DateFormat.getDateInstance();
            System.out.println(l.getCountry()+" "+ df.format(dt, l));
            df.format(Date, Locale) is wrong. There is no such method in DateFormat.
            
       C.
           Locale l = Locale.getDefault();
            DateFormat df = DateFormat.getDateInstance();
            System.out.println(l.getCountry()+" "+ df.format(dt));
            
       D.
           Locale l = new Locale();
            DateFormat df = DateFormat.getDateInstance();
            System.out.println(l.getCountry()+" "+ df.format(dt));
            new Locale(); is wrong. There is no such constructor in Locale.
            
          Correct(C)


     */
    public static void main(String... args){
        Locale l = Locale.getDefault();
        DateFormat df = DateFormat.getDateInstance();
        System.out.println(l.getCountry()+" "+ df.format(df)); // replace dt by df
        
    }
}
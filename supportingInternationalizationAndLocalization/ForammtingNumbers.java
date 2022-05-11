package supportingInternationalizationAndLocalization;
import java.text.*;
import java.util.*;

class ForammtingNumbers{
  
   static void formattingAverageMonthlyNumberOfVisitors(){
    int attendeesPerYear = 3_200_000;
    int attendeesPerMonth = attendeesPerYear /12;

     var us = NumberFormat.getInstance(Locale.US);
     System.out.println("US: " + us.format(attendeesPerMonth) );
    
     var gr = NumberFormat.getInstance(Locale.GERMANY);
     System.out.println( "GERMANY: " + gr.format(attendeesPerMonth));   

     var ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
     System.out.println( "GERMANY: " + ca.format(attendeesPerMonth));
  }

  public static void main(String[] args){
     System.out.println("Average monthly number of visitors  in different locale ");
     formattingAverageMonthlyNumberOfVisitors();
     System.out.println();


   }

}

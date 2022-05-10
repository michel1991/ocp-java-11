package supportingInternationalizationAndLocalization;
import java.util.Locale;

class PickingALocale{
  static void currentLocal(){
     Locale locale = Locale.getDefault();
    System.out.println(locale);
  }

  static void germanLanguage(){
      System.out.println(Locale.GERMAN); // de
       System.out.println(Locale.GERMANY); // de_DE
   }

 public static void main(String[] args){
     System.out.println("Current locale");
     currentLocal();
     System.out.println();
     System.out.println("German locale");
     germanLanguage();
  }
}

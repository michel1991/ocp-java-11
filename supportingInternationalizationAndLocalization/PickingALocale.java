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


    static void createWithConstructor(){
      System.out.println("French language (fr) only : " +  new Locale("fr")); 
       System.out.println(new Locale( "language and code country Hindi(hi) In India(IN): " + "hi", "IN")); 
   }

 public static void main(String[] args){
     System.out.println("Current locale Below");
     currentLocal();
     System.out.println();
     System.out.println("German locale Below");
     germanLanguage();
     System.out.println();
     System.out.println("create locale with constructor Below ");
     createWithConstructor();
  }
}

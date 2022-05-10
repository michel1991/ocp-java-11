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

   static void createWithBuilderPattern(){
       Locale l1 = new  Locale.Builder()
                              .setLanguage("en")
                              .setRegion("US")
                              .build()
      ;

       Locale l2 = new  Locale.Builder()
                              .setRegion("US")
                              .setLanguage("en")
                              .build() 
      ;

     System.out.println(l1);
     System.out.println(l2);
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
     System.out.println();
    System.out.println("create locale with builder design pattern ");
    createWithBuilderPattern();
  }
}

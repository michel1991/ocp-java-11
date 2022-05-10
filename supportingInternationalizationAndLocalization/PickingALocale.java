package supportingInternationalizationAndLocalization;
import java.util.Locale;

class PickingALocale{
  static void currentLocal(){
     Locale locale = Locale.getDefault();
    System.out.println(locale);
  }

 public static void main(String[] args){
     currentLocal();
  }
}

package supportingInternationalizationAndLocalization;
import java.text.*;

class WritingACustomNumberFormatter{
 static void basicExample(){
    double d = 1234567.467;
    NumberFormat f1 = new DecimalFormat("###,###,###.0");
    System.out.println(f1.format(d));

    NumberFormat f2 = new DecimalFormat("000,000,000.00000");
    System.out.println(f2.format(d)); //

    NumberFormat f3 = new DecimalFormat("$#, ###, ###.##");
    System.out.println(f3.format(d));
  }

  public static void main(String[] args){
    System.out.println("Basic example ");
   basicExample();
  }

}

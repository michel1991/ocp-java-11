package internationalization;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Locale.Category;

/**
* The Locale.Builder class requires that the build() method be called to actually create the Locale object.
* For this reason, the two Locale.setDefault() statements do not compile because the input is not a Locale, making option E the correct answer.
* If the proper build() calls were added, then the code would compile and print the value for Germany, 2,40 €.
*  As in the exam, though, you did not have to know the format of currency values in a particular locale to answer the question.
* Note that the default locale category is ignored since an explicit currency locale is selected.
 */
 class Wallet {
    private double money;
    // Assume getters/setters/constructors provided
    Wallet(double money){
      this.money = money;
    }

    public double getMoney(){
        return money;
    }

    public double setMoney(double money){
         this.money = money;
    }

    private String openWallet() {
        Locale.setDefault(Category.DISPLAY,
                          new Locale.Builder().setRegion("us"));
        Locale.setDefault(Category.FORMAT,
                          new Locale.Builder().setLanguage("en"));
        return NumberFormat.getCurrencyInstance(Locale.GERMANY)
        .format(money);
    }

    public void printBalance() {
        System.out.println(openWallet());
    }

}


public class ErrorUsingLocalWithoutBuilder {
     public static void main(String... unused) {
         new Wallet(2.4).printBalance();
     }
}
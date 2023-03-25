package advancedDesign;

/**
  Given the following class, which of the following lines of code can independently
  replace INSERT CODE HERE to make the code compile? (Choose all that apply.)

    A. int Amount = 0b11;
    B. int amount = 9L;
    C. int amount = 0xE;
    D. int amount = 1_2.0;
    E. double amount = 1_0_.0;
    F. int amount = 0b101;
    G. double amount = 9_2.1_2;
    H. double amount = 1_2_.0_0;

  First off, 0b is the prefix for a binary value, and 0x is the prefix for a hexadecimal value.
  These values can be assigned to many primitive types,
  including int and double, making options C and F correct.
  Option A is incorrect because naming the variable
  Amount will cause the System.out.print(amount) call on the next line to not compile.
  Option B is incorrect because 9L is a long value.
  If the type was changed to long amount = 9L, then it would compile.
  Option D is incorrect because 1_2.0 is a double value.
  If the type was changed to double amount = 1_2.0, then it would compile.
  Options E and H are incorrect because the underscore (_)
  appears next to the decimal point (.), which is not allowed.
  Finally, option G correct and the underscore and assignment usage is valid.

 */
class Price {
    public void admission() {
        //INSERT CODE HERE
        int amount = 0xE;
    System.out.print(amount);
    } }

public class PriceVariableInManyFormat {
    public static void main(String... args){
        new Price().admission();
    }
}
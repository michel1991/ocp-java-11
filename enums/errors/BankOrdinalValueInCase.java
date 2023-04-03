package enums.errors;

/**
 * What is the output of the following application?
    A. -1
    B. 0
    C. 1
    D. The Provider class does not compile.
    E. The Bank class does not compile.
    F. None of the above.
    
    The type of the variable in the switch statement is the enum Currency,
    but the case statements use int values.
    While the enum class hierarchy does support an ordinal() method,
    which returns an int value, the enum values
    cannot be compared directly with int values.
    For this reason, the Bank class does not compile, making option E the correct answer.

 */
enum Currency {
    DOLLAR, YEN, EURO
}
abstract class Provider {
    protected Currency c = Currency.EURO;
}
 class Bank extends Provider {
    protected Currency c = Currency.DOLLAR;
    public static void main(String[] pennies) {
        int value = 0;
        switch(new Bank().c) {
            case 0:
                value--; break;
                case 1:
                    value++; break;
        }
        System.out.print(value);
    }
}

public class BankOrdinalValueInCase {
  
}
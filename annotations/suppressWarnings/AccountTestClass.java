package annotations.suppressWarnings;
import java.lang.annotation.*;
import java.util.*;

/**
 Identify correct statements about the following code:

    class Account {
        int id;
        double balance;
        @Deprecated
        public Account(){
        };
        public Account(int id){       this.id = id;    };   
        public void transact(double amount){ balance = balance+amount; }
    }
    
    class NewAccount extends Account{
        public NewAccount(){ }
    }
    public class TestClass {
        public static void main(String[] args) {
            Account c = new NewAccount();
        }
    }
 
  A. It will produce a deprecation warning upon compilation.
    The no-args constructor of NewAccount invokes the no-args constructor of Account.
    However, since the no-args constructor of Account is deprecated, the compiler will generate a warning.
    
    B. It will compile without a warning but the no-args constructor of Account class should have
 a JavaDoc comment reflecting why this constructor is deprecated and what to use instead.
 The warning will be there as explained in the previous option. The rest of the statement is correct though.
 The reason for deprecation and the alternative should be documented.
 
    C. The warning can be eliminated using @SuppressWarnings("deprecation") on the main method.
    Account's no-args constructor is deprecated, NewAccount's constructor is not.
    So, main doesn't really use any deprecated method/constructor, NewAccount's no-args constructor does (due to an implicit call to super()).
    Therefore, @SuppressWarnings("deprecation") should be applied to NewAccount's constructor if you want to get rid of the warning.
   
    D. There will be no warning and the code is fine as it is.
    
    Correct(A)

 */
class Account {
    int id;
    double balance;
    @Deprecated
    public Account(){
    };
    public Account(int id){       this.id = id;    };   
    public void transact(double amount){ balance = balance+amount; }
}

class NewAccount extends Account{
    public NewAccount(){ }
}

public class AccountTestClass {
    public static void main(String[] args) {
        Account c = new NewAccount();
    }
}
package exceptions.handled;

/**
  Given
  
  What can be inserted in the above code at //1 and //2 so that it will print "Not Implemented" when run?
   A. 
   WithdrawalException
    Exception
    
   B. 
    WithdrawalException
    RuntimeException
    
    C. 
    Exception
    RuntimeException
    
    D.
    RuntimeException
    Exception
    
    -----------------------------------------------------------------------------------------------------
    1. The withdraw() method does not have a throws clause.
    That means only unchecked exceptions can come out of this method.
    Therefore, LowBalanceException must either be an unchecked exception or it must extend WithdrawalException
    (so that it will be caught by the catch(WithdrawalException ) block).

    2. Form the perspective of Account's withdraw() method, it is ok if
    LowBalanceException extends WithdrawalException and WithdrawalException extends Exception.
    However, if it will cause a compilation failure at line catch(WithdrawalException e){
    of the main method because the compiler will notice that the code in the try block never throws WithdrawalException
    and the catch block is unreachable.
    
    3. Thus, the only possible option is option 2.
    
    Correct(B)
 */
class LowBalanceException extends WithdrawalException{ //1 ______
    public LowBalanceException(String msg){ super(msg);    }
}

class WithdrawalException extends RuntimeException{ //2 ______
    public WithdrawalException(String msg){ super(msg);    }
}
class Account{
    double balance;
    public void withdraw(double amount) {
        try{
            throw new LowBalanceException("Not Implemented");
        }catch(WithdrawalException e){
            throw new RuntimeException(e.getMessage());
        }
    }
    public static void main(String[] args) {
        try{
            Account a = new Account();
            a.withdraw(100.0);
        }catch(WithdrawalException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

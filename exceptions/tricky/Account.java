package exceptions.tricky;

/**
  Consider the following code:
   What can be inserted at //1 and //2 so that the above code will prints Not Implemented?.
   
     A. Exception
        Exception
        
    B. Exception
        LowBalanceException
       
    C. WithdrawalException
      Exception
    
    D. Exception
      RuntimeException
   
    1. The withdraw method declares that it throws WithdrawalException.
This means that the only exceptions that can come out of this method are WithdrawalExceptions
(which means WithdrawalException or its subclasses) or RuntimeExceptions.

    2. The try block in withdraw method throws a RuntimeException.
It will be caught by the catch(Exception ) block because RuntimeException is-a Exception.
The code in the catch block throws a LowBalanceException, which is not caught.
Thus, it will be thrown out of this method, which means LowBalanceException must either be a RuntimeException or be a WithdrawalException
(i.e. must extend WithdrawalException) to satisfy the throws clause of the withdraw method.
    
    3. The main() method does not have a throws clause but the call to withdraw() is enclosed within a try block with catch(Exception ).
Thus, WithdrawalException can extend either Exception or RuntimeException
Correct(C)
 */
class LowBalanceException extends WithdrawalException {   //1 _______
    public LowBalanceException(String msg){ super(msg);    }
}

class WithdrawalException extends Exception {   //2 _______
    public WithdrawalException(String msg){ super(msg);    }
}
class Account{
    double balance;
    public void withdraw(double amount) throws WithdrawalException{
        try{
            throw new RuntimeException("Not Implemented");
        }catch(Exception e){
            throw new LowBalanceException(e.getMessage());
        }
    }
    public static void main(String[] args) {
        try{
            Account a = new Account();
            a.withdraw(100.0);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
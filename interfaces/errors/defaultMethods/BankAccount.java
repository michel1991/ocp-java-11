package interfaces.errors.defaultMethods;
/**
 * Which statements about the following code contained in BankAccount.java are correct?
    A. It will print 0000 when run.
    B. It will compile if class BankAccount provides an implementation for getId method.
    ------
    Since interface PremiumAccount redeclares getId method as abstract, the BankAccount class must either provide
    an implementation for this method or be marked as abstract.
    In this case, making the class abstract will not help because of the statement - Account acct = new BankAccount();
    
   C. It will not compile unless interface PremiumAccount is marked abstract.
    Interfaces are always abstract. You can but you don't have to mark them abstract.
    Methods of an interface that are not marked default, static, or private, are also always abstract.
    You don't have to mark them as abstract.
    
   D.
      It will compile if getId method in PremiumAccount is replaced with:
    public String getId(){ super.getId(); }
    -------
    1. You cannot provide a method body in an interface method unless you mark it as default (or static).
    2. You cannot use super keyword in an interface's method to invoke a method defined in its super interface.
    
   E.
      It will compile if getId method in PremiumAccount is replaced with:
        public default String getId(){ super.getId(); }
        
        ------
        super.methodName is a valid way to invoke a super class's method from anywhere within a subclass's method. But it works only for classes. To invoke an interface's default method, you need to use the name of that interface as well. Like this: Account.super.getId();

        A class (or an interface) can invoke a default method of an interface that is explicitly mentioned in the class's implements clause (or the interface's extends clause) by using the same syntax i.e. <InterfaceName>.super.<methodName>.
        
        However, this technique cannot be used to invoke a default method provided by an interface that is not directly implemented (or extended) by the caller.
        Here is an example:
        
        interface A {
           default void hello() {
           }
        }
        
        interface B extends A {
           default void hello() {
               super.hello();    //This is NOT valid.
               A.super.hello();    //This is valid.
           }
        }
        
        public class TestClass implements B {
           public void hello() {
              super.hello();//This is NOT valid.
              A.super.hello(); //This is NOT valid,  
        //because TestClass does not implement A directly.
              B.super.hello(); //This is valid.
           }
        }
  
    F.
       It will compile if getId method in PremiumAccount is replaced with:
        public default String getId(){ super(); }
        --------
        super(); is used to invoke the super class's constructor.
        So, if present, it can only be the first statement of a constructor. Calling super(); does not invoke the super class's method.

 */
interface Account{
    public default String getId(){
       return "0000";
    }
  }
  
  interface PremiumAccount extends Account{
    public String getId();
  }
  
  public class BankAccount implements PremiumAccount{
    public static void main(String[] args) {
        Account acct = new BankAccount();
        System.out.println(acct.getId());
    }
  
  }
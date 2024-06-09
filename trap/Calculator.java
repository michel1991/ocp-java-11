package trap;

/**
  What will the following code print when compiled and run?
  
    A. It will not compile.
         It will compile without any issue.
         
    B. It will not print anything and will throw NullPointerException
    C. It will print calculating and then throw NullPointerException.
        ---
            After printing, when it tries to call calculate() on x, it will throw NullPointerException because x is null.
            
    D. It will print calculating and will throw NoSuchMethodError
    E. It will print calculating and will throw MethodNotImplementedException
    
    ---------
      correct(C)

 */
abstract class Calculator{
    abstract void calculate();
    public static void main(String[] args){
        System.out.println("calculating");
        Calculator x = null;
        x.calculate();
    }
}
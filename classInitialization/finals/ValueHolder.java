package classInitialization.finals;
/**
   Given:

      public class ValueHolder{
        final int value;
    
        *INSERT CODE HERE*
    
    }
    Which of the following options can be inserted in the above code independent of each other?
    
    A. 
        public  ValueHolder() { value = 10; }
        public  void ValueHolder(int x) { value = x; }
          -----------------
             Observe the return type on the second line.
             It is not a valid constructor but it is a valid method.
             You cannot assign a value to a final instance variable in a method.
             
    B.
       public int ValueHolder(String s) { value = Integer.parseInt(s); }
       ------------------------------
        This is actually a valid method (instead of a constructor because of the return type)
        but you cannot assign a value to a final member of the class in a method.
        
        Further, the compiler will provide a default constructor for this class but the default constructor will not initialize
        the final variable value, which will also cause a compilation failure.
        
    C.
        public ValueHolder(){ this("10"); }
        public ValueHolder(String x) { value = Integer.parseInt(x, 2); }
        ---------------------------
        parseInt(String valie , int radix) is a valid method in Integer class.
        It parses the string argument as a signed integer in the radix specified by the second argument.
        The characters in the string must all be digits of the specified radix.
        
        Since NumberFormatException is an unchecked exception, there is no need for a throws clause in the second constructor.
        
        For example:
        parseInt("10", 2) returns 2
        parseInt("-FF", 16) returns -255
        parseInt("12", 2) throws a NumberFormatException
        //because 2 is not a valid digit for numbers in base 2.
        Note: You may see question on the real exam that requires knowledge of this method.
       
    D. public ValueHolder(int x) { value = x; }

   --------------------------------------------------
   A final instance field of a class must be initialized during the initialization of an instance.
   This means that either it must be initialized in an instance initializer (because an instance initializer is executed before each constructor)
   or it must be initialized in every constructor.
   Correct(C, D)
      
    
 */
public class ValueHolder {
    final int value;

    //*INSERT CODE HERE*
    
    public ValueHolder(){ this("10"); }
    public ValueHolder(String x) { value = Integer.parseInt(x, 2); }
}
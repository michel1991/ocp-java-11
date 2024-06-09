package interfaces.defaultMethods;
/**
 Given:

    interface Account{
        public default String getId(){
            return "0000";
        }
    }
    
    interface PremiumAccount extends Account{
        //INSERT CODE HERE
    }
    
    Which of the following options can be inserted in PremiumAccount independent of each other?
    
    A.
          static String getId(){
          return "1111";
        }
         ----
         Trying to override a static method with a non-static method (and vice-versa)
         in a class will result in a compilation error. Even in case of interfaces, a subinterface
         cannot override a default method with a static method.

            You can, however, have a default method in a subinterface with the same signature
            as a static method of its super interface because a static method of an interface can only be called using that interface's name.
            Example:
            interface I{
                public default void invalid(){ }
                public static void valid(){ } //Can be called only using I.valid();
            }
            interface I2 extends I{
                public static void invalid(){ } //WILL NOT COMPILE
                public default void valid(){ } //this is ok.
            }
    B.
      String getId();
       ------
        An interface can redeclare a default method and also make it abstract.
        
    C.
        default String getId(){
           return "1111";
        }
        -----
        An interface can redeclare a default method and provide a different implementation.

    D. abstract static String getName();
            1. static methods can never be abstract (neither in an interface nor in a class).
            2. An interface can have a static method but the method must have a body.
            
    E. static String getName();
       -------
        An interface can have a static method but the method must have a body.

    F. default String getName();
        A default method must have a body.

    
    Correct(B, C)
 */
interface Account{
    public default String getId(){
        return "0000";
    }
}
    
interface PremiumAccount extends Account{
    //INSERT CODE HERE
}
package interfaces.tricky.redeclare;

/**
 * Given:
 Which of the following options can be inserted in Encyclopedia independent of each other?
   A. static String getId(){
         return "AIN8888";
      }
    You cannot override a non-static method with a static method and vice versa. (A default method is a non-static method.)
    You can, however, redeclare a static method of a super interface as a default method in the sub interface.
    For example:
    class Base{
        static void m(){ }
        void n(){ }
        static void x(){ }
        void y(){ }
    }
    class Sub extends Base{
        void m(){ } //WILL NOT COMPILE
        static void n(){ } //WILL NOT COMPILE
        static void x(){ } //VALID, x() of base is hidden
        void y(){ } //VALID, y() of base is overridden
    }
    
   B. String getId();
      An interface can redeclare a default method and also make it abstract.
        Note that if a class then implements the subinterface, it will not inherit the default method from the super interface
        (because it has been redeclared as abstract by the subinterface).
        
   C. default String getId(){
        return "AIN8888";
      };
      An interface can redeclare a default method and provide a different implementation.
      
   D. abstract static String getName();
    1. static methods can never be abstract (neither in an interface nor in a class).
    2. An interface can have a static method but the method must have a body.
    
   E. static String getAuthor();
        An interface can have a static method but the method must have a body.
        
   F. default String getAuthor();
        A default method must have a body.
        
   G. private String getId(){
            return "ISBN123456";
        }

   Although an interface can have private methods, you still cannot override a public method with a private method.
   Here, getId is public in Book and so, it cannot be overridden by a private method in Encyclopedia.
  
   Correct(B, C)

 */
interface Book{
    public default String getId(){
        return "ISBN123456";
    }
}


public interface Encyclopedia extends Book {
    //INSERT CODE HERE
    default String getId(){
        return "AIN8888";
    };
    
}
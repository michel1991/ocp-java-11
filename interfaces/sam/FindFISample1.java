
/**
   Which of the following is/are a valid functional interface(s)?
   A.
       @FunctionalInterface
        public interface FI{
            int m1();
            boolean equals(Object o);
        }
        
   B.
      @FunctionalInterface
        public interface FI{
            String toString = "VALUE";
            int m1();
            String m2(String s);
        }
        It has two abstract methods and so it is not a valid functional interface
        
    C.
       public interface FI{
        int m1();
        String toString();
      }
      
     D.
        @FunctionalInterface
        public interface FI{
            int m1();
            default int m2(){ return 10; }
            String toString();
        }
        
      E.
         @FunctionalInterface
        public interface FI{
            String toString = "VALUE";
            boolean equals(Object o);
        }
        
        Object class's methods i.e. equals and toString do not count towards the number of abstract methods.
        Therefore, this interface has no abstract method and is not a valid functional interface.
        
        A functional interface may have any number of fields.
        
      F.
         @FunctionalInterface
        public interface FI{
            String toString();
        }
        Object class's methods i.e. equals and toString do not count towards the number of abstract methods.
        Therefore, this interface has no abstract method and is not a valid functional interface.
        
       ---------------------------------------------------------------------------------------------
       
          A functional interface must have exactly one abstract method.
          Remember that methods of the java.lang.Object class do not count towards the number of abstract methods of an interface.
          So, for example, the following is still a valid functional interface even though it has three abstract method declarations:
    
        @FunctionalInterface
        public interface FI{
            int m1(); //valid abstract method
            boolean equals(Object o); //valid declaration
        //but it does not count towards the number of abstract methods
        
            String toString(); //valid declaration
        //but it does not count towards the number of abstract methods
        }
        
        
        It is not necessary to apply the @FunctionalInterface annotation
        to a functional interface but it is recommended to do so because doing so enables IDEs and compilers
        to generate error message if the interface does not satisfy the requirements of functional interface.
        Correect(A, C, D)
        
    
 */
    @FunctionalInterface
    interface FIResponseA{ // public original 
        int m1();
        boolean equals(Object o);
    }

      interface FIResponseC{ // public original
        int m1();
        String toString();
    }


  interface FIResponseD{ // public original
    int m1();
    default int m2(){ return 10; }
    String toString();
    }

public class FindFISample1 {
    
}
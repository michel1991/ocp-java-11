package interfaces.manySpecialMethods;

/**
 Which of the following sets of interface definitions are valid?
  A.
    interface Measurement{
        public int getLength(){
            return 0;
        }
    }
    interface Size extends Measurement{
        public int getLength();
    }
    ------
    If a method in an interface has a body, the method must be marked as default.
    Here, getLength in Measurement is missing the default keyword.
    It is ok for a subinterface to redeclare an inherited default method as abstract. Therefore, Size is fine.
    
  B.
  
    interface Measurement{
        public default int getLength(){
            return 0;
        }
        public static int getBreadth(){ return 0; }
    }
    
    interface Size extends Measurement{
        public static final int UNIT = 100;
        public static int getLength(){ return 10;}
    }
    ------------
    getLength method in Size is invalid because a default method cannot be overridden by a static method.
    You can, however, redeclare a static method of a super interface as a default method in the sub interface.

  C.
          interface Measurement{
            public int getLength();
            public static int getBreadth(){ return 0; }
            private void helper(){ }
        }
            interface Size extends Measurement{
            private void helper(){ }
            }
        Since Java 9, an interface is allowed to have private
        (but not protected) static as well as instance methods. Remember that private methods are not inherited.
        Private fields are still not allowed in an interface. Fields of an interface are still always implicitly public, static, and final.
        
  D.
    interface Measurement{
       public default final int getUnit(){ return 100; }
         private void helper(){ }
    }
    
    interface Size extends Measurement{
        public int getLength();
    }
        interface methods can never be declared final.
  E.
     interface Measurement{
            public int getLength();
            public static int getBreadth(){ return 0; }
            private void helper(){ }
        }
        interface Size extends Measurement{
             private final int STEP = 10;
        }
        Private or protected fields are still not allowed in an interface.
        Fields of an interface are still always implicitly public, static, and final.

     Correct (C)
  
 */
interface Measurement{
    public int getLength();
    public static int getBreadth(){ return 0; }
    private void helper(){ }
}
interface Size extends Measurement{
    private void helper(){ }
}
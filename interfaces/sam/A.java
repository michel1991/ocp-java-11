package interfaces.sam;
/**
 Which of the following interface definitions can use Lambda expressions?
   A.
     interface A{
        }
   B.
      interface A{
        default void m(){};
      }
      
   C.
      interface A{
            void m(){};
        }
      This is an invalid interface definition. m() must either be declared as default or must not have a body
      
   D.
      interface A{
        default void m1(){};
        void m2();
    }
    Observe that method m2() is implicitly abstract. (Any method of an interface that is not static or default is implicitly abstract.
    You may apply the abstract keyword explicitly but it would be redundant and is not recommended by convention.)
    
   E.
      interface A{
        void m1();
        void m2();
    }
    
    ----------------------------------------------------------------------------------------
    Correct(D)
   To take advantage of lambda expressions, an interface must be a "functional" interface,
   which basically means that the interface must have exactly one abstract method.
   A lambda expression essentially provides the implementation for that abstract method.

    It does not matter whether the abstract method is declared in this interface or a super interface.
    There is no constraint on the parameter types or on the return type.
    The interface may have other default or static methods as well but those are not relevant.
    All that is required is that it must have exactly one abstract method
 */

interface A{
    default void m1(){};
    void m2();
}
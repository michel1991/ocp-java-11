
package interfaces.manySpecialMethods;
/**
 Which of the following are valid declarations independent of each other inside the following interface?
 
  A. public int FOO;
    All fields of an interface are always final and static,
    even if you don't specify the static or final keywords. However, they cannot be left uninitialized.
    They must be given a value explicitly.

   B.
      public void bar();
      
   C.
          private static void mbaz(){
      }
       -----
        Java 9 onwards, an interface is allowed to have private methods  (but not protected).
        Fields are always static and public.
        
   D.
     private int BOO = 10;
      ----
        Only methods of an interface can be private. private/protected fields are not allowed
        
   E.
       public default void base(){
        };

   F. Override
    public void bar();
      ------------------
        The @Override annotation is used to convey the information that this method overrides
        an inherited method with the same signature. Applying this annotation prevents hard to trace
        logical errors caused due to spelling mistakes in the method name. It also makes the code easier to understand.
        
        However, here, the bar() method does not override any method and therefore, compiler will generate an error.
        
      ------------------------
        Correct(B, C, E)
       
        

   
      

 */
public interface FooI {
    public void bar();
    
    private static void mbaz(){
    }
    
    public default void base(){
    };

}
package classInitialization.finals;

/**
   Which of the following statements can be inserted at // 1 to make the code compile without errors?
 

    public class InitTest{
        static int si = 10;
        int  i;
        final boolean bool;
        // 1
    }
    
    A. instance { bool = true; }
    ---------
        you cannot put the word instance here. It is not a keyword.
        
    B.
       InitTest() { si += 10; }
       -------------------
            It is a valid constructor but does not initialize bool,
            which is a final variable and must be initialized either in an instance block or in a constructor
            
    C.
       { si = 5; i = bool ? 1000 : 2000;}
       ----------
        bool is not initialized. Therefore, it cannot be used !
        
    D.
      {  i = 1000; }
       ---------
        bool remains uninitialized.

    E.
      { bool = (si > 5); i = 1000; }

  -------------------------------------------------------------------------------------------------------
   A final variable must be initialized when an instance is constructed, or else the code will not compile.
   This can be done either in an instance initializer or in EVERY constructor.
    The keyword static is used to signify that a block is static initializer.
    If nothing is there before starting curly brace then it is an instance initializer.
   Correct(E)

 */
public class InitTest {
    static int si = 10;
    int  i;
    final boolean bool;
    // 1
    { bool = (si > 5); i = 1000; }

}
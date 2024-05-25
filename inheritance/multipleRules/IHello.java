package inheritance.multipleRules;
/**
 Given:

    interface IHello
    {
        public int hello(int x, int y);
        public long hello(long x, long y);
    }
    
    Which of the following options are valid definitions in a different file assuming that the above definition is already available?
    
    A.
       interface IHello2 extends IHello{
          private static void print(){ };
        }
    
      ---------------------------------------------------------------------------------------------------------
      Since Java 9, an interface is allowed to have private (but not protected) static as well as instance methods.
      Fields of an interface are still always implicitly public, static, and final.
      
    B. interface iHello2 implements IHello{ }
        An interface cannot "implement" anything.
       
    C.
       abstract class Hello implements IHello{}
            Since the class is defined abstract, it is ok if it does not implement any method.
           
    D.
      abstract class Hello implements IHello{
      public short hello(short a, short b){ return 0; } }
      
      ---------------------------------------------------------------------------------------------------------------------
        This is valid because the method hello() defined in Hello class is totally different from the hello() method in the interface.
        Since the class is abstract, there is no problem
       
    E.
      abstract class Hello implements IHello{
       public short hello(int a, int b){ return 0; } }
       
       ------------------------------------------------------------------------------------------------------
       This is invalid because the method name hello and its arguments match the method name and arguments
       in the interface but the return type does not match. This causes the compiler to throw an error message:

        Hello.java:1: hello(int,int) in Hello cannot implement hello(int,int) in IHello;
        attempting to use incompatible return type
        found   : short
        required: int
     
    ------------------------------------------------------------------------------------------------------------
    The concept here is that the presence of ambiguous methods does not create a problem.
    A problem occurs when method is calling in an ambiguous way such that the compiler is not able to determine which method to call.
     Correct(A, C, D)
    
 */

interface IHello
{
    public int hello(int x, int y);
    public long hello(long x, long y);
}

interface IHello2 extends IHello{
    private static void print(){ };
}

 abstract class Hello implements IHello{}

abstract class HelloResponseD implements IHello{
    public short hello(short a, short b){ return 0; } }
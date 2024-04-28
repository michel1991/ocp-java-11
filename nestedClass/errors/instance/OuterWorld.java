package nestedClass.errors.instance;

/**
 * Consider the following code:
   A. Compilation error at //1
   B. Compilation error at //2
   
   C. Compilation error at //3
   Even though reason is a private member of InnerPeace, InnerPeace itself is a member of OuterWorld and so OuterWorld can access 'reason'. You can also have a method defined inside OuterWorld and call it from outside OuterWorld:
    class OuterWorld
    {
        public InnerPeace i = new InnerPeace();
        private class InnerPeace
        {  
        private String reason = "none";
        }
        void m(){
            System.out.println(i.reason);
        }
        
    }
    
    This shows that an object of class OuterWorld can access the reason variable of InnerPeace even though it is private.
    
    D. code at //2 can be compiled if InnerPeace definition changed to:
    private static class InnerPeace ...
    
    E. code at //2 can be compiled if InnerPeace definition is moved to a separate InnerPeace.java file without impacting other parts of the code.
    If you move InnerPeace outside OuterWorld, InnerPeace's reason field will not be accessible from inside OuterWorld.
   
   The wordings of this question are difficult to understand. However, expect similar questions on the exam.
   The question is essentially asking where all is the 'reason' field accessible. Obviously, it is accessible within InnerPeace class.
   But it is also accessible in OuterWorld as shown in option 2.
   
   Correct(B, D)
 */
class OuterWorld
{
    public InnerPeace i = new InnerPeace("none"); //1
    class InnerPeace
    {  
        private String reason = "none";
        InnerPeace(String reason){ this.reason = reason; }
    }
    public static void main(String[] args){
        var ip = new InnerPeace("yoga"); //2
        var out = new OuterWorld();
        System.out.println(out.i.reason); //3
    }
}

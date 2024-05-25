
/**
 Consider:

    public class Outer
    {
        int i = 10;
        class Inner
        {
            public void methodA()
            {
                //line 1.
            }
        }
    }
    
    A. System.out.println(this.i);
        This will not compile because there is no 'i' in 'this'. There is an 'i' in Outer.this.
        
    B. System.out.println(i);
        As there is no conflict, the compiler figures out that 'i' is actually Outer.this.i.
        
    C. System.out.println(Outer.this.i);
    D. 'i' cannot be accessed inside the inner class method.
    E. The code cannot be compiled.
    
   ---------------------------
    Correct(B, C)


 */

class Outer // public
        {
            int i = 10;
            class Inner
            {
                public void methodA()
                {
                    //line 1.
                    System.out.println(i);
                }
            }
}
    
public class OuterInnerI {
    
}
package scope.tricky;

/**
   What will be the output when the following class is compiled and run?
   
    A. It will not compile because line //1 cannot be parsed correctly.
    
    B. It will not compile because x is used before initialization.
        It is not.
        
    C. It will not compile because there is an ambiguous reference to x.
        There is no conflict for resolution of x. The local 'x' simply shadows the member variable 'x'.
        
    D. It will print 12.
    E.  It will print 3 .
    
    -------------------
    Here, the local x shadows the static x. Therefore, when you try to access x, the local x is used.

    x is first initialized by x = 3, then the value of this expression (i.e. x = 3), which is 3, is multiplied by 4 and is again assigned to x.
    So, it prints 12.
    
    Note: If the statement at line // 1 were simply:
    int x  =  x* 4;  // compilation failure
    or
    int x  = x;  // compilation failure
    
    They would not compile because in these cases, the value of local x is being accessed before it has been initialized.
    
    Note that var x  = ( x=3 ) * 4; would be invalid because you cannot use var for declaring a self referencing variable (even though x is local).
    
    Correct(D)

 */
public class ScopeTest {
    static int x = 5;
    public static void main(String[] args){
       int x  = ( x=3 ) * 4;  // 1
       System.out.println(x);
    }
}
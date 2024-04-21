package operations.loops.tricky;
public class SameResultINT1AndINT2 {
    /**
       Consider the following code snippet:
    
        for(var i=INT1; i<INT2; i++){
            System.out.println(i);
        }
    
        INT1 and INT2 can be any two integers.
        
        Which of the following will produce the same result?
        
        A. for(int i=INT1; i<INT2; System.out.println(++i));
            Prints: 2 and 3
            
        B. for(int i=INT1; i++<INT2; System.out.println(i));
            Prints: 2 and 3
            
        C. int i=INT1; while(i++<INT2) { System.out.println(i); }
            Prints: 2 and 3
            
        D. int i=INT1; do { System.out.println(i); }while(i++<INT2);
             Prints: 1 2 and 3
            
        E. one of these.
        
        Correct(E)
        
     */
    
    static void printlnOriginal(int valueINT1, int valueINT2){
        System.out.println("Benging Original");
        int INT1 = valueINT1, INT2=valueINT2;
        for(var i=INT1; i<INT2; i++){
            System.out.println(i);
        }
        System.out.println("End Original");
        System.out.println();
    }
    
    public static void main(String... args){
        int INT1 = 1, INT2=3;
        printlnOriginal(INT1, INT2);
        
        for(int i=INT1; i<INT2; System.out.println(++i));
    }
}
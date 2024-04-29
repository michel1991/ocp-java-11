package arrays.declaration.findBad;

public class IllegalTestTwo {
    /**
     * Which of these array declarations and initializations are NOT legal?
       A.
           int[ ] i[ ] = { { 1, 2 }, { 1 }, { }, { 1, 2, 3 } } ;
        
       B. int i[ ] = new int[2] {1, 2} ;
        If you give the elements explicitly you can't give the size. So it should be just int[] { 1, 2 } or just { 1, 2 }
        
       C.
          int i[ ][ ] = new int[ ][ ] { {1, 2, 3}, {4, 5, 6} } ;
        
       D.
          int i[ ][ ] = { { 1, 2 }, new int[ 2 ] } ;
        
        E.
            int i[4] = { 1, 2, 3, 4 } ;
            You cannot specify the size on left hand side .

       F.
          var i = new int[ ][ ] { {1, 2, 3}, {4, 5, 6} } ;
        
        
        If you explicitly specify the members then you can't give the size. So option 2 is wrong.
        The size of the array is never given during the declaration of an array reference. So option 5 is wrong.
        The size of an array is always associated with the array instance, not the array reference.
        
        Correct(B, E)
     */
    
    static void correctResponseA(){
        int[ ] i[ ] = { { 1, 2 }, { 1 }, { }, { 1, 2, 3 } } ;
    }
    
    static void correctResponseC(){
        int i[ ][ ] = new int[ ][ ] { {1, 2, 3}, {4, 5, 6} } ;
        
    }
    
    static void responseD(){
        int i[ ][ ] = { { 1, 2 }, new int[ 2 ] } ;                     
    }
    
    static void responseF(){
        var i = new int[ ][ ] { {1, 2, 3}, {4, 5, 6} } ;
    }
    
    public static void main(String[] args) {
        correctResponseA();
        correctResponseC();
        responseD();
        responseF();
        
    }
}
package operations.loops.fors;
/**
   What can you do to make the following code compile?

    public class TestClass {
        public static void main(String[] args) {
            int[] values = { 10, 20, 30 };
            for( put code here  ){
            }
        }
    }
    
    A. int k : values
    B. int k in values
    C. var k; k<0; k++
        k must be initialized first. So it should be: var k=0; k<0; k++
    D. ;;
        It will cause an infinite loop, but it is valid.
    E. ; k<values.length;k++
        k needs to be declared first.
        
    Correct(A, D)

 */
class TestClass {
        public static void main(String[] args) {
            int[] values = { 10, 20, 30 };
            for( int k : values
     ){
        }
    }
}
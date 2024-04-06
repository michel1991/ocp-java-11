package exceptions.catchException;

/**
 * What will the following class print ?
    A. 99 , 11
    B. 1 , 11
    C. 1 and an unknown value.
    D. 99 and an unknown value.
    E. It will throw an exception at Run time.
    
    If evaluation of a dimension expression completes abruptly, no part of any dimension expression to its right will appear to have been evaluated.
    Thus, while evaluating a[val()][i=1]++,  val() throws an exception and i=1 will not be executed.
    Therefore, i remains 99 and a[1][1] will print 11.
    Correct(A)

 */
class Test{
    public static void main(String[] args){
        int[][] a = { { 00, 01 }, { 10, 11 } };
        int i = 99;
        try {
            a[val()][i = 1]++;
        } catch (Exception e) {
            System.out.println( i+", "+a[1][1]);
        }
    }
    static int val() throws Exception {  
        throw new Exception("unimplemented");  
    }
}

public class Print9911 {
    public static void main(String[] args){
        Test.main(args);
    }
}
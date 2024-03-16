package arrays.tricky;
/**
 * What is the result of compiling and running the following program?
    A. Bill Steve Larry null
    B. Bill Steve Larry class java.lang.NullPointerException
    C. class java.lang.Exception Bill Steve Larry
    D. Bill Steve Larry class java.lang.Exception
    F. null Bill Steve Larr
    
    Correct(F)
    Array indexing starts with 0. The first element therefore is at dataArr[0], which is not set in this code.
    It is initialized by default to null. Hence, the code prints null Bill Steve Larry.
 */
public class Learner {
    public static void main(String[] args) {
        var dataArr = new String[4];
        dataArr[1] = "Bill";
        dataArr[2] = "Steve";
        dataArr[3] = "Larry";
        try{
            for(String data : dataArr){
                System.out.print(data+" ");
            }
        }catch(Exception e){
            System.out.println(e.getClass());
        }
    }
}
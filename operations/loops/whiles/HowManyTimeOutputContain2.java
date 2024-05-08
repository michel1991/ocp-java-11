package operations.loops.whiles;

/**
 * Consider the following code:
   A.  0
   B.  1
   C.  2
   D.  3
   E.  4
   F. It will fail to compile.

   How many times will the output contain 2?
   
   -------------------
   The while loop runs three times for each element in the dataList. So it will print 2 three times. Here is the complete output:
    x, 0
    x, 1
    x, 2
    y, 0
    y, 1
    y, 2
    z, 0
    z, 1
    z, 2
    
    Correct(D)
 */
public class HowManyTimeOutputContain2 {
    public static void main(String... args){
        String[] dataList = {"x", "y", "z"};
                for (var dataElement : dataList) {
                    int innerCounter = 0;
                    while (innerCounter < dataList.length) {
                        System.out.println(dataElement + ", " + innerCounter);
                        innerCounter++;
                    }
        
                }
    }
}
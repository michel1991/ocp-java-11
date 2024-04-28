package operations.unreachableCode;

/**
 * What will the following code print when compiled and run?
   A.  It will not compile.
    Observe that the line  if (value > 4) { and the rest of the code in the for loop will not execute in any case.
    It is therefore unreachable code and the compiler will complain about it.
    
   B. It will throw an exception at run time.
   C. 5
   D. 6
   E. 7
   F. 8
   Correct(A)

 */
class TestClass{ // public 
public static void main(String[] args){
    int[] arr = { 1, 2, 3, 4, 5, 6 };
    int counter = 0;
    for (var value : arr) {
        if (counter >= 5) {
            break;    
        } else {
        continue;    
        }
        if (value > 4) {
        arr[counter] = value + 1;    
        }    
        counter++;
    }
    System.out.println(arr[counter]);
}

}

public class NotCompileTestClassAtValue {
    public static void main(String[] args){
        TestClass.main(args);
    }
}
package wrapper;
/**
 * What will the following code print when run?
   A.  5 and 20
   B. 6 and 515
   C. 6 and 20
   D. 6 and 615
   E. It will not compile.

 1. Wrapper objects are always immutable. Therefore, when dataWrapper is passed into wiggler() method,
   it is never changed even when x++; is executed. However, x, which was pointing to the same object as dataWrapper,
   is assigned a new Integer object (different from dataWrapper) containing 6.

 2. If both the operands of the + operator are numeric, it adds the two operands.
   Here, the two operands are Integer 5 and Integer 15, so it unboxes them, adds them, and prints 20.
   Correct(C)
 */
public class Wiggler {
    public static Integer wiggler(Integer x){
        Integer y = x + 10;
        x++;
        System.out.println(x);
        return y;
    }

    public static void main(String[] args){
        Integer dataWrapper = new Integer(5);
        Integer value = wiggler(dataWrapper);
        System.out.println(dataWrapper+value);
    }
}
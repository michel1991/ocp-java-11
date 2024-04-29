package wrapper.errors;
/**
  What will the following code snippet print?
   A. 11
   B.  12
   C. It will not compile.
   D. It will throw an exception at runtime.
   
   ----------------------
  Compiler will complain that the method intValue() is not available in Object. This is because the .
  operator has more precedence than the cast operator. So you have to write it like this:
    int k = ((Integer) t).intValue()/9;
   Now, since both the operands of / are ints, it is an integer division.
   This means the resulting value is truncated (and not rounded). Therefore, the above statement will print 11 and not 12.

 */
public class PrintValueOfVariableK {
    public static void main(String... args){
        Object t = new Integer(107);
            int k = (Integer) t.intValue()/9;
            System.out.println(k);
    }
}
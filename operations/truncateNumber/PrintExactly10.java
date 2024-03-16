package operations.truncateNumber;
public class PrintExactly10 {
    /**
     * Which of the following code snippets will print exactly 10?
       A. 1
       B. 2
          Since one of the operands (9.9) is a double, it wil perform a real division and will print 10.1010101010101
       C.  3
         Since one of the operands (10.0) is a double, it will perform a real division and will print 10.0
       D.  4
       E. 5
       
       Correct (A, D, E)
       
       1. int k = ((Integer) t).intValue()/10;
       Since both the operands of / are ints, it is a integer division.
       This means the resulting value is truncated (and not rounded).
       Therefore, the above statement will print 10 and not 11.
        5. 3 + 100/10*2-13 will be parsed as: 3 + (100/10)*2-13.
       This is because the precedence of / and * is same (and is higher than + and -) and since the expression
       is evaluated from left to right, the operands are grouped on first come first served basis.
      [This is not the right terminology but you will be able to answer the questions if you remember this rule.]

     */
    public static void main(String... args){
        Object t = new Integer(106); // 1
        int k = ((Integer) t).intValue()/10;
        System.out.println(k);

        System.out.println(100/9.9); //  2. 

        System.out.println(100/10.0); //   3. 

        System.out.println(100/10); //  4. 

        System.out.println(3 + 100/10*2-13); //   5.
    }
}
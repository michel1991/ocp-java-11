package charSequence.errors;
public class NotReverseMethodInString {
    /**
     * What is the output of the following?
        A. 12
        B. 123
        C. 321
        D. The code does not compile.

        Trick question. There is no reverse method on the String class.
        There is one on the StringBuilder class.
        Therefore, the code does not compile, and option D is correct.

     */
   static void reverse(){
       var b = "12"; //  12:
       b += "3"; //  13:
       b.reverse(); //  14:
       System.out.println(b.toString()); // 15:
   }
}
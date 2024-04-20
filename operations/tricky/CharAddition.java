package operations.tricky;
public class CharAddition {
    /**
      Given:
      What is the output?
      
       A. Compilation error at //1
       B.  Compilation error at //2
       C.  Compilation error at //3
       D.  Compilation error at //4
       E.  ab
       F.  195
       
       Correct(F)
    
       char is an integral data type and so, you can pretty much treat it like an int but with a shorter range. The int value of character a is 97.
       Therefore, (char)a1+(char)b1 performs a simple addition and produces an int 195 (97+98).
    
        It does not produce ab because the + operator performs a string operation only when one or both its operands is/are strings.
        Otherwise, it performs mathematical addition.
     */
    public static void main(String... args){
        char a = 'a', b = 98; //1
            int a1 = a; //2
            int b1 = (int) b; //3
            System.out.println((char)a1+(char)b1); //4
    }
}
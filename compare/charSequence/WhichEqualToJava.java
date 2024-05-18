package compare.charSequence;

/**
 * Which of the following expressions will evaluate to true if preceded by the following code?

    String a = "java";
        char[] b = { 'j', 'a', 'v', 'a' };
        String c = new String(b);
        String d = a;
      
     A. (a == d)
     B. (b == d)
         b and d can not even be compared because they are of different types.
     C. (a == "java")
     D. a.equals(c)
     Note that a == c will be false because doing 'new' creates an entirely new object. 
 */
public class WhichEqualToJava {
    public static void main(String... args){
        String a = "java";
        char[] b = { 'j', 'a', 'v', 'a' };
        String c = new String(b);
        String d = a;
    }
}
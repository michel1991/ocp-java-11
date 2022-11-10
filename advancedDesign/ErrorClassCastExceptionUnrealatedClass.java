
package advancedDesign;
public class ErrorClassCastExceptionUnrealatedClass {
    /**
    * Line 5 tries to cast an Integer to a String. Since String does not extend Integer, this is not allowed, and a ClassCastException is thrown,
    * making option C correct. If line 5 were removed, then the code would instead produce a NullPointerException on line 7.
    * Since the program stops after line 5, though, line 7 is never reached.
     */
    public static void main(String... args){
        Object obj = Integer.valueOf(3);
         String str = (String) obj;
        obj = null;
        System.out.println(obj.equals(null));
    }
}
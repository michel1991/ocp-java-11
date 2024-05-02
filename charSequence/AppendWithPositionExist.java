package charSequence;

/**
 *  Which of these are valid expressions to create a string of value "hello world" ?
    A. " hello world".trim()
    trim() removes starting and ending spaces.
    
    B. ("hello" + new String("world"))
    It will create helloworld. No space between hello and world.
    
    C. "hello".concat(" world")
    D. new StringBuilder("world").insert(0, "hello ").toString();
    
    E. new StringBuilder("world").append(0, "hello ").toString();
        1. append adds the argument to the end.
        2. It doesn't take an int as its first argument.
       
   F.  new StringBuilder("world").append("hello ", 0 , 6).toString();
     There is an append method that takes two ints as shown here but the int parameters are to determine
     the portion of the String that is to be appended to the target.
     That portion will still be appended to the end of the target.
    
   G. new StringBuilder("world").add(0, "hello ").toString();
    There is no add method in StringBuilder.
    
 */
public class AppendWithPositionExist {
    static void responseA(){
        System.out.println( " hello world".trim());
    }
    static void responseC(){
                System.out.println( "hello".concat(" world"));
    }
    static void responseD(){
        System.out.println( new StringBuilder("world").insert(0, "hello ").toString());
     } 
     public static void main(String...args){
        responseA();
        responseC();
        responseD();
     }
}
package interfaces.function.function;
import java.util.function.*;
public class StringBuilderReplace {
    /**
      Given:
        StringBuilder sb = new StringBuilder("abcdef");
        //INSERT CODE HERE
        for(int i = 0, k = sb.length(); i<k; i++){
            sb.replace(i, i+1, f.apply(sb.charAt(i)));
        }
        System.out.println(sb);
        
        Which of the following statements can be inserted in the above code?
        
        A. Function f = i->i+1;
            There are two problems with this option:
            1. Since f is declared as untyped Function, the type of the input will be Object and the type of output will also be Object.
            However, the + operator cannot operate on Object + int. At least one of the operands of the + operator has to be a String.
            So, this statement will not compile.
            2. StringBuilder's replace method expects a String in the third argument. Therefore, a Function that returns Object cannot be used here.
         
       B.
         Function<String> f = i->""+(i+1);
            Function requires type specification for two things - the type for the input argument and the type of the return value.
            Thus, this statement will not compile
            
       C.
          Function f = i->((Character)i).charValue()+1;
            This statement is valid in itself but it will not enable the given code to compile because of its return type as explained in option 1.

       D. Function<Character> f = i->i+1;

       E. Function<Character, String> f = i->""+Character.valueOf((char)(i+1));

       F.  Function<String, Character> f = i->new String(i.toString());
            This is almost correct except for the order of the type parameters of Function.
            The input is Character and the output is String, so f should be defined as Function<Character, String>

         Correct(E)
     */
    public static void main(String... args){
        StringBuilder sb = new StringBuilder("abcdef");
        //INSERT CODE HERE
        Function<Character, String> f = i->""+Character.valueOf((char)(i+1));
        for(int i = 0, k = sb.length(); i<k; i++){
            sb.replace(i, i+1, f.apply(sb.charAt(i)));
        }
        System.out.println(sb);
    }
}
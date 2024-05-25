package stream.map.errors;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

/**
 Given:

    List<String> strList = Arrays.asList("a", "aa", "aaa");
    Function<String, Integer> f = x->x.length();
    Consumer<Integer> c = x->System.out.print("Len:"+x+" ");
    strList.stream().map(f).forEach(c);
    
    What will it print when compiled and run?
    A. A compilation error will occur.
        There is no problem with the code.
        
    B. Len:a Len:aa Len:aaa
    
    C. Len:1 Len:2 Len:3  
        The function f accepts a String and returns its length. The call to map(f),
        uses this function to replace each element of the stream with an Integer.
        The call to forEach(c) uses function c to print each element.
        
    D. It will compile and run fine but will not print anything.
    
    Correct(C)

 */
public class PrintLen {

    public static void main(String... args){
        List<String> strList = Arrays.asList("a", "aa", "aaa");
        Function<String, Integer> f = x->x.length();
        Consumer<Integer> c = x->System.out.print("Len:"+x+" ");
        strList.stream().map(f).forEach(c);
    }
}
package collections.lists.loops;
import java.util.*;

public class Values {
    /**
     Given the following code that appears inside a method:

           var values = new ArrayList<String>();
           //INSERT CODE HERE
        
        What can be inserted at the given location without causing any compilation error?
        
        A.
            values.forEach(var k->System.out.print(k.length()));
             ----
            The lambda expresion is syntactically incorrect. If you want to specify the type of the lambda variables, then you have to put the variable list within parenthesis, like this:
            values.forEach((var k)->System.out.print(k.length()));
            values.forEach( (var k)->System.out.print(k.length()));

        B. values.forEach( (var k)->System.out.print(k.length()));

        C. values.forEach( k -> System.out.print(k.length()));

        D. var k = values.get(0);
            values.add(k);
            
            ----
            values.get(0) will cause an java.lang.IndexOutOfBoundsException to be thrown at run time because
            values points to an empty ArrayList. It won't cause a compilation error though.
            
        E. for(var value : values){    }
        
        F. values.add(1);
            The type of values is ArrayList<String>. You cannot add an Integer to a list of Strings.

       
        Correct(B, C, D, E)
        
     */
    public static void main(String... args){
        var values = new ArrayList<String>();
        values.forEach( (var k)->System.out.print(k.length()));
        values.forEach( k -> System.out.print(k.length()));
        var k = values.get(0);
        values.add(k);


        
    }
}
package stream.implicitFI;
import java.util.stream.*;
import java.util.*;

/**
 
    What will the following code print when compiled and run?

        List<StringBuilder> messages = Arrays.asList(
                                new StringBuilder(), new StringBuilder());
        messages.stream().forEach(s->s.append("helloworld"));
        messages.forEach(s->{
            s.insert(5,",");
            System.out.println(s);
        });
        
        A. It will not print anything.
        B. It will not compile.
        C. It will throw IllegalStateException at runtime.
        D. 
            hello,world
            hello,world
            
          StringBuilder is mutable.
          It has several overloaded insert methods (one for each data type such as boolean, char, int, and String)
          that insert the given object into a given position.

            public StringBuilder insert(int offset,  String str)
            Inserts the string into this character sequence.
            The characters of the String argument are inserted, in order, into this sequence at the indicated offset,
            moving up any characters originally above that position and increasing the length of this sequence
            by the length of the argument. If str is null, then the four characters "null" are inserted into this sequence.
            
            The character at index k in the new character sequence is equal to:
            
            the character at index k in the old character sequence, if k is less than offset
            the character at index k-offset in the argument str, if k is not less than offset but is less than offset+str.length()
            the character at index k-str.length() in the old character sequence, if k is not less than offset+str.length()
            The offset argument must be greater than or equal to 0, and less than or equal to the length of this sequence.
            
            Parameters:
            offset - the offset.
            str - a string.
            Returns:
            a reference to this object.
            
        E.
           helloworld
            helloworld
         
        --------------------------------------   
        This is a straightforward code that shows two ways of iterating through a list and performing an operation on each element.

        1. Java 8 has added a default method default void forEach(Consumer<? super T> action) in java.lang.Iterable interface
        (which is extended by java.util.List interface).
        It performs the given action for each element of the Iterable until all elements
        have been processed or the action throws an exception.
        Unless otherwise specified by the implementing class, actions are performed in the order of iteration (if an iteration order is specified).
        Exceptions thrown by the action are relayed to the caller.
        
        2. java.util.Stream interface also contains the same void forEach(Consumer<? super T> action) method
        that applies the given action to each element of the stream.
        This is a terminal operation, which means: 1. it will cause all other intermediate operations
        (such as peek) chained before it to be executed and 2. you cannot chain any more operations after calling this method.
        
       Correct(D)

 */
public class PrintHelloWorld {
    public static void main(String... args){
        List<StringBuilder> messages = Arrays.asList(
                new StringBuilder(), new StringBuilder());
        messages.stream().forEach(s->s.append("helloworld"));
        messages.forEach(s->{
        s.insert(5,",");
        System.out.println(s);
        });

    }
}
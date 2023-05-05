package nio.errors;
import java.nio.file.*;
import java.util.function.*;
import java.util.*;
import java.io.*;

public class NoTerminalOperation {
    /**
     *  What does the following output?
        A. 2
        B. 3
        C. [3 2]
        D. The code does not compile.
        E. None of the above.
        
        The code correctly creates a LinkedList with three elements.
        The stream pipeline does compile. However, there is no terminal operation,
        which means the stream is never evaluated, and the output is something
        like java.util.stream.ReferencePipeline$2@404b9385.
        This is definitely not one of the listed choices, so option E is correct.
     */
    static void firstExample(){
        var dice = new LinkedList<Integer>();
        dice.offer(3);
        dice.offer(2);
        dice.offer(4);
        System.out.print(dice.stream().filter(n -> n != 4));
    }
    
    public static void main(String... args){
        firstExample();
    }
}
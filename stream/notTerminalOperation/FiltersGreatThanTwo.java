package stream.notTerminalOperation;
import java.util.stream.*;
import java.util.*;


/**
 What will the following code print?

    List<Integer> str = Arrays.asList(1,2, 3, 4 );
    str.stream().filter(x->{
        System.out.print(x+" ");
        return x>2;
    });
    
    A. 1 2 3 4
    B. 1 2 3 4 4
    C. 4
    D. It will not print anything.
      ------
      Remember that filter is an intermediate operation.
      It will not be executed until you invoke a terminal operation such as count or forEach on the stream.
    
    -----
    
    To answer this question, you need to know two things - distinction between "intermediate" and "terminal"
    operations and which operations of Stream are "intermediate" operations.

    A Stream supports several operations and these operations are divided into intermediate and terminal operations.
    The distinction between an intermediate operation and a termination operation is that an intermediate operation
    is lazy while a terminal operation is not.
    When you invoke an intermediate operation on a stream, the operation is not executed immediately.
    It is executed only when a terminal operation is invoked on that stream.
    In a way, an intermediate operation is memorized and is recalled as soon as a terminal operation is invoked.
    You can chain multiple intermediate operations and none of them will do anything until you invoke a terminal operation, at which time,
    all of the intermediate operations that you invoked earlier will be invoked along with the terminal operation.
    
    You should read more about this here: http://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html#StreamOps
    
    It is easy to identify which operations are intermediate and which are terminal.
    All intermediate operations return Stream (that means, they can be chained), while terminal operations don't.
    
    filter, peek, and map are intermediate operations.
    Since the code does not invoke any terminal operation on the stream, the calls to these intermediate method do nothing.
    Therefore, no output is produced by the given code.
    
    count, forEach, sum, allMatch, noneMatch, anyMatch, findFirst, and findAny are terminal operations.
     Correct(D)
 */
public class FiltersGreatThanTwo {
    public static void main(String... args){
        List<Integer> str = Arrays.asList(1,2, 3, 4 );
        str.stream().filter(x->{
            System.out.print(x+" ");
            return x>2;
        });
    }
}
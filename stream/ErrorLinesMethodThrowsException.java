package stream;
import java.util.stream.*;
import java.nio.file.*;

public class ErrorLinesMethodThrowsException {
    /**
    * Assuming the file /giraffe/sleep.csv exists with the specified contents, what is the expected output of calling wakeUp() on it?
    *
    * The code does not compile because Files.lines() declares IOException, which is not handled or declared by the wakeUp() method.
    * For this reason, option F is correct. If the method was corrected to declare IOException, then the method would print 111 at runtime.
    * The method reads the lines of the file, splits the values by commas, and then converts the stream of resulting string values to a stream of numbers using the length() method.
    *  Finally, it combines the results into a List and prints each one.
     */
    static void wakeUp(Path path) {
        Files.lines(path)
        .flatMap(p -> Stream.of(p.split(","))) // j1
        .map(s -> s.length()) // j2
        .collect(Collectors.toList())
        .forEach(System.out::print); // j3
    }

    public static void main(String... args){

    }
}
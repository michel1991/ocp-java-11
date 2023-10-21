package nio.fileContent.errors.readLines;
import java.nio.file.*;
import java.io.*;
import java.util.stream.*;

public class BreakFastMenu {
    /**
        Assuming the file referenced in the following snippet exists
        and contains five lines with the word eggs in them, what is the expected output?
        
        A. No lines will be printed.
        B. One line will be printed.
        C. Five lines will be printed.
        D. More than five lines will be printed.
        E. The code does not compile.
        F. None of the above.
        
        The code does not compile because readAllLines() returns a List<String>, not a stream,
        making option E the answer. If the correct method lines() was used instead,
        then five lines would be printed at runtime.
     */
    public static void main(String... args){
        var p = Path.of("breakfast.menu");
        Files.readAllLines(p)
           .filter(s -> s.contains("eggs"))
           .collect(Collectors.toList())
           .forEach(System.out::println);
    }
}
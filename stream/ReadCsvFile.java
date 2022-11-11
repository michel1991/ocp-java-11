package stream;
import java.nio.file.*;
import java.io.*;
import java.util.stream.*;
public class ReadCsvFile {
    /**
    * The readAllLines() method returns a List, not a Stream. Therefore, the call to flatMap() is invalid, and option B is correct.
    * If the Files.lines() method were instead used, it would print the contents of the file one capitalized word at a time, with commas removed.
     */
    static void printData(Path path) throws IOException {
        Files.lines(path) // readAllLines()  r1  
        .flatMap(p -> Stream.of(p.split(","))) // r2
        .peek(x -> {
            System.out.println(" peek " );
            System.out.println("\t "  +x );
            System.out.println(" peek end  " );
            System.out.println();
        })
        .map(q -> q.toUpperCase())  // r3
        .forEach( x -> {
            System.out.println(" is for each " );
            System.out.println("\t "  +x );
            System.out.println(" foreach end  " );
            System.out.println();
        });
    }

    public static void main(String... args) throws IOException{
      var rootPath = System.getProperty("user.dir");
      Path path = Path.of(rootPath, "stream", "food-schedule.csv");
      printData(path);
    }

}
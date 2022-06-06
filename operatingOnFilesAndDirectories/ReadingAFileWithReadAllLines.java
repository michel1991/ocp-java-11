package operatingOnFilesAndDirectories;
import java.nio.file.*;
import java.io.*;
import java.util.*;

class ReadingAFileWithReadAllLines{
  static void make() throws IOException{
     var path = Path.of("/animals/gopher.txt");
     final List<String> lines = Files.readAllLines(path);
    lines.forEach(System.out::println);
  }
}

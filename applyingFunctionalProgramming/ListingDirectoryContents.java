package applyingFunctionalProgramming;
import java.util.stream.*;
import java.nio.file.*;
import java.io.*;

class ListingDirectoryContent{
  static void listing() throws IOException{
     try( Stream<Path> s = Files.list(Path.of("/home"))){
         s.forEach(System.out::println);
      }
  }
}

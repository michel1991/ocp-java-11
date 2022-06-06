package interactingWithPaths;
import java.nio.file.*;
import java.io.*;

class RetrievingTheFileSystemPathWithToRealPath{
  static void accessToTheCurrentWorkingDirectory() throws IOException{
     System.out.println(" Current working directory is " + Paths.get(".").toRealPath());
   } 
 public static void main(String... args) throws IOException {
    accessToTheCurrentWorkingDirectory();

  }

}

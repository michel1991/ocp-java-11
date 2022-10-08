package operatingOnFilesAndDirectories;
import java.nio.file.*;
import java.io.*;

class TestingUniquenessWithIsSame{
  public static void main(String... args) throws IOException{
    String fullPath = System.getProperty("user.dir")  + "/" + "operatingOnFilesAndDirectories";
    String mainDirectory = "animals";
    System.out.println("below with symbolic link");
    System.out.println(Files.isSameFile(Path.of(fullPath, mainDirectory, "cobra") ,Path.of(fullPath, mainDirectory, "snake") ) );

    System.out.println();
    System.out.println("file in different directory");
    System.out.println(Files.isSameFile(Path.of(fullPath, mainDirectory, "monkey", "ears.txt") ,Path.of(fullPath, mainDirectory, "wolf", "ears.txt") ) );
   
    System.out.println();
    System.out.println("same directory that does not exist");
    System.out.println(Files.isSameFile(Path.of("fix") , Path.of("fix") ) );
    
    System.out.println();
    System.out.println("clean up symbol path with normalize ");
    System.out.println(Files.isSameFile(Path.of("./../hello.txt") , Path.of("./../hello.txt") ) );
  }


}

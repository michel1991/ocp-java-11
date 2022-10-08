package managingFileAttributes.discoveringFileAttributes;
import java.nio.file.*;
import java.io.*;

class DiscoveringFileAttributes{
  public static void testRegularFile() {
    // managingFileAttributes/discoveringFileAttributes/DiscoveringFileAttributes
     String mainDirectory = "folder";	   
     String fullPathSource = System.getProperty("user.dir") + "/managingFileAttributes" + "/discoveringFileAttributes/" + "/" + mainDirectory ;
     Path source = Path.of(fullPathSource, "canine", "types.txt");
     boolean result = Files.isRegularFile(source);
     System.out.println("test regular file, resul = " + result + ", source " + source);
  }


  public static void testItIsDirectory(){
      String mainDirectory = "folder";      
     String fullPathSource = System.getProperty("user.dir") + "/managingFileAttributes" + "/discoveringFileAttributes/" + "/" + mainDirectory ;
     Path source = Path.of(fullPathSource, "canine", "fur.txt");
     boolean result = Files.isRegularFile(source);
     System.out.println("test it is directory, resul = " + result + ", source " + source);
  }

  public static void testItIsSymbolicLink(){
         String mainDirectory = "folder";      
     String fullPathSource = System.getProperty("user.dir") + "/managingFileAttributes" + "/discoveringFileAttributes/" + "/" + mainDirectory ;
     Path source = Path.of(fullPathSource, "canine", "coyote");
     boolean result = Files.isSymbolicLink(source);
     System.out.println("test it is symbolic link, resul = " + result + ", source " + source);
  }


  public static void main(String... args){ 
      testRegularFile();	  
      testItIsDirectory();
      testItIsSymbolicLink();
  }


}

package managingFileAttributes.discoveringFileAttributes;
import java.nio.file.*;
import java.io.*;

class CheckingFileAccessibility{

  public static String mainDirectoryFolder(){
    return "folderCheckingFileAccessibility";
  }

  public static void testItIsHidden() throws IOException{
    // managingFileAttributes/discoveringFileAttributes/CheckingFileAccessibility

     String mainDirectory =  mainDirectoryFolder();	   
     String fullPathSource = System.getProperty("user.dir") + "/managingFileAttributes" + "/discoveringFileAttributes/" + "/" + mainDirectory ;
     Path source = Path.of(fullPathSource, ".walrus.txt");
     boolean result = Files.isHidden(source);
     System.out.println("test it is hidden file, resul = " + result + ", source " + source);
  }

  public static void testItIsReadable(){
     String mainDirectory = "folderCheckingFileAccessibility";
     String fullPathSource = System.getProperty("user.dir") + "/managingFileAttributes" + "/discoveringFileAttributes/" + "/" + mainDirectory ;
     Path source = Path.of(fullPathSource, "seal", "baby.txt");         
     boolean result = Files.isReadable(source);  
     System.out.println("test it is readable file, resul = " + result + ", source " + source);
  } 

  public static void testItIsWritable(){
     String mainDirectory = "folderCheckingFileAccessibility";
     String fullPathSource = System.getProperty("user.dir") + "/managingFileAttributes" + "/discoveringFileAttributes/" + "/" + mainDirectory ;
     Path source = Path.of(fullPathSource, "dolphin.txt");         
     boolean result = Files.isWritable(source);  
     System.out.println("test it is writable file, resul = " + result + ", source " + source);
  } 

  public static void testItIsExecutable(){
     String mainDirectory = "folderCheckingFileAccessibility";
     String fullPathSource = System.getProperty("user.dir") + "/managingFileAttributes" + "/discoveringFileAttributes/" + "/" + mainDirectory ;
     Path source = Path.of(fullPathSource, "whale.txt");              
     boolean result = Files.isExecutable(source);  
     System.out.println("test it is executable file, resul = " + result + ", source " + source);
  }

  public static void main(String... args) throws IOException{
     testItIsHidden();
     testItIsReadable();
     testItIsWritable();
     testItIsExecutable();
  }
}

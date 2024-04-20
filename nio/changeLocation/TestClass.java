package nio.changeLocation;
import java.nio.file.*;
import java.io.*;
import nio.NioUtilities;

/**
 * Given:
   Which of the following code fragments can be inserted in the above code so that the file test.txt can be moved to the destination
   location even if a file by the same name already esists at the destination location?
   
  A.  try{
      Files.move(Paths.get(s), Paths.get(d), StandardCopyOption.CREATE_NEW);
      Files.delete(Paths.get(s));
        CREATE_NEW is not a valid field in StandardCopyOption. Only the following three are valid:
        
        ATOMIC_MOVE: Move the file as an atomic file system operation.
        COPY_ATTRIBUTES: Copy attributes to the new file.
        REPLACE_EXISTING: Replace an existing file if it exists.
        
   B. try{
      Files.move(Paths.get(s), Paths.get(d), StandardCopyOption.REPLACE_EXISTING);
      
   C. try(FileChannel in = new FileInputStream(s).getChannel();
         FileChannel out = new FileOutputStream(d).getChannel()){
           in.transferTo(0, in.size(), out);
    }catch(Exception e){
    }
    This code is actually valid but it will only copy the file contents. It will not move the file.
    Note that FileChannel is not on the exam but some candidates have reported seeing an option like this
    
   D. try{
      Files.move(Paths.get(s), Paths.get(d));
        By default, Files.move attempts to move the file to the target file, failing if the target
        file exists except if the source and target are the same file, in which case this method has no effect.
        
        Therefore, this is a valid method call but it will throw an exception if the file already exists at the destination.
        
       Correct(B)

 */
public class TestClass {
    public static void main(String[] args) {
        try{
            String s = "/usr/home1/test.txt";
            String d = "/usr/home2/test.txt";  
            //INSERT CODE HERE
            Files.move(Paths.get(s), Paths.get(d), StandardCopyOption.REPLACE_EXISTING);
        }catch(Exception e){
            
        }
       
    }
}
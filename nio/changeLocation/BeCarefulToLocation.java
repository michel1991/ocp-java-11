package nio.changeLocation;
import java.nio.file.*;
import java.io.*;
import nio.NioUtilities;

public class BeCarefulToLocation {
    
    /**
      Assuming there are no symbolic links involved and file /nursery/sapling.seed exists,
       which statements about the following code snippet are correct? (Choose three.)
       
        A. The code may throw an exception at runtime.
        B. The code may complete without throwing an exception at runtime.
        C. After it runs, the new location of the file would be /nursery/sapling.seed
        D. After it runs, the new location of the file would be /forest/sapling.seed
        E. If a process is monitoring the move, it will not see an incomplete file.
        F. If a process is monitoring the move, it could see an incomplete file.
        
        The code moves a file from /nursery/sapling.seed to the new location of /forest, not /forest/sapling.seed.
        For this reason, options C and D are both incorrect. If there is no file or directory at /forest,
         then the program completes successfully. If a file already exists at that location,
         then an exception is thrown since the REPLACE_EXISTING flag is not set.
         For these reasons, options A and B are both correct.
          Since the ATOMIC_MOVE flag is set, option E is correct, and option F is incorrect.
     */
    static void move() throws IOException{
        // before start create file touch nio/resources/sapling.seed 
        String resourceDirectory = NioUtilities.getResourcePath().toString();
        String fileName = "sapling.seed";
        String locationDirectoryName = "forest";
       
        Path sourceFile =  Paths.get(resourceDirectory, fileName);
        Path fileLocation =  Paths.get(resourceDirectory, locationDirectoryName); // same name as diretcory dest
        Path newLocation =  Paths.get(resourceDirectory, locationDirectoryName);
        System.out.println(" new localion" + newLocation );
        System.out.println(" source "  + sourceFile);
        System.out.println(" file location "  + fileLocation );
        Files.deleteIfExists(fileLocation);
        Files.move(
                sourceFile,
                newLocation,
                StandardCopyOption.ATOMIC_MOVE);
    }
    public static void main(String... args) throws IOException{
        move();
    }
}
package nio.changeLocation.runtime;
import java.nio.file.*;
import java.io.*;
import nio.NioUtilities;

public class MoveModuleInfoFile {
    
    /**
     Assuming that the file module-info.java exists in c:\\temp\\src\\foo.bar but not in c:\\temp\\out\\foo.bar
     and the folder foo.bar exists in c:\\temp\\out, what will happen when the following code is run?


        Path p1 = Paths.get("c:\\temp\\src\\foo.bar\\module-info.java");
        Path p2  = Paths.get("c:\\temp\\out\\foo.bar");
        Files.move(p1, p2);
        
        A. module-info.java will be copied over to out\foo.bar folder.
        B. module-info.java will be moved to out\foo.bar folder.
        
        C. An exception will be thrown.
          
           ------------------------------
            Files.move(Path p1, Path p2, CopyOption... options) moves a file to
            the target file with the options parameter specifying how the copy is performed.
            By default, the move fails if the target file already exists, except if the source and target are the same file,
            in which case the method completes without copying the file.
            
            So, in this case, the call to move will try to move module-info.jar to a file named foo.bar in c:\\temp\\out directory.
            Since, this output path already exists, an java.nio.file.FileAlreadyExistsException will be thrown!.
            
            It will work if p2 is initialized like this:
            Path p2  = Paths.get("c:\\temp\\out\\foo.bar\\module-info.java");
            (assuming module-info.java does not already exist in out\foo.bar)
            
          D. module-info.java will be moved to out with the name foo.bar.

          --------------------------------------
         correct (C)
     */
    public static void main(String... args) throws IOException{
        Path resourcePath = Path.of(NioUtilities.getResourcePath().toString());
       // Path p1 = Paths.get("c:\\temp\\src\\foo.bar\\module-info.java");
        Path p1 = resourcePath.resolve(Paths.get("c", "temp",  "src", "foo.bar", "module-info.java"));
        //Path p2  = Paths.get("c:\\temp\\out\\foo.bar");
        Path p2 = resourcePath.resolve(Paths.get("c", "temp",  "out", "foo.bar"));
        Files.move(p1, p2);
    }
}
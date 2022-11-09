package nio;
import java.nio.file.*;
public class ErrorFilesMethodAlwaysThrowsCheckedException {
    /**
    * The code does not compile, as Files.deleteIfExists() declares the checked IOException that must be handled or declared.
    * Remember, most Files methods declare IOException, especially the ones that modify a file or directory.
    * For this reason, option F is correct. If the method was corrected to declare the appropriate exceptions,
    * then option C would be correct. Option B would also be correct, if the method were provided a symbolic link that pointed to an empty directory.
    * Options A and E would not print anything, as Files.isDirectory() returns false for both.
    * Finally, option D would throw a DirectoryNotEmptyException at runtime.
     */
    public void removeBadFile(Path path) {
        if(Files.isDirectory(path))
            System.out.println(Files.deleteIfExists(path)
            ? "Success": "Try Again");
    }

    public static void main(String... args){
        
    }
}
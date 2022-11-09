package nio;
import java.nio.file.*;
public class ErrorFilesMethodAlwaysThrowsCheckedException {
    public void removeBadFile(Path path) {
        if(Files.isDirectory(path))
            System.out.println(Files.deleteIfExists(path)
            ? "Success": "Try Again");
    }

    public static void main(String... args){
        
    }
}
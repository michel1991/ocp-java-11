package nio.foldersContent.runtime;
import java.nio.file.*;
import java.io.*;

/**
 * Assume the file system is accessible, /flower/rose.txt exists,
 * and the other two directories /garden and /nursery do not exist.
 * What is the expected result after executing the following code snippet?
 
    A. There is a file at /nursery/rose.txt
    B. There is a file at /flower/rose.txt
    C. The code does not compile.
    D. The first move() statement throws an exception.
    E. The second move() statement throws an exception
    
    The code compiles, so option C is incorrect.
    The first two lines successfully create directories.
    The first move() statement moves a file from /flower/rose.txt to /garden, not /garden/rose.txt.
    There is already an empty directory there, but since the REPLACE_EXISTING flag is provided,
    the /garden directory is replaced with a file.
    The next move() statement throws an exception
    because there is no source file at /garden/rose.txt.
    For this reason, option E is correct.
 */
public class GardenNurseryMove {
    public static void main(String... args) throws IOException{
        Files.createDirectories(Path.of("/garden"));
        Files.createDirectory(Path.of("/nursery"));

        Files.move(Path.of("/flower/rose.txt"),
                   Paths.get("/garden"), StandardCopyOption.REPLACE_EXISTING);
        Files.move(new File("/garden/rose.txt").toPath(),
                   Paths.get("/nursery"), StandardCopyOption.ATOMIC_MOVE);
    }
}
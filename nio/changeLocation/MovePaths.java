package nio.changeLocation;
import java.nio.file.*;
import java.io.*;

public class MovePaths {
    /**
    *  Which statements must be true prior to execution of the following method for it to complete without throwing an exception? (Choose all that apply.)
    *   A. p1 refers to a file or directory that exists within the file system.
        B. p1 refers to a file and not a directory that exists within the file system.
        C. p2 refers to a file or directory that does not exist within the file system.
        D. If p2 refers to a directory that exists within the file system, then it must be empty.
        E. p1 refers to a symbolic link.
        F. The file system is available, and path objects are not hidden by the file system.

        First, the file system must be accessible and readily available or the code will throw an exception at runtime, so option F is correct.
        The move() method may be applied to a file or a directory, making option A correct and option B incorrect.
        Next, without the REPLACE_EXISTING option, the method will throw an exception if the target exists, so option C is correct.
        Option D would be correct if the REPLACE_EXISTING option had been used and the p1 referred to a directory.
        Finally, option E is incorrect, as the move() method does not require a symbolic link.
     */
    static void movePaths(Path p1, Path p2) throws Exception {
        Files.move(p1, p2, StandardCopyOption.ATOMIC_MOVE);
    }

    /**
    *  Assume monkey.txt is a file that exists in the current working directory. Which statements about the following code snippet are correct? (Choose all that apply.)
        A. If /animals/monkey.txt exists, then it will be overwritten at runtime.
        B. If /animals exists as an empty directory, then /animals/monkey.txt will be the new location of the file.
        C. If monkey.txt is a symbolic link, then the file it points to will be moved at runtime.
        D. If the move is successful and another process is monitoring the file system, then it will not see an incomplete file at runtime.
        E. The code will always throw an exception at runtime.
        F. None of the above

      The target path of the file after the move() operation is /animals, not /animals/monkey.txt, so options A and B are both incorrect.
      Option B will actually throw an exception at runtime since /animals already exists and is a directory.
      Next, the NOFOLLOW_LINKS option means that if the source is a symbolic link, the link itself and not the target will be copied at runtime, so option C is also incorrect.
      The option ATOMIC_MOVE means that any process monitoring the file system will not see an incomplete file during the move, so option D is correct.
      Option E is incorrect, since there are circumstances in which the operation would be allowed.
      In particular, if /animals did not exist then the operation would complete successfully.

     */
    static void movePMonkeyToAnimals() throws Exception {
        Files.move(Path.of("monkey.txt"), Paths.get("/animals"),StandardCopyOption.ATOMIC_MOVE, LinkOption.NOFOLLOW_LINKS);
    }

    public static void main(String... args){

    }
}
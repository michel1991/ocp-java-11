package nio.paths.errors;
import java.nio.file.*;
import java.net.*;
import java.io.*;

public class BadCreation {
    
    /**
     The following code snippet results in an exception at runtime. Which of the following is the most likely type of exception to be thrown?
        A. AtomicMoveNotSupportedException
        B. DirectoryNotEmptyException
        C. FileAlreadyExistsException
        D. The code does not compile.
        E. None of the above.
        
       The code does not compile because Path.get() is not a valid NIO.2
       method, making option D correct.
       Either Paths.get() or Path.of() should be used instead.
       If the correct method was used, then DirectoryNotEmptyException would be the correct answer.
       The AtomicMoveNotSupportedException in option A is
       possible only when the ATOMIC_MOVE option is passed to the move() method.
       Similarly, the FileAlreadyExistsException in option C is possible
       only when the REPLACE_EXISTING option is not passed to the move() method.
     */
   static void distractWithCopy() throws IOException{
       var oldHardDrivePath = Path.get("c://rodent/mouse.txt");
       var newHardDrivePath = Path.get("d://rodent/rat.txt");
       Files.move(oldHardDrivePath,newHardDrivePath,
                  StandardCopyOption.REPLACE_EXISTING);  
   }
}
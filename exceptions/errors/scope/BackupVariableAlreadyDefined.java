package exceptions.errors.scope;
import java.io.*;

/**
 * What is the output of the following application?
    A. Failed
    B. The application compiles, but a stack trace is printed at runtime.
    C. The code does not compile because of line z1.
    D. The code does not compile because of line z2.
    E. The code does not compile because of line z3.
    F. None of the above.
    
   While a catch block is permitted to include an embedded try-catch block,
   the issue here is that the variable name e is already used by the first catch block.
   In the second catch block, it is equivalent to declaring a variable e twice.
   For this reason, line z2 does not compile, and option D is the correct answer.
   If a different variable name was used for either catch block,
   then the code would compile without issue, printing Failed at runtime.
 */
class Backup {
    public void performBackup() {
        try {
            throw new IOException("Disk not found");  // z1
        } catch (Exception e) {
            try {
                throw new FileNotFoundException("File not found");
            } catch (FileNotFoundException e) {       // z2
                System.out.print("Failed");
            }
        }
    }
    public static void main(String... files) {
        new Backup().performBackup();                // z2
    }
}

public class BackupVariableAlreadyDefined {
  
}
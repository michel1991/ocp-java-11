package autoCloseable.errors.implicitFinalVariable;

import java.io.*;
import java.sql.*;

/**
 * Consider the following code:
 *
  Assuming appropriate import statements and the existence of both the files,
    what will happen when the program is compiled and run?
    
    A. The program will not compile because the try statement is used incorrectly.
    B. The program will not compile because the catch clause is used incorrectly.
    C. The program will not compile because line //2 is invalid.
        The auto-closeable variables defined in the try-with-resources statement are implicitly final. Thus, they cannot be reassigned.
    D. It will compile and run without any error or exception.
    
    (Correct C)

 */
public class FileCopier {
    public static void copy(String records1, String records2)  {
        try (
                InputStream is = new FileInputStream(records1);
                OutputStream os = new FileOutputStream(records2);  ) {  //1

            if(os == null) os = new FileOutputStream("c:\\default.txt");  //2

            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = is.read(buffer)) != -1) {  //3
                os.write(buffer, 0, bytesRead);
                System.out.println("Read and written bytes " + bytesRead);
            }
        } catch (IOException e) { //4
            e.printStackTrace();
        }
    }

    public static void main(String[] args)  {
        copy("c:\\temp\\test1.txt", "c:\\temp\\test2.txt");
    }
}
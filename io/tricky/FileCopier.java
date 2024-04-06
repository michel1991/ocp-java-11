package io.tricky;
import java.io.*;
import io.PathUtility;

/**
   Consider the following code:
   //Assume appropriate imports
   Given that test1.txt exists but test2.txt does not exist, what will happen when the above program is compiled and run?
   
    A. The program will not compile.
    B. The program will compile and run without any exception. test2.txt will be created automatically and contents of test1.txt will be copied to it.
    C. The program will compile and run without any exception but test2.txt will not be created.
    D. An exception will be thrown at run time if the size of test1.txt is not a multiple of 1024.
     The read method reads the bytes that are available even if the number of available bytes is less than the buffer size.
     The method returns the actual number of bytes read. It does not read more bytes than the size of the buffer. Hence, the need for a loop
 */
public class FileCopier {

    public static void copy(String records1, String records2) throws IOException {
        try (
                InputStream is = new FileInputStream(records1);
                OutputStream os = new FileOutputStream(records2);) {
            var buffer = new byte[1024];
            var bytesRead = 0;
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }

        } catch (FileNotFoundException | java.io.InvalidClassException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        copy("c:\\temp\\test1.txt", "c:\\temp\\test2.txt");
    }
}
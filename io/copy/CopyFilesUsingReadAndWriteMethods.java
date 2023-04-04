package io.copy;
import java.io.*;

/**
    Which code, if inserted into the method,
    will cause it to correctly copy any file passed to it that is accessible? (Choose two.)
    
    A.
      while (is.read(data) > 0)
         os.write(data);
     B.
      while ((chirps = is.read(data)) > 0)
         os.write(data, 0, chirps);
     C.
        while ((chirps = is.read(data)) > 0)
           os.write(data);
     D.
      while ((chirps = is.read(data)) > 0)
         os.write(data, chirps, data.length)
    E.  
      String line;
      while ((line = is.readLine()) != null)
         os.write(line + "\n");

    F.
      while ((chirps = is.read()) > 0)
         os.write(chirps);
    
      All of the options compile except option E,
      since FileInputStream does not have a readLine() method.
      A BufferedReader should be used instead.
      Options A and C suffer from the same problem.
      If the file is not exactly a multiple of 123 bytes,
      then extra information will be written to the file from the end of the data array.
      Option D is incorrect because the second argument should be an offset,
      and the third argument should be the number of bytes to read from the data array.
     Option B is correct and uses an array to read a fixed number of bytes
     and then writes that exact number of bytes to the output file.
     Option F is also correct, although it does not use an array.
     Instead, a single byte is read and written on each iteration of the loop.

 */
public class CopyFilesUsingReadAndWriteMethods {
  void copyFile(String source, String target) throws Exception {
    try (var is = new FileInputStream(source);
         OutputStream os = new FileOutputStream(target)) {
      byte[] data = new byte[123];
      int chirps;

      // INSERT CODE HERE
      while ((chirps = is.read(data)) > 0)
            os.write(data, 0, chirps);
            // OR
          /*while ((chirps = is.read()) > 0)
            os.write(chirps);*/
      
        
    }
  }
  
  public static void main(String... args){
    
  }
}
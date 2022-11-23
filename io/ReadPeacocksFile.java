package io;
import java.io.*;

/**
* Assume reader is a valid stream that supports mark() and whose next characters are PEACOCKS. What is the expected output of the following code snippet?
* A. PEAE
* B. PEOA
* C. PEOE
* D. PEOS
* E. The code does not compile.
* F. The code compiles but throws an exception at runtime.
* G. The result cannot be determined with the information given.
*
* The code compiles without issue. Since we’re told the Reader supports mark(), the code also runs without throwing an exception.
* P is added to the StringBuilder first. Next, the position in the stream is marked before E.
* The E is added to the StringBuilder, with AC being skipped, then the O is added to the StringBuilder, with CK being skipped.
* The stream is then reset() to the position before the E.
* The call to skip(0) doesn’t do anything since there are no characters to skip, so E is added onto the StringBuilder in the next read() call.
* The value PEOE is printed, and option C is correct.
 */
public class ReadPeacocksFile {
   public static void read(InputStream reader) throws IOException{
       System.out.println("is supported mark " + reader.markSupported());
       var sb = new StringBuilder();
       sb.append((char)reader.read());
       reader.mark(10);
       for(int i=0; i<2; i++) {
           sb.append((char)reader.read());
           reader.skip(2);
       }
       reader.reset();
       reader.skip(0);
       sb.append((char)reader.read());
       System.out.println(sb.toString());
   }

    public static void main(String... args) throws IOException{
       String rootDir = System.getProperty("user.dir");
       String separator =  System.getProperty("file.separator");
       File file = new File(rootDir + separator + "io" + separator + "PEACOCKS.txt");
       System.out.println( rootDir + " "  + file );
       InputStream reader = new FileInputStream(file);
       read(reader);
       reader.close();
    }
}
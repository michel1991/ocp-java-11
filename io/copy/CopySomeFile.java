package io.copy;
import java.io.*;
import io.PathUtility;

/**
  Given the following method, which statements are correct? (Choose all that apply.)

  A. The code does not compile because reader is not a Buffered stream.
  B. The code does not compile because writer is not a Buffered stream.
  C. The code compiles and correctly copies the data between some files.
  D. The code compiles and correctly copies the data between all files.
  E. If we check file2 on line n1 within the file system after five iterations of the while loop, it may be empty.
  F. If we check file2 on line n1 within the file system after five iterations, it will contain exactly 50 characters.
  G. This method contains a resource leak.

  First, the method does compile, so options A and B are incorrect.
  Methods to read/write byte[] values exist
  in the abstract parent of all I/O stream classes.
  This implementation is not correct, though, as
  the return value of read(buffer) is not used properly.
  It will only correctly copy files whose character count
  is a multiple of 10, making option C correct and option D incorrect.
  Option E is also correct as the data may not have made it to disk yet.
  Option F would be correct if the flush() method was called after every write.
  Finally, option G is correct as the reader stream is never closed.
 */
public class CopySomeFile {
    public static  void copyFile(File file1, File file2) throws Exception {
        var reader = new InputStreamReader(
                new FileInputStream(file1));
        try (var writer = new FileWriter(file2)) {
            char[] buffer = new char[10];
            int numberOfByteRead = 0;
            while( (numberOfByteRead = reader.read(buffer)) != -1 ) { // reader.read(buffer) != -1
                writer.write( buffer);
                // n1
            }
        }
    }

    public static void main(String ... args)  throws Exception{

      String fileSeparator = System.getProperty("file.separator");
      String rootDir = System.getProperty("user.dir");
      StringBuilder path = PathUtility
                    .getResourcePath()
                    .append(PathUtility.getFileSeparator())
      ;

      File fileToRead = new File(path.toString() + "for_copySomeFile.txt" );
      File fileToWrite = new File(path.toString() + "result_for_copySomeFile.txt");
      fileToWrite.delete();
      copyFile(fileToRead , fileToWrite);
    }
}
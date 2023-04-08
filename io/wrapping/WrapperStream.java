package io.wrapping;
import java.io.*;
import static io.PathUtility.*;

public class WrapperStream {
    /**
     * Which classes will allow the following to compile? (Choose all that apply.)
        A. BufferedInputStream
        B. FileInputStream
        C. BufferedWriter
        D. ObjectInputStream
        E. ObjectOutputStream
        F. BufferedReader
        G. None of the above, as the first line does not compile.

        The code will compile if the correct classes are used, so option G is incorrect.
        Remember, a try-with-resources statement can use resources declared before the start of the statement.
        The reference type of wrapper is InputStream, so we need a class that inherits InputStream.
        We can eliminate BufferedWriter, ObjectOutputStream, and BufferedReader since their names do not end in InputStream.
        Next, we see the class must take another stream as input, so we need to choose the remaining streams
        that are high-level streams. BufferedInputStream is a high-level stream, so option A is correct.
        Even though the instance is already a BufferedInputStream, there’s no rule that it can’t be wrapped
        multiple times by a high-level stream. Option B is incorrect,
        as FileInputStream operates on a file, not another stream.
        Finally, option D is correct—an ObjectInputStream is a high-level stream that operates on other streams.

     */
  static void firstExample() throws IOException{
        String file = getResourcePath().append(getFileSeparator()).append("z.txt").toString();
        System.out.println(file);
        var is = new BufferedInputStream(new FileInputStream(file)); // FileInputStream throw checked exception if file not exist FileNotFoundException
      //InputStream wrapper = new BufferedInputStream(is);
      InputStream wrapper = new ObjectInputStream(is); // ______________
      try (wrapper) {}
  }

    public static void main(String... args) throws IOException{
        firstExample();
    }
}
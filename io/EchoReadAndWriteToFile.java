package io;
import io.PathUtility;
import java.io.*;

public class EchoReadAndWriteToFile {
    /**
    * Assuming zoo-data.txt exists and is not empty, what statements about the following method are correct? (Choose all that apply.)
        A. When run, the method creates a new file with one line of text in it.
        B. When run, the method creates a new file with two lines of text in it.
        C. When run, the method creates a new file with the same number of lines as the original file.
        D. The method compiles but will produce an exception at runtime.
        E. The method does not compile.
        F. The method uses byte stream classes.

      The method compiles, so option E is incorrect.
      The method creates a new-zoo.txt file and copies the first line from zoo-data.txt into it, making option A correct.
      The try-with-resources statement closes all of declared resources including the FileWriter o.
      For this reason, the Writer is closed when the last o.write() is called, resulting in an IOException at runtime and making option D correct.
      Option F is incorrect because this implementation uses the character stream classes, which inherit from Reader or Writer.

      Pay attention that if it is empty it will throw exception
    *
     */
    private static void echo() throws IOException {
        String rootPath = System.getProperty("user.dir");
        String fileSeparator = System.getProperty("file.separator");
        String resourceFolder = "resource";
        StringBuilder pathToResourceFile = PathUtility.getResourcePath();

        StringBuilder pathFileReader = new StringBuilder(PathUtility.getResourcePath());
        pathFileReader.append(fileSeparator).append("echo-zoo-data.txt");
        StringBuilder pathFileWriter = new StringBuilder(PathUtility.getResourcePath());
        String nameOfFileToWrite = "echo-new-zoo.txt";
        pathFileWriter.append(fileSeparator).append(nameOfFileToWrite);


        File fileToWrite = new File(
                new File(PathUtility.getResourcePath().toString()),
                nameOfFileToWrite
        );
        fileToWrite.delete();

        var o = new FileWriter(pathFileWriter.toString()); // new-zoo.txt
        try (var f = new FileReader(pathFileReader.toString()); // "zoo-data.txt")
        var b = new BufferedReader(f); o) {
            o.write(b.readLine());
        }
        o.write("");
    }

    public static void main(String... args) throws IOException{
        echo() ;
    }
}
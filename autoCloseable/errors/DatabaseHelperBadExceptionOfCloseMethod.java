package autoCloseable.errors;

import java.io.*;
import java.sql.*;

/**
   What is the output of the following application?
    A. 12
    B. 21
    C. The code does not compile because of the MyDatabase nested class.
    D. The code does not compile because of the try-with-resources statement.
    E. The code does not compile for a different reason.

    The Closeable interface defines a close() method that throws IOException.
    The overridden implementation of MyDatabase, which implements Closeable, declares a SQLException.
    This is a new checked exception not found in the inherited method signature.
    Therefore, the method override is invalid, and the close() method
    in MyDatabase does not compile, making option C the correct answer.
 */
class DatabaseHelper {
    static class MyDatabase implements Closeable {
        public void close() throws SQLException {
            System.out.print("2");
        }
    public void write(String data) {}
    public String read() {return null;}
    }
    public static void main(String... files) throws Exception {
        try (MyDatabasemyDb = new MyDatabase()) {
            // TODO: Decide what to read/rite
        } finally {
            System.out.print("1");
        }
    }
}

public class DatabaseHelperBadExceptionOfCloseMethod {

}
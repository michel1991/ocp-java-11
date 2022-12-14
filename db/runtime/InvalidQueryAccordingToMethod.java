package db.runtime;
import java.sql.*;

public class InvalidQueryAccordingToMethod {
    /**
    * Suppose the table food has five rows. What is the result of this code?
    *   A. 0
        B. 1
        C. 5
        D. The code does not compile.
        E. A SQLException is thrown.
        F. A different exception is thrown.

        While the code compiles, an executeUpdate() statement is not expecting a SELECT SQL statement. The code throws a SQLException because the wrong query is used.
     */
    public static void main(String[] args) throws SQLException {
        try (var conn = DriverManager.getConnection(
                "jdbc:derby:zoo");
        var stmt = conn.prepareStatement("SELECT * FROM food")) {

            var result = stmt.executeUpdate();
            System.out.println(result);
        }
    }
}
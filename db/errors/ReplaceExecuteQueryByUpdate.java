package db.errors;
import java.sql.*;

/**
*
    Suppose the table food has five rows and this SQL statement updates all of them. What is the result of this code?
    
    A. 0
    B. 1
    C. 5
    D. The code does not compile.
    E. A SQLException is thrown.
    F. A different exception is thrown.

    The code does not compile because executeUpdate() should be used for an UPDATE statement.
    By contrast, executeQuery() returns a ResultSet.
 */
public class ReplaceExecuteQueryByUpdate {
  public static void main(String... args) throws SQLException{
      var sql = "UPDATE food SET amount = amount + 1";
      try (var conn = DriverManager.getConnection(
              "jdbc:derby:zoo");
      var ps = conn.prepareStatement(sql)) {

          int result = ps.executeQuery();
          System.out.println(result);
      }
  }
}
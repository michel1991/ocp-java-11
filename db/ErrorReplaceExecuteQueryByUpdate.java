package db;
import java.sql.*;
/**
* The code does not compile because executeUpdate() should be used for an UPDATE statement.
* By contrast, executeQuery() returns a ResultSet.
 */
public class ErrorReplaceExecuteQueryByUpdate {
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
package db.errors;
import java.sql.*;

/**
  What is the most likely outcome of this code if the bunnies table is empty?

    A. One row is in the table.
    B. Two rows are in the table.
    C. The code does not compile.
    D. The code throws a SQLException.

    This question is trickier if you know more JDBC than is on the exam.
    If you know only what is on the exam, you would assume the createStatement() method doesn’t exist.
    However, it does, and stmt is a Statement object.
    Since setString() does not exist on Statement, the code does not compile.
    This means the answer is option C regardless of your level of knowledge of JDBC.

 *
 */
public class StatementDoesNotHaveBindMethod {
   static void insert() throws SQLException{
       var url = "jdbc:derby:bunnies";
       var sql = "INSERT INTO bunny(name, color) VALUES (?, ?)";
       try (var conn = DriverManager.getConnection(url);
   var stmt = conn.createStatement()) {

           stmt.setString(1, "Hoppy");
           stmt.setString(2, "Brown");

           stmt.executeUpdate(sql);
       }

   }
}
package db.runtime;
import java.sql.*;

/**
 *  Suppose we have a bunny table with two columns: name and color.
    What does the following code output if the table is empty?
    *
    A. 0
    B. 1
    C. The code does not compile due to line s1.
    D. The code does not compile due to line s2.
    E. The code does not compile due to another line.
    F. The code throws an exception at runtime.

    The SQL query has two bind variables, but the code sets only one.
    This causes a SQLExceptionwhen executeQuery() is called, making option F the answer.
 */
public class BunnyNotDefineAllValueOfPreparedStatement {
   static void read() throws SQLException{
       var url = "jdbc:derby:bunnies";
       var sql =
   "SELECT count(*) FROM bunny WHERE color = ? and name = ?";
       try (var conn = DriverManager.getConnection(url);
   var stmt = conn.prepareStatement(sql)) {  // s1

           stmt.setString(1, "White");

           try (var rs = stmt.executeQuery()) {  // s2
               if (rs.next())
                   System.out.println(rs.getInt(1));
           }
       }

   }
}
package db.runtime;
import java.sql.*;

public class PeacocksSetNotSpecifierBindVariable {
    /**
       Suppose we have a peacocks table with two columns: name and rating.
        What does the following code output if the table is empty?

        A. false
        B. true
        C. The code does not compile due to line s1.
        D. The code does not compile due to line s2.
        E. The code does not compile due to another line.
        F. The code throws an exception at runtime.

        While the table has two columns, the SQL query hasonly one bind variable (?).
        Therefore, the code throws an exception when attempting
        to set the second bind variable, and option F is correct.
     */
   static void select() throws SQLException{
       var url = "jdbc:derby:birds";
       var sql = "SELECT name FROM peacocks WHERE name = ?";
       try (var conn = DriverManager.getConnection(url);
       var stmt = conn.prepareStatement(sql)) {       // s1

               stmt.setString(1, "Feathers");
               stmt.setString(2, "Nice");

               boolean result = stmt.execute();               // s2

        System.out.println(result);
           }
   }
}
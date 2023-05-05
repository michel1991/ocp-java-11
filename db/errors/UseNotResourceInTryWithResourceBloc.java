package db.errors;
import java.sql.*;

public class UseNotResourceInTryWithResourceBloc {
    
    /**
     * Suppose the pandas table has one row with the name Mei Xiang and the location DC. What does the following code output?
        A. Mei Xiang
        B. No match
        C. The code does not compile due to line s1.
        D. The code does not compile due to line s2.
        E. The code does not compile due to another line.
        F. The code throws an exception at runtime.

         All code in a try-with-resources declaration must implement Closeable or AutoCloseable.
         The call to stmt.setString() does not meet that criteria.
         Since it doesn’t compile, option E is the answer.


     */
    static void selectData() throws SQLException{
        var url = "jdbc:derby:pandas";
        var sql = "SELECT name FROM pandas WHERE location = ?";
        try (var conn = DriverManager.getConnection(url);
           var stmt = conn.prepareStatement(sql);          // s1
           stmt.setString(1, "DC");
           var rs = stmt.executeQuery()) {
        
                    if (rs.next())
                        System.out.println(rs.getString("name"));   // s2
           else
               System.out.println("No match");
                }
    }
}
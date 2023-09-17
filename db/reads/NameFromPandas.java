package db.reads;
import java.sql.*;

public class NameFromPandas {
    /**
       Suppose the pandas table has one row with the name Mei Xiang and the location DC.
       What does the following code output?
       
        A. Mei Xiang
        B. No match
        C. The code does not compile due to line s1.
        D. The code does not compile due to line s2.
        E. The code does not compile due to another line.
        F. The code throws an exception at runtime.

        This code uses a PreparedStatement without bind variables (?).
        While it would be better to use bind variables, this code does run.
        The ResultSet has one value and does print Mei Xiang successfully.
        Therefore, option A is the answer.
     */
    static void readNameFromPanda() throws SQLException{
        var url = "jdbc:derby:pandas";
        var sql = "SELECT name FROM pandas WHERE location = 'DC'";
        try (var conn = DriverManager.getConnection(url);    // s1
               var stmt = conn.prepareStatement(sql);            // s2
               var rs = stmt.executeQuery()) {

            if (rs.next())
                System.out.println(rs.getString("name"));
            else
                System.out.println("No match");
        }
    }
    
    public static void main(String... args){
        
    }
}
package db;
import java.sql.*;

public class ReadData {

    /**
       Suppose the pandas table has one row with the name Mei Xiang and the location DC. What does the following code output?
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

    /**
       Assuming the clowns database exists and contains one empty table named clowns, what is the output of the following?
        A. The code terminates successfully without any output.
        B. The code does not compile due to line s1.
        C. The code does not compile due to line s2.
        D. The code does not compile due to line s3.
        E. None of the above.

        This code correctly obtains a Connection and PreparedStatement.
        It then runs a query, getting back a ResultSet without any rows.
        The rs.next() call returns false, so nothing is printed, making option A correct.


     */
    static void readClowns() throws SQLException{
        var url = "jdbc:derby:clowns";
        var sql = "SELECT * FROM clowns";
        try (var conn = DriverManager.getConnection(url);   // s1
       var stmt = conn.prepareStatement(sql);           // s2
       var rs = stmt.executeQuery()) {                    // s3

                if (rs.next())
                    System.out.println(rs.getString(1));
            }
     }
}
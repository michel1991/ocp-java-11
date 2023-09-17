package db.reads;
import java.sql.*;

public class  ClownsAllRows {

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
    
    public static void main(String... args){

    }
}
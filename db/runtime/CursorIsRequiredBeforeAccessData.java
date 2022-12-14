package db.runtime;
import java.sql.*;


public class CursorIsRequiredBeforeAccessData {
    /**
    *  There are currently 100 rows in the table species before inserting a new row. What is the output of the following code?
    *   A. 100
        B. 101
        C. The code does not compile.
        D. A SQLException is thrown.
        E. A different exception is thrown.
        *
        Before accessing data from a ResultSet, the cursor needs to be positioned. The call to rs.next() is missing from this code.
     */
   static void accessData() throws SQLException{
       String insert = "INSERT INTO species VALUES (3, 'Ant', .05)";
       String select = "SELECT count(*) FROM species";
       try (var conn = DriverManager.getConnection(""); var ps = conn.prepareStatement(insert)) {
           ps.executeUpdate();
       }
        try (var conn = DriverManager.getConnection("");  var ps = conn.prepareStatement(select)) {
           var rs = ps.executeQuery();
           System.out.println(rs.getInt(1));
       }
   }

    public static void main(String... args){

    }
}
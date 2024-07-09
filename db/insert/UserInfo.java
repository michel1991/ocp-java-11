package db.insert;
import java.sql.*;

public class UserInfo {
    /**
     * Given:
       What will be the result?
       
        A. An exception will be thrown at //1
        B. An exception will be thrown at //2
        
        C.  Two rows with the following values will be inserted in the USERINFO table:
            1, Ally A, 101 main str
            2, Bob B, null
            
        D. Two rows with the following values will be inserted in the USERINFO table:
            1, Ally A, 101 main str
            2, Bob B, 101 main str
            
        E. One row with the following values will be inserted in the USERINFO table:
            1, Ally A, 101 main str
            and an exception will be thrown at //2.
            
        --------------------------------
         Correct(D)
         This question is based on the fact that a PreparedStatement remembers
         the values that you set for every parameter until you close that PreparedStatement object (by calling close() on it).
         So, if you execute the same query multiple times with same values for some columns,
         you don't need to set the values for those columns again and again. Setting them once is fine.
         You need to set values for only those columns that require a change.
     */
    public static void main(String... args) throws SQLException{
        var qr = "insert into USERINFO values( ?, ?, ?)";
        var connectionStr ="";
        var c = DriverManager.getConnection(connectionStr); 
        try(PreparedStatement ps =  c.prepareStatement(qr);)
        {
            ps.setObject(1, 1, JDBCType.INTEGER);
            ps.setObject(2, "Ally A", JDBCType.VARCHAR);
            ps.setObject(3, "101 main str", JDBCType.VARCHAR);
            var i = ps.executeUpdate(); //1
            ps.setObject(1, 2, JDBCType.INTEGER);
            ps.setObject(2, "Bob B", JDBCType.VARCHAR);
            i = ps.executeUpdate(); //2
        }
    }
}
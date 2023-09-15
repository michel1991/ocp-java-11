package db.runtime;
import java.sql.*;

/**
   What is the output if the clowns database exists and contains an empty clowns table?
    A. 0
    B. 1
    C. The code does not compile.
    D. The code compiles but throws an exception at runtime.
    
    This code is missing a call to rs.next(). As a result,
    rs.getInt(1) throws a SQLException with the message Invalid cursor state – no current row.
    Therefore, option D is the answer

 */
public class CountWithoutCallNextMethod {
    public static void main(String... args) throws SQLException{
        var url = "jdbc:derby:clowns;create=true";
        var sql = "SELECT count(*) FROM clowns";
        try (var conn = DriverManager.getConnection(url);
           var stmt = conn.prepareStatement(sql);
           var rs = stmt.executeQuery()) {

            System.out.println(rs.getInt(1));
        }
        
    }
}
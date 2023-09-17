package db.count;
import java.sql.*;

/**
  Which is true if the clowns database exists and contains an empty clowns table?
    A. The code compiles and prints 0 without error.
    B. The code compiles and prints 1 without error.
    C. The code does not compile.
    D. The code compiles but throws an exception at runtime on line r1.
    E. The code compiles but throws an exception at runtime on line r2.
    
    The count(*) function in SQL always returns a number.
    In this case, it is the number zero.
    This means line r1 executes successfully because it positions the cursor at that row.
    Line r2 also executes successfully and prints 0, which is the value in the row.
    Since the code runs successfully, option A is the answer.
 */
public class CountFunction {
   static void count() throws SQLException{
       var url = "jdbc:derby:clowns";
       var sql = "SELECT COUNT(*) FROM clowns";
       try (var conn = DriverManager.getConnection(url);
        var stmt = conn.prepareStatement(sql);
        var rs = stmt.executeQuery()) {
        
                   rs.next();   // r1
            System.out.println(rs.getInt(1));   // r2
               }
   }
}
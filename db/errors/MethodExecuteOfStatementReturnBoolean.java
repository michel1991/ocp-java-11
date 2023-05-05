package db.errors;
import java.sql.*;

/**
 * Suppose we have a peacocks table with two columns: name and rating.
 * What does the following code output if the table is empty?
    A. false
    B. true
    C. The code does not compile due to lines 12–13.
    D. The code does not compile due to lines 17–18.
    E. The code does not compile due to another line.
    F. The code throws an exception at runtime.
    
    The execute() method returns a boolean, not a ResultSet.
    This causes a compiler error on line 18, which corresponds to option D.

 */
public class MethodExecuteOfStatementReturnBoolean {
    static void execute() throws SQLException{
        var url = "jdbc:derby:birds"; //  10:
        var sql = "SELECT name FROM peacocks WHERE name = ?"; //   11:
        try (var conn = DriverManager.getConnection(url); //   12:
    var stmt = conn.prepareStatement(sql)) { //     13:  
            //14:
            stmt.setString(1, "Feathers"); //  15:  
            // 16:
            try (var rs = stmt.execute()) { //   17: 
                System.out.println(rs.next()); //    18:  
            } //     19: 
        }  //   20:
    }
}
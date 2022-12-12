package db.runtime;
import java.sql.*;

public interface ExecuteQueryOfStatementNotAllowBind {
    /**
    * Suppose that the table enrichment has three rows with the animals bat, rat, and snake. How many lines does this code print?
        A. 0
        B. 1
        C. 3
        D. The code does not compile.
        E. A SQLException is thrown.
        F. A different exception is thrown.

        The code compiles because PreparedStatement extends Statement and Statement allows passing a String in the executeQuery() call.
        While PreparedStatement can have bind variables, Statement cannot. Since this code uses executeQuery(sql) in Statement, it fails at runtime.
        A SQLException is thrown, making option E correct.
     */
   public static void noBindParameterWithExecuteQueryFromStatementInterface() throws SQLException{
       var sql = "SELECT toy FROM enrichment WHERE animal = ?";
       try (var conn = DriverManager.getConnection("");var ps = conn.prepareStatement(sql)) {
           ps.setString(1, "bat");

           try (var rs = ps.executeQuery(sql)) {
               while (rs.next())
                   System.out.println(rs.getString(1));
           }
       }
   }
}
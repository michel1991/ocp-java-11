package db.runtime.procedure;
import java.sql.*;

public class NoBracketInStorePrecdure {
    /**
      Option A is one of the answers because
      you are supposed to use braces ({}) for all SQL in a CallableStatement.
      Option B is the other answer because each parameter
      should be passed with a question mark (?).
      The rest of the code is correct.
      Note that your database might not behave the way that’s described here,
      but you still need to know this syntax for the exam.
     */
   public static void badQuery() throws SQLException{
       var sql = "call learn()";
       try ( var conn = DriverManager.getConnection(
               "jdbc:derby:zoo");
                var cs = conn.prepareCall(sql)
         ) {
              cs.setString(1, "java");
               try (var rs = cs.executeQuery()) {
                    while (rs.next()) {
                           System.out.println(rs.getString(3));
                         }
             }
      }
   }

    public static void main(String... args){

    }
}
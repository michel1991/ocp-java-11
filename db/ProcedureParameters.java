package db;
import java.sql.*;

public class ProcedureParameters {
    /**
    * Which of the following could be true of the following code? (Choose all that apply.)
    *   A. The stored procedure has one IN parameter defined.
        B. The stored procedure has one INOUT parameter defined.
        C. The stored procedure has one OUT parameter defined.
        D. The code does not compile.
        E. The code is correctly written.

          Since the code calls registerOutParameter() and setInt(), we see it used for both input and output.
          This makes option B correct. There are no errors in the code, so option E is correct as well.
     */
  public static void procedureParameter() throws SQLException{
      var sql = "{call transform(?)}";
      try (var conn = DriverManager.getConnection(
              "jdbc:derby:zoo"); var cs = conn.prepareCall(sql)) {
          cs.registerOutParameter(1, Types.INTEGER);
          cs.setInt(1, 8);
          cs.execute();
          System.out.println(cs.getInt(1));
      }
  }
    
    public static void main(String... args) throws SQLException{
      procedureParameter();
  }
}
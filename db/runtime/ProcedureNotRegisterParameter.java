package db.runtime;
import java.sql.*;

public class ProcedureNotRegisterParameter {
    /**
       Suppose learn() is a stored procedure that takes one IN parameter and one OUT parameter.
       What is wrong with the following code? (Choose all that apply.)

        A. Line 18 does not call the stored procedure properly.
        B. The parameter value is not set for input.
        C. The parameter is not registered for output.
        D. The code does not compile.
        E. Something else is wrong with the code.
        F. None of the above. This code is correct.

        Since an OUT parameter is used, the code should call registerOutParameter().
        Since this is missing, option C is correct.
     */
  static void call() throws SQLException {
      var sql = "{?= call learn(?)}"; // 18:
      try (var conn = DriverManager.getConnection("") ;var cs = conn.prepareCall(sql)) { //  19:
          cs.setInt(1, 8); //   20:
          cs.execute(); //  21:
          System.out.println(cs.getInt(1)); //   22:
      } //   23:
  }

}
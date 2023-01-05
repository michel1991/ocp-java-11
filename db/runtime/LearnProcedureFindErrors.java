package db.runtime;
import java.sql.*;

public class LearnProcedureFindErrors {
    /**
       Suppose learn() is a stored procedure that takes one IN parameter.
       What is wrong with the following code? (Choose all that apply.)

        A. Line 18 is missing braces.
        B. Line 18 is missing a ?.
        C. Line 19 is not allowed to use var.
        D. Line 20 does not compile.
        E. Line 22 does not compile.
        F. Something else is wrong with the code.
        G. None of the above. This code is correct.

       Option A is one of the answers because you are supposed to use braces ({})
       for all SQL in a CallableStatement. Option B is the other answer because
       each parameter should be passed with a question mark (?).
       The rest of the code is correct.
       Note that your database might not behave the way that’s described here,
       but you still need to know this syntax for the exam.

     */
  static void execute() throws SQLException{
      var sql = "call learn()"; // 18:
        try ( var conn = DriverManager.getConnection("jdbc:derby:zoo") ;var cs = conn.prepareCall(sql)) { //  19:
          cs.setString(1, "java"); //   20:
          try (var rs = cs.executeQuery()) { //   21:
              while (rs.next()) { //  22:
                  System.out.println(rs.getString(3)); //   23:
              } //     24:
          } //    25:
      } //  26:

  }
}
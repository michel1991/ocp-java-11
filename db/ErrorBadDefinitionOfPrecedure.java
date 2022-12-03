package db;
import java.sql.*;

public class ErrorBadDefinitionOfPrecedure {
  /**
  *  Suppose learn() is a stored procedure that takes one IN parameter. What is wrong with the following code? (Choose all that apply.)
      A. Line 18 is missing braces.
      B. Line 18 is missing a ?.
      C. Line 19 is not allowed to use var.
      D. Line 20 does not compile.
      E. Line 22 does not compile.
      F. Something else is wrong with the code.
      G. None of the above. This code is correct.
      
      Lines 17 and 19 do not compile because they are not allowed in a try-with-resources declaration.
      Only declarations that implement AutoCloseable or Closeable are permitted.
      Line 20 does not compile because execute() returns a boolean rather than a ResultSet.
      Finally, line 22 does not compile because the ResultSet method should be next(), not hasNext().
      Since there are four errors, option E is correct.
   */
  public static void execute(){
      try (var sql = "{call learn (?)}"; // 17
        var cs = conn.prepareCall(sql); // 18:
         cs.setInt(1, 8); // 19:
       var rs = cs.execute()) { //  20:

          while (rs.hasNext()) { //  22:
                    System.out.println( rs.getString(3)); // 23:
                 } // 24:
          }
  }

    public static void main(String... args){

   }
}
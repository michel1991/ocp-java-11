package db.runtime;
import java.sql.*;

public interface ErrorPrepareCallNotCorrectHere {

    /**
     * Which of the options can fill in the blank to make the code compile and run without error? (Choose all that apply.)
    *
       A. ps.setString(0, "snow");
       B. ps.setString(1, "snow");
       C. ps.setString("environment", "snow");
       D. The code does not compile.
       E. The code throws an exception at runtime.

      This code should call prepareStatement() instead of prepareCall() since it not executing a stored procedure.
       Since we are using var, it does compile. Java will happily create a CallableStatement for you.
       Since this compile safety is lost, the code will not cause issues until runtime.
       At that point, Java will complain that you are trying to execute SQL as if it were a stored procedure, making option E correct.
     */
    public static void replacePrepareCallByPrepareStatement() throws SQLException{
        var sql = "UPDATE habitat WHERE environment = ?";
        try (var conn = DriverManager.getConnection(""); var ps = conn.prepareCall(sql)) {

            ps.executeUpdate();
        }
    }

    public static void main(String... args){

    }
}
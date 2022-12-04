package db;
import java.sql.*;

public class IsValidSqlInjection {
    /**
    *  Which attack could exploit this code?
            A. Command injection
            B. Confidential data exposure
            C. Denial of service
            D. SQL injection
            E. SQL stealing
            F. None of the above

         Option E is incorrect because SQL stealing is not the name of an attack.
         Option C is incorrect because the PreparedStatement and ResultSet are closed in a try-with-resources block.
         While we do not see the Connection closed, we also don’t see it opened.
         The exam allows us to assume code that we can’t see is correct.
         Option D is the answer because bind variables are not used.
         The potentially unsafe provided method parameter hashedPassword is passed directly to the SQL statement.
         Remember that using a PreparedStatement is a necessary, but not sufficient, step to prevent SQL injection.
         For more information, see Chapter 11.
     */
    public boolean isValid(String hashedPassword)
    throws SQLException {

        var sql = "SELECT * FROM users WHERE password = '"
                  + hashedPassword +"'";
        try (var conn = DriverManager.getConnection(
                "jdbc:derby:zoo"); var stmt = conn.prepareStatement(sql);
        var rs = stmt.executeQuery(sql)) {
            return rs.next();
        }
    }

    public static void main(String... args){

    }

}
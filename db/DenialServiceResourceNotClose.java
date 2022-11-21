package db;
import java.sql.*;
/**
* Which attack could exploit this code?
* A. Command injection
* B. Confidential data exposure
* C. Denial of Denial Service
* D. SQL hashing
* E. SQL injection
* F. None of the above
*
* Option D is correct because SQL hashing is not an attack.
* Option E is incorrect because this code properly uses bind variables.
* It does not properly close resources in the same block it is opened.
* Since there is a resource leak, we have a potential denial-of-service attack, making option C correct.
 */
public class DenialServiceResourceNotClose {
    public boolean isValid(String hashedPassword)
    throws SQLException {
        var conn = DriverManager.getConnection("");
        var sql = "SELECT * FROM users WHERE password = ?";
        var stmt = conn.prepareStatement(sql);
        stmt.setString(1, hashedPassword);
        var rs = stmt.executeQuery(sql);
        return rs.next();
    }

    public static void main(String... args)  throws SQLException{

    }
}
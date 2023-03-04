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

    /**
       Which statement best describes the following method?
        A. It is not susceptible to any common attacks.
        B. It is at risk of SQL injection attack only.
        C. It is at risk of a denial of service attack only.
        D. It is at risk of both SQL injection and denial of service attacks.
        E. The method does not compile.
        F. None of the above.

        The class compiles, so option E is incorrect.
        It is recommended to use a PreparedStatement over a Statement to avoid SQL injection although it is not strictly necessary.
        In this case, because the data type of the variable is int, Java already prevents a malicious String from being entered into the query.
        Therefore, this method is not at risk for SQL injection, making option B incorrect.
        On the other hand, the code is a risk of a resource leak that could be exploited in a denial of service attack.
        While the Connection object doesn’t need to be declared in the try-with-resources block,
        it should be declared right before it. In this case, there’s a line in between, con.createStatement(),
        that could throw an exception, thereby preventing the Connection from ever being closed. For these reasons, option C is correct.
     */
    public String findNewLego(String url, int type)
      throws SQLException {
        var query = "SELECT name FROM sets WHERE "
                    + "type = " + type + " ORDER BY date DESC";
        var con = DriverManager.getConnection(url);
        var ps = con.createStatement();
        try(con; ps; var rs = ps.executeQuery(query)) {
            if(rs.next()) return rs.getString(1);
        }
        throw new RuntimeException("None available, try  later");
    }

}
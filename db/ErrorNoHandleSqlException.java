package db;
import java.sql.*;

/**
* JDBC code throws a SQLException, which is a checked exception.
* The code does not handle or declare this exception, and therefore it doesn’t compile.
* Since the code doesn’t compile, option D is correct.
*  If the exception were handled or declared, the answer would be option C.
 */
public class ErrorNoHandleSqlException {
    public static void main(String[] args) {
        var sql = "UPDATE food SET amount = amount + 1";
        try (var conn =
        DriverManager.getConnection("jdbc:derby:zoo");
        var ps = conn.prepareStatement(sql)) {

            var result = ps.executeUpdate();
            System.out.println(result);
        }
    }

}
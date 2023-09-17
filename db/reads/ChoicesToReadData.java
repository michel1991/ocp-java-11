package db.reads;
import java.sql.*;

public class ChoicesToReadData {


   /**
    * Which of the following methods can run without error for at least one SQL query?
    *   A. moreChoices()
        B. stillMoreChoices()
        C. choices() and stillMoreChoices()
        D. moreChoices() and stillMoreChoices()
        E. All three methods
        F. None of the above

        The most common approach is stillMoreChoices(),
        which works for any SELECT statement that has an int in the first column.
        If the SELECT statement has a function like count(*) or sum(*) in the first column,
        there will always be a row in the ResultSet,
        so moreChoices() works as well. Therefore, option D is the answer.
    */
    private static void choices(PreparedStatement ps,
                                String sql) throws SQLException {

        try (var rs = ps.executeQuery()) {
            System.out.println(rs.getInt(1));
        }
    }
    private static void moreChoices(PreparedStatement ps,
                                    String sql) throws SQLException {

        try (var rs = ps.executeQuery()) {
            rs.next();
            System.out.println(rs.getInt(1));
        }
    }
    private static void stillMoreChoices(PreparedStatement ps,
                                         String sql) throws SQLException {

        try (var rs = ps.executeQuery()) {
            if (rs.next())
                System.out.println(rs.getInt(1));
        }
    }

}
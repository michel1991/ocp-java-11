package db.runtime;
import java.sql.*;

/**
 * What is the most likely outcome of this code if the people table is empty?
    A. It prints false false.
    B. It prints true false.
    C. It does not terminate.
    D. It throws a SQLException.
    E. None of the above.

    When running a query on a PreparedStatement,
    Java closes any already open ResultSet objects associated with the statement.
    This means that rs1 is closed on line 8.
    Therefore, it throws a SQLException on line 9 because we are trying to call next() on a closed ResultSet,
    and option D is correct.
 */
public class ClosePreviousResultSetOnSamePreparedStatement {
   static void close(Connection conn) throws SQLException {
       var stmt = conn.prepareStatement("SELECT * FROM people"); //  6:
       var rs1 = stmt.executeQuery(); // 7:
       var rs2 = stmt.executeQuery(); //  8:
       System.out.println(rs1.next() + " " + rs2.next()); // 9:

   }
}
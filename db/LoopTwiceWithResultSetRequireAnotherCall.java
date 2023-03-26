package db;
import java.sql.*;

/**
  Question: Suppose that the table counts has five rows with the numbers 1 to 5.
   How many lines does this code print?

  This code is tricky. While it does have two loops for the ResultSet,
  there is no call to the database in between.
  Therefore, the second call to setInt() is unused,
  and the second while loop does not iterate through any data.
  Only two lines are printed, making option C correct.
 */
public class LoopTwiceWithResultSetRequireAnotherCall {
  public static void loop() throws SQLException{
      var sql = "SELECT num FROM counts WHERE num > ?";
      try (var conn = DriverManager.getConnection("jdbc:derby:zoo") ;
            var ps = conn.prepareStatement(sql)
      ) {
          ps.setInt(1, 3);

          try (var rs = ps.executeQuery()) {
              while (rs.next())
                  System.out.println(rs.getObject(1));

              ps.setInt(1, 3);

              while (rs.next())
                  System.out.println(rs.getObject(1));
          }
      }
  }
}
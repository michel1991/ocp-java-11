package gettingADatabaseConnection;
import java.sql.*;

public class TestExternal{
  public static void main(String[] args) throws SQLException{
      Connection conn = DriverManager.getConnection("jdbc:postgresql:localhost:5432/ocp-book", "username", "Password20182");
      System.out.println(conn);
  }
}

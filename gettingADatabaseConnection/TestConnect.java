package gettingADatabaseConnection;
import java.sql.*;

public class TestConnect{
  public static void main(String[] args) throws SQLException{
      Connection conn = DriverManager.getConnection("jdbc:derby:derby_zoo_db");
      System.out.println(conn);
  }
}

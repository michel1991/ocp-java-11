package introducingTheInterfacesOfJDBC;
import java.sql.*;

public class MyFirstDatabaseConnection{
    public static void main(String[] args) throws SQLException{
      String url = "jdsc:derby:derby_zoo_db";
      try (
           Connection  conn = DriverManager.getConnection(url);
           PreparedStatement ps = conn.prepareStatement("SELECT name FROM animal");
           ResultSet rs = ps.executeQuery()
        ){
              while(rs.next())
               System.out.println(rs.getString(1));
         }
   }// end method
}

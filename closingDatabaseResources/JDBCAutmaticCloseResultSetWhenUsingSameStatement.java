package closingDatabaseResources;
import java.sql.*;

class JDBCAutmaticCloseResultSetWhenUsingSameStatement{
  static void automaicClose() throws SQLException{
      	var url = "jdbc:derby:zoo";
	var sql = "SELECT count(*) FROM names where id = ?";
	 try (var conn = DriverManager.getConnection(url);  var ps = conn.prepareStatement(sql)) 
	 {
		ps.setInt(1, 1);
		var rs1 = ps.executeQuery();
		while (rs1.next()) {
		     System.out.println("Count: " +  rs1.getInt(1));
		 }
		 
		  ps.setInt(1, 2);
		  var rs2 = ps.executeQuery();
		  
		 while (rs2.next()) {
			   System.out.println("Count: " +   rs2.getInt(1));
		 }
		 
		  rs2.close(); 
	  }   
  }


}

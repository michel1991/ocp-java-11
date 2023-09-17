package db.update;
import java.sql.*;

public class CallExecuteUpdateTwice {

    /**
       Suppose we have an empty bunny table with two columns: name and color.
       What is the state of the table after running this code

        A. It has one row.
        B. It has two rows, and the color is Brown in both.
        C. The code does not compile due to line s1.
        D. The code does not compile due to line s2.
        E. The code does not compile due to another line.
        F. The code throws an exception at runtime.

        This code is correct. It executes the first update to add
        the first row and then sets the parameters for the second.
        When it updates the second time, it adds the second row.
        Therefore, option B is the answer.
     */
 static void insert() throws SQLException{
     var url = "jdbc:derby:bunnies";
     var sql = "INSERT INTO bunny(name, color) VALUES (?, ?)";
     try (var conn = DriverManager.getConnection(url);
   var stmt = conn.prepareStatement(sql)) {  // s1

         stmt.setString(1, "Daisy");
         stmt.setString(2, "Brown");

         stmt.executeUpdate();

         stmt.setString(1, "Cinna");
         stmt.setString(2, "Brown");

         stmt.executeUpdate();
     }
 }
    
    public static void main(String... args){

    }
}
package db.errors;
import java.sql.*;

/**
   What will the following code fragment print when compiled and run?
   (Assume that items not specified such as import statements and try/catch block are all valid.)
   
   A. It will throw an exception if the first column of the result is not a String.
    Since Object class has a toString() method, any type can be converted to a String.
    So this cannot be a cause of the exception. If you use getInt() or getDouble and
    if the column value cannot be converted to an int or double, then that will cause an Exception.
    
   B. It will throw an exception every time it is run irrespective of what the query returns.
   C. It will print the values for the first column of the result and if there is no row in STUDENT table, it will not print anything.
   
   D. It will not compile.
          Observe that the declaration of try-with-resources statement is wrong.
       The type of the resource must be specified in the try itself. i.e. it should be:
        try(Statement stmt = c.createStatement())

        The try-with-resource was enhanced in Java 9 and it now allows
        you to use a variable declared before the try statement in the try-with-resource
        block as long as it is final or effectively final.
        For example, the following is valid since Java 9:

        Statement stmt = c.createStatement();
        try(stmt){
          ...
        }
        However, try(stmt = c.createStatement();) is still invalid.
   
   
   Correct is D
 */

public class NotTypeAtStatementInTWR {
   public void select() throws SQLException {
       Statement stmt = null;
       Connection c = DriverManager.getConnection(
               "jdbc:derby://localhost:1527/sample",
               "app", "app");
       try(stmt = c.createStatement();)
       {

           ResultSet rs = stmt.executeQuery("select * from STUDENT");
           while(rs.next()){
               System.out.println(rs.getString(0));
           }

       }
       catch(SQLException e){
           System.out.println("Exception ");
       }
   }   
}
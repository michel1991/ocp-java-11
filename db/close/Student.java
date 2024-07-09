package db.close;
import java.sql.*;



public class Student {
    
    /**
        Consider the following code:
        
        Which objects can be successfully used to query the database after the try block ends without any exception?
        
        A. stmt
        B. c
        C. rs
        D. stmt as well c
        E. None of them.
        
        ----------------------------
        There are a few things to note in the question:
        1. Once a Connection object is closed, you cannot access any of the subsequent objects such as Statement and ResultSet that are retrieved from that Connection.
        2. The references declared in the try block (in this case, c and ResultSet) are not visible outside the try block. Not even in the catch block.
        3. When a resource is created in the try-with-resources block ( in this case, c),
      it is closed at the end of the try block irrespective of whether there is an exception in the try block or not.
        
        Based on the above, it is easy to see that only stmt is visible
        after the try block but it cannot be successfully used because the Connection object from which it was retrieved has already been closed.
        
        Correct(E)

     */
    public static void main(String... args){
        Statement stmt = null;
        try(Connection c = DriverManager.getConnection(
                                       "jdbc:derby://localhost:1527/sample", "app", "app"))
        {
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("select * from STUDENT");
            while(rs.next()){
                System.out.println(rs.getString(1));
            }
        
        }
        catch(SQLException e){
            System.out.println("Exception "+e);
        }
    }
}
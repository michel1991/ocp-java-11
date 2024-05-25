package db.reads;
import java.sql.*;

/**
  Consider the following code :

        
        Connection connection = dataSource.getConnection();
        PreparedStatement stmt = connection.prepareStatement(
            "select * from CUSTOMER where EMAILID=?");
        stmt.setObject(1, "bob@gmail.com"); //LINE 10
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
        System.out.println(rs.getString("EMAILID")); //LINE 12
        }
        connection.close();
    
    Assuming that the query returns exactly 1 row, what will be printed when this code is run?
    (Assume that items not specified such as import statements, DB url, and try/catch block are all valid.)
    
    A. It will throw an exception at //LINE 12.
    B. Compilation will fail due to //Line 12
    C. It will print bob@gmail.com
    D. It will print bob@gmail.com and then throw an exception.
    
    ---------------------------------------------
     Correct(C)
    1. "select *" implies you are selecting all the columns.
    2. You can retrieve the values from a ResultSet using either the columns indices, which starts with 1 or using the actual
    column names of the database tables.
    3. Column names used as input to getter methods are case insensitive. When a getter method is called with a column name and several
   columns have the same name, the value of the first matching column will be returned.
    
    Now, it is given that the query returns 1 row, therefore, it can be assumed that EMAILID is a valid column name in this table.
    Therefore, there is no problem with the code and it should print the value 'bob@gmail.com'.
    
    javax.sql.DataSource
    Although not mentioned in the exam objectives, you may see the usage of DataSource.getConnection method in exam questions.
    Do not be alarmed by this because it has no impact on the answer.
    javax.sql.DataSource is actually the preferred way of getting a Connection in enterprise applications instead of java.sql.DriverManager.
    The most important benefit is that the application code does not need to have access to database connection details
    (i.e. userid, pwd, and dburl). A DataSource is configured in the application server and the application simply looks it up using JNDI.
    To get a connection from the DataSource, you can just do:
    Context ctx = new InitialContext();
    DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/MyLocalDB");
    Connection c = dataSource.getConnection(); //no arguments
    DataSource also improves application performance as connections are not created/closed within a class.
    They are managed by the application server and can be fetched at runtime.
    It provides a facility creating a pool of connections and is therefore very helpful for enterprise applications.

 */
class DataSource{
   Connection getConnection(){
     return null;   
   }
}
public class EmailId {
    public static void main(String... args) throws SQLException{
        var dataSource = new DataSource();
        Connection connection = dataSource.getConnection();
        PreparedStatement stmt = connection.prepareStatement(
                "select * from CUSTOMER where EMAILID=?");
        stmt.setObject(1, "bob@gmail.com"); //LINE 10
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString("EMAILID")); //LINE 12
        }
        connection.close();
    }
}
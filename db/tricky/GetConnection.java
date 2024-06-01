package db.tricky;
import java.sql.*;
import java.util.*;

/**
   
   Which of the following method would you use to get a JDBC connection while using JDBC 4.0 but not while using a previous version of JDBC?
    
    A.
      public Connection getConnection1(String url, String userid, String pwd)
        throws Exception{
        Properties p = new Properties();
        p.setProperty("user", userid);
        p.setProperty("password", pwd);
        return DriverManager.getConnection(url, p);        
    }
      -----------
      This is a valid way in JDBC 4.0 to get a connection.
      
    B.
      public Connection getConnection2(String url, String userid, String pwd)
        throws Exception{
        Properties p = new Properties();
        p.setProperty("user", userid);
        p.setProperty("password", pwd);
        DriverManager.registerDriver("com.xyz.Driver");
        return DriverManager.getConnection(url, p);
      }
        ------------------------
        There are 3 problems with it:
        1. DriverManager.registerDriver is a valid method but it takes java.sql.Driver instance and not a String.
        2. This method is used by the Driver class to register itself with the DriverManager. It need not be called by the application programmer.
        3.In JDBC 4.0, if you have the jar file that implements the Driver in the classpath, the Driver is automatically registered
        
    C.
       public Connection getConnection3(String url, String userid, String pwd)
        throws Exception{
        Properties p = new Properties();
        p.setProperty("jdbc.driver", "com.xyz.Driver");
        p.setProperty("jdbc.user", userid);
        p.setProperty("jdbc.user.password", pwd);
        return DriverManager.getConnection(url, p);
      }
      -----------------------------
       1. The property names jdbc.user and jdbc.user.password are invalid. They should be user and password.
        2. jdbc.driver is also an invalid property name but it is not an error to use it. It will not be used.
        
    D.
      public Connection getConnection4(String url, String userid, String pwd)
            throws Exception{
            Class.forName("com.xyz.Driver");
            return DriverManager.getConnection(url, userid, pwd);        
        }
        
      --------------------------------------
        Loading a Driver class explicitly is required only in lower versions of JDBC and not for JDBC 4.0.

        Applications no longer need to explicitly load JDBC drivers using Class.forName().
        
        The DriverManager methods getConnection and getDrivers have been enhanced
        to support the Java Standard Edition Service Provider mechanism.
        JDBC 4.0 Drivers must include the file META-INF/services/java.sql.Driver.
        This file contains the name of the JDBC drivers implementation of java.sql.Driver.
        For example, to load the my.sql.Driver class, the META-INF/services/java.sql.Driver file would contain the entry:
        
        my.sql.Driver
        When the method getConnection is called, the DriverManager will attempt to locate a suitable driver from amongst
        those loaded at initialization and those loaded explicitly using the same classloader as the current applet or application.
        
        
    E.
       public Connection getConnection5(String url, String userid, String pwd)
          throws SQLException{
        return DriverManager.getConnection(url, userid, pwd);        
        }
        
      -------------------------------------------
      javax.sql.DataSource
        Although not mentioned in the exam objectives, you may see the usage of DataSource.getConnection method in exam questions.
        Do not be alarmed by this because it has no impact on the answer. javax.sql.DataSource is actually the preferred way
        of getting a Connection in enterprise applications instead of java.sql.DriverManager.
        The most important benefit is that the application code does not need to have access to database connection details
        (i.e. userid, pwd, and dburl). A DataSource is configured in the application server and the application simply looks it up using JNDI.
        To get a connection from the DataSource, you can just do:
        
        Context ctx = new InitialContext();
        DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/MyLocalDB");
        Connection c = dataSource.getConnection(); //no arguments
        DataSource also improves application performance as connections are not created/closed within a class.
        They are managed by the application server and can be fetched at runtime.
        It provides a facility creating a pool of connections and is therefore very helpful for enterprise applications.
      
       Correct(A, E)
       
     
 */
public class GetConnection {
    public Connection getConnection1(String url, String userid, String pwd)
        throws Exception{
        Properties p = new Properties();
        p.setProperty("user", userid);
        p.setProperty("password", pwd);
        return DriverManager.getConnection(url, p);        
    } 
}
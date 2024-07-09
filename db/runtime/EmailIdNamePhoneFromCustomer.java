package db.runtime;
import java.sql.*;

/**
    Consider the following code written to generate a report containing customer data where each line is a pipe separated list of values.
    
    Identify the correct statement about this code.
    (Assume that items not specified such as import statements and try/catch block are all valid.)
    
    A. It will throw an exception when run if there is at least 1 record in the table.
        The numbering of columns in a ResultSet starts with 1. Therefore, rs.getString(0) will cause an SQLException.
        
    B. It will throw an exception when run if there are no records in the table.
    C. It will print the data as expected.
    D. It will not compile.
    
    Correct(A)

 */
public class EmailIdNamePhoneFromCustomer {
    public static void main(String... args) throws SQLException{
        String qr = "select EMAILID, NAME,  PHONE from CUSTOMER "+
                    "order by EMAILID";
         var connection = DriverManager.getConnection("");
          PreparedStatement stmt = connection.prepareStatement(qr);
          ResultSet rs = stmt.executeQuery(); //LINE 10
          while(rs.next()){
              System.out.println(rs.getString(0)+"|"+rs.getString(1)+
                                            "|"+rs.getString(3));
          }
          connection.close();
    }
}

package db.enquoted;
import java.sql.*;

/**
   Consider the following method:

    public void setSQLMode(Connection c, String mode) throws Exception{
        Statement stmt = c.createStatement();
        String qr = "SET SESSION sql_mode = '"+mode+"';";
        stmt.execute(qr);
    }
    
    Identify the correct statement about the above code.
    
    A. mode should enquoted like this:
        String qr = "SET SESSION sql_mode = "+stmt.enquoteLiteral(mode)+";";
        because enquoting values provided by the calling code prevents SQL injection attacks.
        
        ---------------
        Statement's enquoteLiteral method returns a String enclosed in single quotes.
        Any occurrence of a single quote within the string will be replaced by two single quotes. This prevents SQL injection attacks.

        In the exam, you may see the usage of the enquoteIdentifier method as well.
        
    B.There is no need to enquote mode because identifiers need not be enquoted.
    C. There is no need to enquote mode because the calling code would have enquoted it already.
    D. Enquoting mode would make no difference because it is functionally equivalent to the current statement.
    E. mode should be enquoted because all user input should be enquoted.
    
    ------
    This question is not really about SET SESSION query but about the enquoteIdentifier and enquoteLiteral
    methods that were added in Java 9 to the java.sql.Statement interface to help prevent SQL injection attacks.

    Although the exam does not focus too much on SQL injection, we have seen a question on the exam that expects
    you to know about the general idea behind these two methods.
    You should read a little about SQL injection and check out the JavaDoc API description of these two methods.
    
    Difference between enquoteLiteral and enquoteIdentifier:
    
    Briefly, Identifiers are database objects that are created by the user.
    For example, if you create a table named Employees, then Employees is an identifier.
    Identifiers are, by default, case insensitive.
    Therefore, both select * from Employees and select * from EMPLOYEES are equivalent and will work fine if the table is named employees.
    However, in certain situations, one may want to use the exact name without ignoring the case.
   To do that, one can enquote the identifier within double quotes.
   If an identifier is enquoted, then the database performs an exact match.
   For example, select * from "Employees" and select * from "EMPLOYEES" will both fail if the table is named employees.
    
    Statement has default String enquoteIdentifier(String identifier, boolean alwaysQuote) method for this purpose.
    You should check out the JavaDoc API description for more details.
    
    Literals are the values passed in a query.
    For example, in query select * from employees where dept='IT', IT is a literal.
    Literals are always enquoted within single quote and are generally case sensitive.
    So, 'IT' will not match 'it' or 'It'.
    Since values are generally supplied by the user (such as from a form submission in a web page), they are prone SQL injection attacks.
    For example, the following line of code will produce select * from employees where dept='IT'; delete from emloyees where ''='';
    if the user enters the string IT'; delete from emloyees where ''=' in the DEPT field of a form:
    
    String qr = "select * from employees where dept='"+dept+"'";
    
    Therefore, it is always good enquote the literal values using Statement's enquoteLiteral method.
    This method ensures that if the value contains a single quote, it is escaped properly. For example,
    enquoteLiteral("IT'; delete from emloyees where ''='"); will produce IT''; delete from emloyees where ''''=''.
    This eliminates the possibility of an sql injection by rendering an insidious query inexecutable (because of bad syntax).
    
    String qr = "select * from employees where dept="+stmt.enquoteLiteral(dept)+"";
     Correct (A)
    

 */
public class SetSQLMode {
    public void setSQLMode(Connection c, String mode) throws Exception{
        Statement stmt = c.createStatement();
       //  String qr = "SET SESSION sql_mode = '"+mode+"';";
        String qr = "SET SESSION sql_mode = "+stmt.enquoteLiteral(mode)+";";
        stmt.execute(qr);
    }
}
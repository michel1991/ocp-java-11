package db.methodDefinition;
import java.sql.*;
public class PrepareStatementChoiceCorrectMethod {
    /**
    * Which of the options can fill in the blanks in order to make the code compile?
    *   A. execute, executeQuery, executeUpdate
        B. execute, executeUpdate, executeQuery
        C. executeQuery, execute, executeUpdate
        D. executeQuery, executeUpdate, execute
        E. executeUpdate, execute, executeQuery
        F. executeUpdate, executeQuery, execute

    The first line has a return type of boolean, making it an execute() call.
    The second line returns the number of modified rows, making it an executeUpdate() call.
    The third line returns the results of a query, making it an executeQuery() call.
     */
    public static void choiceCorrect(PreparedStatement ps) throws SQLException{
      boolean bool = ps.execute(); // _________
      int num = ps.executeUpdate(); // _____________
      ResultSet rs = ps.executeQuery(); // ___________
  }

    public static void main(String ... args){

    }
}
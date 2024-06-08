package db.insert;
import java.sql.*;

public class Stock {
    /**
     Given:

        String qr = "insert into STOCK ( ID, TICKER, LTP, EXCHANGE ) "+
        "values( ?, ?, ?, ?)";
        String[] tickers = {"AA", "BB", "CC", "DD" };
        
        You are trying to initialize the STOCK table and for that you need to insert one row for each of the ticker value in the tickers array.
        Each row has to be initialized with the same values except the ID and TICKER columns, which are different for each row.
        The ID column is defined as AUTO_INCREMENT and so you need to pass only 0 for this column.
        
        Which of the following code snippets would you use?
        
        A.
           for(String ticker : tickers)
            try(PreparedStatement ps =  c.prepareStatement(qr);)
            {
                ps.setInt(1, 0);
                ps.setString(2, ticker);
                ps.setDouble(3, 0.0);
                ps.setString(4, "NYSE");
                ps.executeUpdate();
            }
            -----
            This will close the PreparedStatement after each insert. This is very inefficient.
            
        B.
           try(PreparedStatement ps =  c.prepareStatement(qr);)
            {
                for(String ticker : tickers) {
                    ps.setInt(1, 0);
                    ps.setString(2, ticker);
                    ps.setDouble(3, 0.0);
                    ps.setString(4, "NYSE");
                    ps.executeUpdate();
                }
            }
            ----
            This is better than option 1 but there is no need to set the values for ID, LTP, and EXCHANGE columns in every iteration
       C.
          try(PreparedStatement ps =  c.prepareStatement(qr);)
            {
                ps.setInt(1, 0);
                ps.setDouble(3, 0.0);
                ps.setString(4, "NYSE");
                for(String ticker : tickers) {
                    ps.setString(2, ticker);
                    ps.executeUpdate();
                }
            }
            All of the options will insert the required rows in the table, however,
            this option is most suitable because it is the most efficient of all.
            A PreparedStatement remembers the values once you set them until you close it.
            So, there is no need to reset the values for ID, LTP, and EXCHANGE columns if they are not changing

       D.
            for(String ticker : tickers)
            try(Statement s =  c.createStatement(qr);)
            {
                s.executeUpdate("insert into STOCK ( ID, TICKER, LTP, EXCHANGE ) "+
                                                    "values( 0, '"+ticker+"', 0.0, 'NYSE')");
            }
            This option is as bad as option 1 in terms of performance. Further, it does not offer protection from SQL injection either.

      --------------------------
       Correct(C)
          
     */
    public static void main(String... args) throws SQLException{
        String qr = "insert into STOCK ( ID, TICKER, LTP, EXCHANGE ) "+
                    "values( ?, ?, ?, ?)";
                    String[] tickers = {"AA", "BB", "CC", "DD" };
        var connectionStr ="";
        var c = DriverManager.getConnection(connectionStr);            
        try(PreparedStatement ps =  c.prepareStatement(qr);)
        {
            ps.setInt(1, 0);
            ps.setDouble(3, 0.0);
            ps.setString(4, "NYSE");
            for(String ticker : tickers) {
                ps.setString(2, ticker);
                ps.executeUpdate();
            }
        }
    }
}
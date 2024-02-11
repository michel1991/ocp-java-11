### Given that a table named STOCK exists with nullable columns as follows:

```
ID(int, primary key)  TICKER(varchar)   LASTPRICE(int, nullable)   
                                EXCHANGE(varchar, nullable)   

and the following code:

        Connection c = //get connection

        String qr = "insert into STOCK ( ID, TICKER, LASTPRICE, EXCHANGE ) "+
                          "values( ?, ?, ?, ?)";

        PreparedStatement ps = c.prepareStatement(qr);
        ps.setInt(1, 1);
        ps.setString(2, "APPL");   

       //INSERT CODE HERE

        int i = ps.executeUpdate();  //1
        System.out.println(i);

```
#### What can be inserted in the above code so
#### that a row with values (1, "APPL", null, null) will be inserted in the STOCK table?

* A. 
    ps.setNull(3, JDBCType.INTEGER);
    ps.setNull(4, JDBCType.STRING);
    The second parameter to the setNull method is of type int and it expects the value
    to be one of the constants defined in java.sql.Types class. Among other constants,
    it has INTEGER and VARCHAR for int and String values respectively. STRING is not a valid constant in this class.
    java.sql.JDBCType also defines the same names (i.e. INTEGER and VARCHAR, among others) but it is an enum

* B. 
    ps.setNull(3, JDBCType.INTEGER);
    ps.setNull(4, JDBCType.VARCHAR);
    This is wrong for the same reason as above.

* C. 
    ps.setNull(3, Types.INTEGER);
    ps.setNull(4, Types.STRING);
    It should be ps.setNull(4, Types.VARCHAR); instead of ps.setNull(4, Types.STRING);

* D 
    Integer ltp = null;
    ps.setInt(3, ltp);
    ps.setString(4, ltp);
    The second parameter of the setInt method is int. If you pass an Integer reference,
   it will be unboxed into an int. In this case, ltp in null and so, the unboxing operation will cause a NullPointerException to be thrown.
    
    The line ps.setString(4, null); is fine.

*  E.
ps.setNull(3, Types.INTEGER);
ps.setString(4, null);
(Correct E)

PreparedStatement defines the following setNull methods:

void setNull(int parameterIndex, int sqlType) throws SQLException
Sets the designated parameter to SQL NULL.
Note: You must specify the parameter's SQL type.

Parameters:
parameterIndex - the first parameter is 1, the second is 2, ...
sqlType - the SQL type code defined in java.sql.Types

PreparedStatement has a three parameter setNull as well but it is not important for the exam.
void setNull(int parameterIndex, int sqlType, String typeName) throws SQLException
Sets the designated parameter to SQL NULL. This version of the method setNull
should be used for user-defined types and REF type parameters.
Examples of user-defined types include: STRUCT, DISTINCT, JAVA_OBJECT, and named array types.

    
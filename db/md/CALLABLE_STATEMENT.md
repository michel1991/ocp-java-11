### Identify the correct statements:
* A. A CallableStatement is used to call a stored procedure in the database while a PreparedStatement is used to call a stored function.
    There is no difference in a stored procedure and function in terms of how it is called from JDBC code.
    A Callable is used for both. PreparedStatement is not used for either of these. It is used to call a regular
    SQL query repeatedly with different parameter values.
* B. A CallableStatement is easier to build and call from JDBC code than a PreparedStatement.
    This is true because you don't have to write any SQL query in Java code.
    You just use the name of the stored procedure. The queries are already there inside
    the stored procedure, which exists in the Database and not in JDBC code.
* C. A CallableStatement is preferred over PreparedStatement because it supports long running transactions.
    Even a PreparedStatement or a Statement can participate in a transaction (long or short).
    So this is not a reason to prefer Callable over PreparedStatement.
* D. A CallableStatement is preferred over Statement because it supports long running transactions.

``` 
/*
    A PreparedStatement is used for SQL statements that are executed
    multiple times with different values. For example, if you want
    to insert several values into a table, one after another, it is a lot easier with PreparedStatement:
*/


    //a PreparedStatement is created only once here
    ps = c.prepareStatement("INSERT INTO STUDENT VALUES (?, ?)"); 
    //Once created, the PreparedStatement is compiled automatically. 
    
    ps.setInt(1, 111);
    ps.setString(2, "Bob");
    ps.executeUpdate();
    
    //Now change the parameter values and execute again.
    ps.setInt(1, 112);
    ps.setString(2, "Cathy");
    ps.executeUpdate();
    
    A CallableStatement is meant for executing a stored procedure, which has already been created in the database. For example:
    
    
    //computeMatrixForSales is a stored procedure that has already been 
    //created in the database.
    callableStatement = connection.prepareCall("{call computeMatrixForSales(?)}); 
    callableStatement.setInt(1, 1000);
    callableStatement.executeUpdate();
```
Correct(B)

### Which of the following interfaces can be used
### to execute a stored procedure on the database?

* A. CallableStatement
    java.sql.CallableStatement extends PreparedStatement
    and it is used to execute SQL stored procedures.
    It allows stored procedures to be called in a standard way for all RDBMSs.

    Remember that in addition to having setXXX  (i.e. setString, setDate, setInt etc.)
    and setObject methods with parameter index as the first parameter,
    (CallableStatement inherits these from PreparedStatement),
    the CallableStatement interface also has setXXX
    and setObject methods with parameter name as the first argument. For example:


    callableStatement.setString("NAME", "john",  java.sql.Types.VARCHAR); //valid

    //valid, inherited from PreparedStatement
    callableStatement.setString(1, "john",  java.sql.JDBCType.VARCHAR);

    //INVALID, will not compile
    preparedStatement.setString("NAME", "john",  java.sql.Types.VARCHAR);

    preparedStatement.setString(1, "john",  java.sql.Types.VARCHAR); //valid

    Note that the third argument can be an int (the ones defined in java.sql.Types)
    or a java.sql.JDBCType enum value (such as JDBCType.VARCHAR)
    because setObject is overloaded to accept either one.
* B. PreparedStatement
* C. ProceduralStatement
    There is no such interface.
* D. StoredStatement
    There is no such interface

Besides regular SQL queries, the JDBC API can be used to invoke stored procedures as well. For example, let us say you have the following stored procedure:

CREATE PROCEDURE my_storedprocname(NAME IN VARCHAR, DEPID IN INT, AMOUNT OUT INT) as
BEGIN
...valid sql code here
END


It can be used as follows:

    1. Create a CallableStatement
        CallableStatement stmt = conn.prepareCall("{CALL my_storedprocname(?, ?, ?)}");

        (OR if the procedure returns a value (in which case, it is called "stored function"):

        CallableStatement stmt = conn.prepareCall("{? = CALL my_storedprocname(?, ?, ?)}");

    2. Set parameter values
        CallableStatement inherits from PreparedStatement, therefore,
        you can use various setXXX methods to set the input values

        stmt.setString(1,"johndoe");
        stmt.setObject(2, 20, java.sql.Types.INTEGER);//using the setObject method with the "type" argument

        Note that indexing of parameters starts with 1.
        So, the index of the first question mark in the query is always 1.
        Thus, if your query starts with a ?=, the index of the first
        input parameter would be at 2 because the first question mark
        is for the return value, which is nothing but an OUT parameter.

        Note that the third argument to PreparedStatement's setObject can
        be an int value (the ones defined in java.sql.Types class) or a java.sql.JDBCType
        enum value (such as JDBCType.VARCHAR) because setObject is overloaded to accept either one.

        In addition to the above, a CallableStatement
        also allows you to set a parameter by name aka "parameter marker" like this:

        stmt.setInt("NAME","johndoe");
        //stmt.setInt("name","johnd");//parameter marker is case insensitive
        stmt.setObject("DEPTID", 20, java.sql.Types.INTEGER);

        NOTE 1: Setting parameter values by name is not possible with PreparedStatement.
        NOTE 2: The order of setting the parameters is not important.
           You can set them in any order before executing the query.
           As long as your parameter index (or the parameter name) is correct,
           the value will be set for the correct input parameter.
        NOTE 3: Although the JDBC specification explicitly mentions that the columns
            names of a ResultSet are case insensitive, it does not specify anything about parameters markers.
            For the purpose of the exam, assume that they are case insensitive as well. In the exam,
            you may see questions where the case of the parameter markers in the stored procedure
            is different from case of the parameter markers used in the Java code. Ignore this difference.
        NOTE 4: You cannot mix the index and parameter markers in the same query.
            That is, you can either set parameters using the index or using the parameter markers but not both.

    3. Register OUT (and INOUT) parameters
        To use the out parameter (assuming that the third parameter is an OUT parameter in this stored procedure),
        you must first "register" it like this:

        stmt.registerOutParameter(3, java.sql.Types.INTEGER);
        OR
        stmt.registerOutParameter("AMOUNT", java.sql.Types.INTEGER);

    4. Retrieve the result
        The procedure can be executed and the result can be retrieved as follows:
        boolean hasResults = stmt.execute(); //check if the stored proc has returned one or more ResultSets
        while (hasResults) {
            ResultSet rs = stmt.getResultSet();
            // process result set
            hasResults = stmt.getMoreResults();
        }
        int outvalue = stmt.getInt(3);//retrieve out value

        If a stored procedure returns a result as well (besides returning zero or more ResultSets),
        you can retrieve the result by registering an OUT parameter for the return value.
        For example, let us say my_storedproc2 expects one input parameter,
        one output parameter, and returns a value. You can invoke it like this:

        CallableStatement stmt = conn.prepareCall("{?= CALL my_storedproc2(?, ?)}");//observe ?= at the beginning
        stmt.registerOutParameter(1, JDBCType.VARCHAR); //registering an out parameter for the return value, indexing starts with 1
        stmt.setInt(2, 100); //setting the input parameter at index 2
        stmt.registerOutParameter(3, JDBCType.INTEGER); //registering the out parameter at index 3
        stmt.execute();
        String resultvalue = stmt.getString(1);//getting the return value
        String outvalue = stmt.getString(3);//getting the out parameter
(Correct A)
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


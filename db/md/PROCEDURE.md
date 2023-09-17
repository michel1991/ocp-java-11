### Which interface is used to run stored procedures?
* A. Callable
* B. CallableStatement
* C. PreparedStatement
* D. ProceduralStatement
* E. Statement
* F. StoredStatement

Option A is incorrect because Callable is used for concurrency rather than JDBC code.
Option B is the correct answer as CallableStatement is used to run a stored procedure.
Option C is incorrect because PreparedStatement is used for SQL specified in your application.
Option E is incorrect because Statement is the generic interface
and does not have functionality specific to stored procedures.
Options D and F are incorrect because they are not interfaces in the JDK.
For more information, see Chapter 10.

##### Suppose we have a JDBC program that calls a stored procedure,
##### which returns a set of results.
##### Which is the correct order in which to close database resources for this call?
* A. Connection, ResultSet, CallableStatement
* B. Connection, CallableStatement, ResultSet
* C. ResultSet, Connection, CallableStatement
* D. ResultSet, CallableStatement, Connection
* E. CallableStatement, Connection, ResultSet
* F. CallableStatement, ResultSet, Connection

JDBC resources should be closed in the reverse order from that in which they were opened.
The order for opening is Connection, CallableStatement, and ResultSet.
The order for closing is ResultSet, CallableStatement, and Connection.
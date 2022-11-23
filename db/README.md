# Which interface is used to run stored procedures?
A. Callable
B. CallableStatement
C. PreparedStatement
D. ProceduralStatement
E. Statement
F. StoredStatement

Option A is incorrect because Callable is used for concurrency rather than JDBC code.
Option B is the correct answer as CallableStatement is used to run a stored procedure.
Option C is incorrect because PreparedStatement is used for SQL specified in your application.
Option E is incorrect because Statement is the generic interface and does not have functionality specific to stored procedures.
Options D and F are incorrect because they are not interfaces in the JDK. For more information, see Chapter 10.
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

# Which operations in the CRUD acronym are not allowed in an executeUpdate() call? (Choose all that apply.)
A. Delete
B. Deletion
C. Disable
D. Read
E. Reading.
F. Select.
G. None of the above. All operations are allowed.

CRUD stands for Create Read Update Delete, making options B, C, E, and F incorrect.
The executeUpdate() method is not allowed to make read operations.
Option F is tricky, but incorrect, because it is a SQL keyword and not part of the CRUD acronym.
Option D is the correct answer since it is a read operation. For more information, see Chapter 10.
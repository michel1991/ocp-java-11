### Which is responsible for getting a connection to the database?
*  A. Driver
*  B. Connection
*  C. PreparedStatement
*  D. Statement
*  E. ResultSet

The Driver interface is responsible for getting
a connection to the database, making option A the answer.
The Connection interface is responsible for communication
with the database but not making the initial connection.
The Statement interface knows how to run the SQL query,
and the ResultSet interface knows what was returned by a SELECT query.

### How do you obtain a connection through JDBC?
* A. new Connection(url)
* B. new ConnectionImpl(url)
* C. Driver.getConnection(url)
* D. new Driver().getConnection(url)
* E. DriverManager.getConnection(url)
* F. new DriverManager().getConnection(url)

On the exam, a Connection is always obtained from a DriverManager
using a static method. Therefore, option E is correct.
### Which is responsible for getting a connection to the database?
* A. Driver
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
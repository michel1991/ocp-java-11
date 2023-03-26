### Which statement is true about the JDBC core classes?
*  A. Driver is an implementation of DriverManager.
*  B. A general Connection implementation is included in the JDK.
*  C. A PreparedStatement uses bind variables.
*  D. None of the above.

Option A is incorrect because Driver is an interface, while DriverManager is a concrete class.
The inverse isn’t true either; DriverManager doesn’t implement Driver.
Option B is incorrect because the Connection implementation comes from a specific database driver JAR.
Option C is correct as bind variables (?) are used.

##### How many of Connection, Driver, DriverManager, PreparedStatement,
##### and ResultSet are JDBC interfaces included with the JDK?
* A. None
* B. One
* C. Two
* D. Three
* E. Four
* F. Five

Connection is a JDK interface for communicating with the database. PreparedStatement
and ResultSet are typically used to write queries and are also in the JDK. Driver
is tricky because you don’t write code that references it directly.
However, you are still required to know it is a JDBC interface.
DriverManager is used in JDBC code to get a Connection.
However, it is a concrete class rather than an interface.
Since only four out of the five are JDBC interfaces, option E is correct.
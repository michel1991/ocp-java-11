### Which statement is true about the JDBC core classes?
*  A. Driver is an implementation of DriverManager.
*  B. A general Connection implementation is included in the JDK.
*  C. A PreparedStatement uses bind variables.
*  D. None of the above.

Option A is incorrect because Driver is an interface,
while DriverManager is a concrete class.
The inverse isn’t true either; DriverManager doesn’t implement Driver.
Option B is incorrect because the Connection implementation
comes from a specific database driver JAR.
Option C is correct as bind variables (?) are used.

##### How many of Connection, Driver, DriverManager, PreparedStatement,
##### and ResultSet are JDBC interfaces included with the JDK?
* A. None
* B. One
* C. Two
* D. Three
* E. Four
* F. Five

Connection is a JDK interface for communicating with the database.
PreparedStatement and ResultSet are typically used to write queries
and are also in the JDK. Driver is tricky because you don’t write code
that references it directly. However, you are still required to know
it is a JDBC interface. DriverManager is used in JDBC code to get a Connection.
However, it is a concrete class rather than an interface.
Since only four out of the five are JDBC interfaces, option E is correct.

#### Which of the following are JDBC interfaces in the java.sql package?
* A. Driver, Query
* B. Driver, ResultSet
* C. DriverManager, Query
* D. DriverManager, ResultSet
* E. Driver, DriverManager, Query
* F. Driver, DriverManager, ResultSet

Driver, Connection, PreparedStatement, and ResultSet
are the four key interfaces you need to know for JDBC.
DriverManager is a class rather than an interface. Query is not used in JDBC.
Since only Driver and ResultSet are interfaces in the list, option B is the answer.

#### Given that a code fragment has just created a JDBC Connection and has executed
#### an update statement, which of the following statements is correct?
* A. Changes to the database are pending a commit call on the connection.
* B. Changes to the database will be rolled back if another update is executed without commiting the previous update.
* C. Changes to the database will be committed right after the update statement has completed execution.
    A Connection is always in auto-commit mode when it is created.
    As per the problem statement, an update was fired without explicitly disabling the auto-commit mode,
    the changes will be committed right after the update statement has finished execution.

* D. Changes to the database will be committed when another query (update or select) is fired using the connection

When a connection is created, it is in auto-commit mode. i.e. auto-commit is enabled.
This means that each individual SQL statement is treated as a transaction and is automatically
committed right after it is completed. (A statement is completed when all of its result sets
and update counts have been retrieved. In almost all cases, however, a statement is completed,
and therefore committed, right after it is executed.)
The way to allow two or more statements to be grouped into a transaction is to disable the auto-commit mode.
Since it is enabled by default, you have to explicitly disable
it after creating a connection by calling con.setAutoCommit(false);
(correct C)

#### Identify the correct statement regarding a JDBC Connection:

* A. When a JDBC Connection is created, it is in auto-commit mode.
* B. When a JDBC Connection is created, its commit mode depends on the parameters used while creating the connection.
* C. When a JDBC Connection is created, its auto-commit feature is disabled.
* D. When a JDBC Connection is created, its commit mode is undetermined.

When a connection is created, it is in auto-commit mode. i.e. auto-commit is enabled.
This means that each individual SQL statement is treated as a transaction and is automatically
committed right after it is completed. (A statement is completed when all
of its result sets and update counts have been retrieved. In almost all cases, however,
a statement is completed, and therefore committed, right after it is executed.)
The way to allow two or more statements to be grouped into a transaction is to disable the auto-commit mode.
Since it is enabled by default, you have to explicitly disable
it after creating a connection by calling con.setAutoCommit(false);

correct(A)

### Identify the correct statements regarding JDBC.

* A. The JDBC Driver must be loaded explicitly in the code before attempting to create a connection to the database.
* B. Starting JDBC 4.0, the JDBC Driver class is not required any more.
* C. Starting JDBC 4.0, the JDBC Driver class is not required to be loaded explicitly in the code any more.
    To load a JDBC driver in JDBC 1.3, the application code would have to load the
    Driver class explicitly using Class.forName method, for example - Class.forName("com.xyz.jdbc.Driver").
    However, with JDBC 4.0, applications no longer need to do this.
* D. JDBC 4.0 allows loading multiple JDBC Drivers while previous versions did not.
There has never been any restriction on how many JDBC Drivers are allowed to be loaded by an application.
If your application connects to say 3 different databases, you can load three different Drivers.
Of course, starting JDBC 4.0, you don't need to load the Driver classes explicitly in the code, while earlier,
you had to explicitly load them using Class.forName.

Applications no longer need to explicitly load JDBC drivers using Class.forName().

The DriverManager methods getConnection and getDrivers have been enhanced to support
the Java Standard Edition Service Provider mechanism. JDBC 4.0 Drivers must include
the file META-INF/services/java.sql.Driver. This file contains the name
of the JDBC drivers implementation of java.sql.Driver. For example, to load the my.sql.Driver class,
the META-INF/services/java.sql.Driver file would contain the entry:

my.sql.Driver

When the method getConnection is called, the DriverManager will attempt
to locate a suitable driver from amongst those loaded at initialization
and those loaded explicitly using the same classloader as the current applet or application.
(Correct C)



### Which are required parts of a JDBC URL? (Choose all that apply.)
* A. Connection parameters
* B. IP address of database
* C. jdbc
* D. Password
* E. Port
* F. Vendor-specific string

A JDBC URL has three parts.
The first part is the string jdbc, making option C correct.
The second part is the subprotocol.
This is the vendor/product name, which isn’t an answer choice.
The subname is vendor-specific, making option F correct as well.


### Which of the following is a valid JDBC URL?
* A. jdbc:oracle:123.123.123.123
* B. jdbc:oracle:thin:123.123.123.123
* C. jdbc:oracle:thin:123.123.123.123//fun
* D. oracle:jdbc:123.123.123.123
* E. oracle:jdbc:thin:123.123.123.123
* F. oracle:jdbc:thin:123.123.123.123//fun

A JDBC URL must begin with JDBC, making options D, E, and F incorrect.
The database name is required, making options A and B incorrect.
Therefore, the answer is option C.

### Which of the following is a valid JDBC URL?
* A. jdbc:sybase:localhost:1234/db
* B. jdbc::sybase::localhost::/db
* C. jdbc::sybase:localhost::1234/db
* D. sybase:localhost:1234/db
* E. sybase::localhost::/db
* F. sybase::localhost::1234/db

A JDBC URL has three main parts separated by single colons,
making options B, C, E, and F incorrect.
The first part is always jdbc, making option D incorrect.
Therefore, the correct answer is option A.
Notice that you can get this right even if you’ve never
heard of the Sybase database before.

### Which of the following is a valid JDBC URL?
* A. jdbc-mysql-1234/db
* B. jdbc-mysql-localhost:1234/db
* C. jdbc-mysql-localhost-1234-db
* D. jdbc:mysql:
* E. jdbc:mysql:localhost:1234/db

A JDBC URL has three main parts separated by colons (:),
making options A, B, and C incorrect.
Option D is tempting since there are two colons.
However, there needs to be content after the colon as well.

##### Which of the following could be valid JDBC URL formats
#### for an imaginary driver named magic and a database named box?

``` java
    String first = "jdbc:magic:127.0.0.1:1234/box";
    String second = "jdbc:magic:box";
    String third = "jdbc@magic:@127.0.0.1:1234";
```

* A. Only first
* B. Only second
* C. Only third
* D. Both first and second
* E. Both first and third
* F. All of these

A JDBC URL has three components separated by colons.
All three of these URLs meet those criteria.
For the data after the component, the database driver specifies the format.
Depending on the driver, this might include an IP address and port.
Regardless, it needs to include the database name or alias.
The first and secondURLs could both be valid
formats because they mention the database box.
However, thirdis incorrect because it has jdbc@ instead of jdbc:.
Therefore, option D correct.

#### How many of the following could be valid JDBC URL formats
#### for an imaginary driver named magic and a database named box?

```java
    String first = "jdbc;box;magic";
    String second = "jdbc;magic;@127.0.0.1:1234";
    String third = "jdbc;magic;127.0.0.1:1234/box";
```

* A. Only first
* B. Only second
* C. Only third
* D. first and second
* E. first and third
* F. None of these

A JDBC URL has three components separated by colons.
None of these options uses the correct colon delimiter,
making option F the correct answer.

#### You are using a RDBMS database from a company named Fandu Tech. It provides a JDBC 4.0 compliant driver implementation
### in class com.fandu.sql.Driver.
### Which of the following lines of code is/are required to get the driver loaded?

* A. Connection c = DriverManager.getConnection("jdbc:fandu://localhost:1234/myDB",
    "user", "pwd");
(Assume that the parameters are valid.)
This code is used to get a connection from the driver. It doesn't load the driver class itself.

* B. Class.forName("com.fandu.sql.Driver");
This is required for JDBC 1.3 and older versions. Not for JDBC 4.0.

* C. com.fandu.sql.Driver d = com.fandu.sql.Driver.class.newInstance()
* D. DriverManager.loadDriver("com.fandu.sql.Driver");
* E. None of the above.
In JDBC 4.0, the drivers are loaded automatically based on the information provided by the driver's META-INF/services/java.sql.Driver file.
Therefore, no java code in necessary to load the driver classes.

Prior to JDBC 4.0, the application code would have to load the Driver class explicitly using Class.forName method,
for example - Class.forName("com.xyz.jdbc.Driver"). However, with JDBC 4.0, applications no longer need to do this.

The DriverManager methods getConnection and getDrivers have been enhanced to support the Java Standard Edition Service Provider mechanism.
JDBC 4.0 Drivers must include the file META-INF/services/java.sql.Driver.
This file contains the name of the JDBC drivers implementation of java.sql.Driver.
For example, to load the my.sql.Driver class, the META-INF/services/java.sql.Driver file would contain the entry:

my.sql.Driver

When the method getConnection is called, the DriverManager will attempt to locate a suitable driver
from amongst those loaded at initialization and those loaded explicitly using the same classloader as the current applet or application.

Correct(E)

#### Which of the following are valid JDBC URLs?
* A. jdbc.derby.localhost/sample
* B. jdbc://mysql.com/sample
* C. http://jdbc.mysql/sample
* D. jdbc:oracle:thin:@localhost:1521:mydb
* E. jdbc:mysql://192.168.1.10:3306/sample
* F. jdbc:xderby:1106:sample
    Although this url is legally correct, a derby database connection url follows this pattern:
    jdbc:derby:[subsubprotocol:][databaseName][;attribute=value]*

------------------------------------------------------------------------------------------------------------------
The format of a JDBC URL is : jdbc:<subprotocol>:<subname>
where subprotocol defines the kind of database connectivity mechanism that may be supported by one or more drivers.
The contents and syntax of the subname will depend on the subprotocol.

Here are a few examples of commonly used urls for connecting to derby db (the Java database that comes bundled with various
IDEs such as Netbeans) and Mysql:

jdbc:derby:sample
jdbc:derby://localhost:1527/sample
jdbc:mysql://localhost:1527/sample
jdbc:mysql://192.168.0.100:3306/testdb

Observe that a JDBC url always starts with jdbc: and has at least three components separated by a two colons.

It also usually includes the hostname or address and the port number on which the database is listening for the requests but that is not necessary.

Most drivers allow adding more options to the URL in the subname part,
for example the following JDBC url for Oracle DB specifies the type of the jdbc driver :
jdbc:oracle:thin:@localhost:1521:testdb

Userid and password are usually supplied separately from the URL but some drivers allow them to be specified in the URL itself. For example:
jdbc:oracle:thin:scott/mypassword@//myhost:1521/orcl

Correct(D,E, F). (recherche google: oracle thin)

### Which of the following are valid JDBC URLs?


* A. jdbc:derby://localhost:1527/sample
* B. //jdbc://derby://localhost:1527/sample
* C. http://jdbc:mysql:localhost/sample
* D. https://mysql.com:3306/sample

    The format of a JDBC URL is : jdbc:<subprotocol>:<subname>
    where subprotocol defines the kind of database connectivity mechanism that may be supported by one or more drivers.
    The contents and syntax of the subname will depend on the subprotocol.

    Here are a few examples of commonly used urls for connecting to derby db
    (the Java database that comes bundled with various IDEs such as Netbeans) and Mysql:

    jdbc:derby:sample
    jdbc:derby://localhost:1527/sample
    jdbc:mysql://localhost:1527/sample
    jdbc:mysql://192.168.0.100:3306/testdb

    Observe that a JDBC url always starts with jdbc: and has at least three components separated by a two colons.

    It also usually includes the hostname or address and the port number on which the database is listening for the requests but that is not necessary.

    Most drivers allow adding more options to the URL in the subname part, for example the following
    JDBC url for Oracle DB specifies the type of the jdbc driver :
    jdbc:oracle:thin:@localhost:1521:testdb

    Userid and password are usually supplied separately from the URL but some drivers allow them to be specified in the URL itself. For example:
    jdbc:oracle:thin:scott/mypassword@//myhost:1521/orcl

Correct(A)

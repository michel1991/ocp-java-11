### Which of the following is a valid JDBC URL?
* A. jdbc:oracle:123.123.123.123
* B. jdbc:oracle:thin:123.123.123.123
* C. jdbc:oracle:thin:123.123.123.123//fun
* D. oracle:jdbc:123.123.123.123
* E. oracle:jdbc:thin:123.123.123.123
* F. oracle:jdbc:thin:123.123.123.123//fun

A JDBC URL must begin with JDBC, making options D, E, and F incorrect.
The database name is required, making options A and B incorrect. Therefore, the answer is option C.

### Which of the following is a valid JDBC URL?
* A. jdbc:sybase:localhost:1234/db
* B. jdbc::sybase::localhost::/db
* C. jdbc::sybase:localhost::1234/db
* D. sybase:localhost:1234/db
* E. sybase::localhost::/db
* F. sybase::localhost::1234/db

A JDBC URL has three main parts separated by single colons, making options B, C, E, and F incorrect.
The first part is always jdbc, making option D incorrect. Therefore, the correct answer is option A.
Notice that you can get this right even if you’ve never heard of the Sybase database before.

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
The first and secondURLs could both be valid formats because they mention the database box.
However, thirdis incorrect because it has jdbc@ instead of jdbc:. Therefore, option D correct.
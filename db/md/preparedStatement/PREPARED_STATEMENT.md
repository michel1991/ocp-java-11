### Which is true of a PreparedStatement?
*  A. It has a method to change the bind variable to a different character other than ?.
*  B. It can be usedonly for SELECT statements.
*  C. It can be usedonly for UPDATE statements.
*  D. All of these are true.
*  E. None of these are true.

In JDBC, the bind variable is always a question mark (?),
making option A incorrect.
A PreparedStatatement is not limited to specific types of SQL,
making options B and C incorrect as well.
This makes option E the correct answer.

#### Which are true statements? (Choose two.)
* A. A PreparedStatement is generally faster than a Statement when each is run 100 times.
* B. A PreparedStatement is generally slower than a Statement when each is run 100 times.
* C. A PreparedStatement is generally the same speed as a Statement when each is run 100 times.
* D. PreparedStatement extends Statement
* E. Statement extends PreparedStatement
* F. PreparedStatementand Statement are not in the same inheritance hierarchy.

ThePreparedStatement interface extends the Statement interface,which matches option D.
One of the benefits of a PreparedStatement is performance.
While a PreparedStatement may not be faster if run only once,
it will quickly become so. Therefore, option A is the other correct answer.

### Which is a benefit of PreparedStatement over Statement? (Choose two.)
* A. Language independence
* B. NoSQL support
* C. Readability
* D. Security
* E. Supports stored procedures

JDBC uses Java and SQL, so it is not language independent,
making option A incorrect. It is used with relational databases,ruling out option B.
A CallableStatement supports stored procedures, not a PreparedStatement,
making option E incorrect. Options C and D are correct.
Using bind variables with a PreparedStatement produces
code that is easier to read than one with a lot of String concatenation.
Further, when used properly, a PreparedStatement prevents SQL injection.

#### Identify correct statement(s) regarding the benefit of using PreparedStatement over Statement.
* A. PreparedStatement offers better performance.
If you are going to run a query only once, it may not offer better performance because
it requires multiple trips to the database (one to get it pre compiled, and one to execute with the parameters)
and also requires multiple method calls to set the parameters.
* B. PreparedStatement offers better performance when the same query is to be run multiple times with different parameter values.
* C. PreparedStatement supports multiple transactions.
This option makes no sense.
* D. PreparedStatement allows several additional SQL types such as BLOB and CLOB.
PreparedStatement has specific methods for additional SQL column type such as setBlob(int parameterIndex, Blob x) and setClob(int parameterIndex, Clob x).
Correct(B, D)

### Identify correct statement(s) regarding the benefit of using PreparedStatement over Statement.
* A. PreparedStatement offers protection against SQL injection attacks.
Since parameters values of the query are set using setter methods, it is not possible to manipulate
the resulting query by specifying ill formatted values.

Note: you are not required to learn how SQL injection works for the purpose of the exam. But it is good to know nevertheless. The following link contains a good description: https://dzone.com/articles/owasp-top-10-number-2

* B. PreparedStatement allows transactions to span across multiple databases.
While it is true, it is not an advantage of PreparedStatement because it is actually a feature of the database driver.

* C. PreparedStatement allows easier customization of joins at run time.
This is not correct because a PreparedStatement only allows you to modify the parameters of the query.
Since it is compiled as soon as it is built, you cannot change the structure of the query after it is built.

* D. PreparedStatement allows BLOB and CLOB on all databases.
The support for these datatypes depends on whether the underlying database support them or not.

(Correct A)


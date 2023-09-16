### Which is true of a PreparedStatement?
*  A. It has a method to change the bind variable to a different character other than ?.
*  B. It can be usedonly for SELECT statements.
*  C. It can be usedonly for UPDATE statements.
*  D. All of these are true.
*  E. None of these are true.

In JDBC, the bind variable is always a question mark (?), making option A incorrect.
A PreparedStatatement is not limited to specific types of SQL, making options B and C incorrect as well.
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

JDBC uses Java and SQL, so it is not language independent, making option A incorrect.
It is used with relational databases, ruling out option B.
A CallableStatement supports stored procedures, not a PreparedStatement,
making option E incorrect.
Options C and D are correct.
Using bind variables with a PreparedStatement produces
code that is easier to read than one with a lot of String concatenation.
Further, when used properly, a PreparedStatement prevents SQL injection.

#### Which is true of a PreparedStatement?
* A. It has a method to change the bind variable to a different character other than ?.
* B. It can be usedonly for SELECT statements.
* C. It can be usedonly for UPDATE statements.
* D. All of these are true.
* E. None of these are true.

In JDBC, the bind variable is always a question mark (?), making option A incorrect.
A PreparedStatatement is not limited to specific types of SQL,
making options B and C incorrect as well. This makes option E the correct answer.
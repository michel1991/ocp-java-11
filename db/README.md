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


# Which attack could exploit this code?

 ```java
public boolean isValid(String hashedPassword)
throws SQLException {
    var sql = "SELECT * FROM users WHERE password = ?";
    try (var stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, hashedPassword);
        try (var rs = stmt.executeQuery(sql)) {
            return rs.next();
            }
      }
}
 ```
This is a trick question—there is no attack. Option E is incorrect because SQL leak is not the name of an attack.
Option C is incorrect because the PreparedStatement and ResultSet are closed in a try-with-resources block.
While we do not see the Connection closed, we also don’t see it opened.
The exam allows us to assume code that we can’t see is correct.
Option D is an incorrect answer because bind variables are being used properly with a PreparedStatement.
Options A and B are incorrect because they are not related to the example.
Since none of these attacks applies here, option F is correct.

# Which are required parts of a JDBC URL? (Choose all that apply.)
A. Connection parameters
B. IP address of database
C. jdbc
D. Password
E. Port
F. Vendor-specific string

A JDBC URL has three parts.
The first part is the string jdbc, making option C correct.
The second part is the subprotocol. This is the vendor/product name, which isn’t an answer choice.
The subname is vendor-specific, making option F correct as well.
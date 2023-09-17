### #Which attack could exploit this code?

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
* A. Command injection
* B. Confidential data exposure
* C. Denial of service
* D. SQL injection
* E. SQL leak
* F. None of the above

This is a trick question—there is no attack.
Option E is incorrect because SQL leak is not the name of an attack.
Option C is incorrect because the PreparedStatement and ResultSet
are closed in a try-with-resources block.
While we do not see the Connection closed, we also don’t see it opened.
The exam allows us to assume code that we can’t see is correct.
Option D is an incorrect answer because bind variables
are being used properly with a PreparedStatement.
Options A and B are incorrect because they are not related to the example.
Since none of these attacks applies here, option F is correct.

#### Which operations in the CRUD acronym are not
#### allowed in an executeUpdate() call? (Choose all that apply.)
* A. Delete
* B. Deletion
* C. Disable
* D. Read
* E. Reading.
* F. Select.
* G. None of the above. All operations are allowed.

CRUD stands for Create Read Update Delete, making options B, C, E, and F incorrect.
The executeUpdate() method is not allowed to make read operations.
Option F is tricky, but incorrect, because it is a SQL keyword and not part of the CRUD acronym.
Option D is the correct answer since it is a read operation. For more information, see Chapter 10.


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
Option C is incorrect because the PreparedStatement and ResultSet are closed in a try-with-resources block.
While we do not see the Connection closed, we also don’t see it opened.
The exam allows us to assume code that we can’t see is correct.
Option D is an incorrect answer because bind variables are being used properly with a PreparedStatement.
Options A and B are incorrect because they are not related to the example.
Since none of these attacks applies here, option F is correct.


#### Which types of resources do you need to close
#### to help avoid a denial of service? (Choose all that apply.)
* A. Annotations
* B. Exceptions
* C. I/O
* D. JDBC
* E. String

Any resource accessing things outside your program should be closed.
Options C and D are correct because I/O and JDBC meet this criteria.

# Which interfaces or classes are in a database-specific JAR file? (Choose all that apply.)
* A. Driver
* B. Driver’s implementation
* C. DriverManager
* D. DriverManager’s implementation
* E. PreparedStatement
* F. PreparedStatement’s implementation

The Driver and PreparedStatement interfaces are part of the JDK,
making options A and E incorrect.
The concrete DriverManager class is also part of the JDK, making options C and D incorrect.
Options B and F are correct since the implementation of these interfaces
is part of the database-specific driver JAR file.





##### Which of the following can fill in the blank correctly
##### assuming the first column is name? (Choose all that apply.)
```java
    var rs = ps.executeQuery();
    if (rs.next()) {
        _______________________________
        }
```

*  A. rs.getString(0);
*  B. rs.getString(1);
*  C. rs.getString("name");
*  D. None of the above. The code does not compile.

In a ResultSet, columns are indexed starting with 1, not 0.
Getting the column-by-column number or name is allowed.

### Which of the following are words in the CRUD acronym? (Choose all that apply.)
* A. Create
* B. Delete
* C. Disable
* D. Relate
* E. Read
* F. Upgrade

CRUD stands for Create, Read, Update, Delete, making options A, B, and E correct.

### How many lines in this code fail to compile?
```java
   try (var sql = "{call learn (?)}"; // 17:
   var cs = conn.prepareCall(sql); //  18:
   cs.setInt(1, 8); //  19:
   var rs = cs.execute()) { //  20:
    // 21:
    while (rs.hasNext()) { //  22:
        System.out.println( rs.getString(3)); //  23:
    } //  24:
} //   25:

```
* A. Zero
* B. One
* C. Two
* D. Three
* E. Four

Lines 17 and 19 do not compile because they are not allowed in a try-with-resources declaration.
Only declarations that implement AutoCloseable or Closeable are permitted.
Line 20 does not compile because execute() returns a boolean rather than a ResultSet.
Finally, line 22 does not compile because the ResultSet method should be next(), not hasNext().
Since there are four errors, option E is correct


##### Given the table booksin the figure and a ResultSet
##### created by running this SQL statement, which option prints Advanced Java?
##### SELECT title FROMbooksWHERE num_pages > 500
[image](./images/book_tables.jpg)
* A. System.out.println(rs.getString());
* B. System.out.println(rs.getString("0"));
* C. System.out.println(rs.getString("1"));
* D. System.out.println(rs.getString("title"));

Option A does not compile because you have to pass a column index or column name to the method.
Options B and C compile. However, there are not columns named 0 or 1.
Since these column names don’t exist, the code would throw a SQLException at runtime.
Option D is correct as it uses the proper column name.


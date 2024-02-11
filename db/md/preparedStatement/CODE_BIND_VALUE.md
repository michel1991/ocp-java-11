#### Given the table books in the figure and the following code,
#### which lines would you add to successfully insert a row? (Choose two.)
[image](./images/book_tables.jpg)

```java
var url = "jdbc:derby:books;create=true";
var sql = "INSERT INTO books (title,num_pages) VALUES(?,?)";
try (var conn = DriverManager.getConnection(url);
var stmt = conn.prepareStatement(sql)) {

    // INSERT CODE HERE

    stmt.executeUpdate();
}
```

* A. stmt.setObject(0, "Intermediate Java");
* B. stmt.setObject(1, "Intermediate Java");
* C. stmt.setObject(1, 500);
* D. stmt.setObject(2, 500);

Since JDBC does not begin indexes with zero, option A is incorrect,
and option B is correct. Similarly, the second parameter is at index 2,
so option C is incorrect, and option D is the other answer.
Note that setObject() can be called instead of a more specific type.
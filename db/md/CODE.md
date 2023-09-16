### Suppose that you have a table named animal with two rows. What is the result of the following code?
```java
var conn = new Connection(url, userName, password); // 6:
var ps = conn.prepareStatement(  //  7:
"SELECT count(*) FROM animal"); //  8:
var rs = ps.executeQuery(); //  9:
if (rs.next()) System.out.println(rs.getInt(1)); // 10:
```

* A. 0
* B. 2
* C. There is a compiler error on line 6.
* D. There is a compiler error on line 10.
* E. There is a compiler error on another line.
* F. A runtime exception is thrown.

A Connection is created using a static method on DriverManager.
It does not use a constructor. Therefore, option C is correct.
If the Connection was created properly, the answer would be option B.


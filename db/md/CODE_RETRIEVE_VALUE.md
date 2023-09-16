# Which of the following can fill in the blank correctly? (Choose all that apply.)
```java
var rs = ps.executeQuery();
if (rs.next()) {
    _____________________________;
}
```
* A. String s = rs.getString(0)
* B. String s = rs.getString(1)
* C. String s = rs.getObject(0)
* D. String s = rs.getObject(1)
* E. Object s = rs.getObject(0)
* F. Object s = rs.getObject(1)

In a ResultSet, columns are indexed starting with 1, not 0.
Therefore, options A, C, and E are incorrect.
There are methods to get the column as a String or Object.
However, option D is incorrect because
an Object cannot be assigned to a String without a cast.
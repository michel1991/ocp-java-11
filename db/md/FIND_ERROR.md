### Which is the first line containing a compiler error?
```java
String url = "jdbc:derby:zoo"; //   25:
try (var conn = DriverManager.getConnection(url); //  26:
var ps = conn.prepareStatement(); //  27:
var rs = ps.executeQuery("SELECT * FROM swings")) { // 28:
    while (rs.next()) { //  29:
        System.out.println(rs.getInteger(1)); //   30:
    } //   31:
} //   32:
```
* A. Line 26
* B. Line 27
* C. Line 28
* D. Line 29
* E. Line 30
* F. None of the above

The prepareStatement() method requires SQL be passed in.
Since this parameter is omitted, line 27 does not compile, and option B is correct.
Line 30 also does not compile as the method should be getInt().
However, the question asked about the first compiler error.
### Which statement is true about the JDBC core classes?
*  A. Driver is an implementation of DriverManager.
*  B. A general Connection implementation is included in the JDK.
*  C. A PreparedStatement uses bind variables.
*  D. None of the above.

Option A is incorrect because Driver is an interface, while DriverManager is a concrete class.
The inverse isn’t true either; DriverManager doesn’t implement Driver.
Option B is incorrect because the Connection implementation comes from a specific database driver JAR.
Option C is correct as bind variables (?) are used.
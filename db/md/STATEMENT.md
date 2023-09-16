#### What is the name of a concrete class that implements Statement and is included in the core JDK?
* A. CallableStatement
* B. PreparedStatement
* C. StatementImpl
* D. Both A and B
* E. None of the above

CallableStatement and PreparedStatement are interfaces
that extend the Statement interface. You don’t need to know that for the exam.
You do need to know that a database driver is required to provide
the concrete implementation class of Statement rather than the JDK.
This makes option E correct.
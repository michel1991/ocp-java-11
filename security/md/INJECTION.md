#### Which of the following can cause an injection attack? (Choose two.)
* A. Access control
* B. Command line input
* C. Constants in the program
* D. Mutable code
* E. Serialization
* F. XML parsing

Option A is incorrect because access control restricts who can do something
rather than preventing an injection attack. Option B is correct because
unsanitized input from the command line can do something undesirable like delete a file.
Option C is incorrect because the programmer typed those constants rather than a hostile party.
Option D is incorrect because changing the values of an object is not an injection attack.
Option E is incorrect because serialization is writing data to disk rather than executing.
Option F is correct because XML parsing can load hostile values into your program.

##### What are the best ways to prevent SQL injection? (Choose two.)
* A. Avoid SQL statements that take query parameters.
* B. Log an error anytime a SQL injection attack is successful.
* C. Avoid concatenating user input into a query string.
* D. Ensure database resources are closed.
* E. Always use a PreparedStatement instead of a Statement.
* F. Do not use a relational database.

The primary way SQL injection occurs is from concatenating SQL queries without properly
escaping the values. Avoiding concatenation and using a PreparedStatement with bind variables
are the commonly accepted ways to prevent this.
For these reasons, options C and E are correct.
Option A is incorrect because a database
that takes no query parameters of any kind would be pretty limited in its capabilities.
For example, it would be challenging to log a user in if you couldn’t search for that user.
Option B is also incorrect, as you can’t prevent a SQL injection after it is already successful.
Option D is incorrect, as a resource leak is more susceptible
to a denial of service attack in which resources are exploited,
rather than SQL injection in which data is manipulated. Finally,
option F is incorrect, as avoiding using a relational database is not a
commonly accepted practice for avoiding SQL injection.
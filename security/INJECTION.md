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
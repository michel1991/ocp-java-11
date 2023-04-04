##### Given an instance of Console c, which of the following
##### two method calls are invalid ways of retrieving input from the user? (Choose two.)
* A. c.read()
* B. c.reader().read()
* C. c.reader().readLine()
* D. c.readLine()
* E. c.readPassword()

The Console class contains readLine() and readPassword() methods,
but not a read() method, making option A one of the correct answers,
and options D and E incorrect. It also contains a reader() method that returns a Reader object.
The Reader class defines a read() method, but not a readLine() method.
For this reason, option C is the other correct answer,
and option B is incorrect. Recall that a BufferedReader is required to call the readLine() method.
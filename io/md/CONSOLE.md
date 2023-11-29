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

### In which of the following cases can the Console object be acquired?

* A. When the JVM is started from an interactive command line with explicitly redirecting the standard input and output streams to Console.
* B. When the JVM is started from an interactive command line without redirecting the standard input and output streams.
* C. When the JVM is started in the background with the standard input and output streams directed to Console.
* D. When the JVM is started in the background without redirecting the standard input and output streams.

Whether a virtual machine has a console is dependent upon the underlying platform
and also upon the manner in which the virtual machine is invoked. If the virtual
machine is started from an interactive command line without redirecting the standard
input and output streams then its console will exist and will typically be connected
to the keyboard and display from which the virtual machine was launched.
If the virtual machine is started automatically, for example by a background job scheduler,
then it will typically not have a console.

If this virtual machine has a console then it is represented by a unique instance
of this class which can be obtained by invoking the System.console() method.
If no console device is available then an invocation of that method will return null.

(Correct is B)

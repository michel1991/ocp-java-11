### Given an application that hosts a website, which of the following would most likely result in a java.lang.Error being thrown? (Choose two.)
*  A. A user tries to sign in too many times.
*  B. Two users try to register an account at the same time.
*  C. An order update page calls itself infinitely.
*  D. The application temporarily loses connection to the network.
*  E. A user enters their password incorrectly.
*  F. The connections to a database are never released and keep accumulating.


A Java application tends to only throw an Error when the application has encountered an unrecoverable error.
Failure of a user to sign in or register are common occurrences, making options A, B, and E incorrect.
On the other hand, calling a method infinitely can lead to an unrecoverable StackOverflowError,
making option C correct. Option D uses the word temporarily,
meaning the network connection could come back up allowing the application to recover.
Option F is the other correct answer.
Over time, failing to release database connections could result in the application running
out of available database connections or worse, out of memory, and being unable to recover.

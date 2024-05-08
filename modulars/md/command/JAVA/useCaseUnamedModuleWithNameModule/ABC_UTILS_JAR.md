#### You are working on an application that is NOT structured as a modular application.
#### However, you need to use a third party library that is packaged as a modular jar named abc.utils.jar in your application.

### Given that you launch your application using a class named Main, which of the following options
### should be used to make sure your application is able to access the classes in the third party jar?
### (Assume that abc.utils.jar and your application classes are in current directory.)

* A. Extract the contents of abc.utils.jar in current directory and launch Main like this:
java Main
Although this will work, it is not the recommended approach.

* B. java -classpath . -module abc.utils.jar Main
* C. java --module-path abc.utils.jar Main

* D. java -classpath .;abc.utils.jar Main
A module jar is no different from a regular jar.
It contains classes in the same structure and so, it can be used as a regular jar in a non-modular application.

Correct(D)

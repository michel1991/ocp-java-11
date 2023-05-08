### Which of the following are valid in a Java file, listed in the order in which they are declared? (Choose two.)
* A. A package-private class declaration and a public interface declaration
* B. Two package statements, an import statement, and a public interface declaration
* C. A package statement, 128 import statements, and two public class declarations
* D. 16 import statements, a package statement, and a public class declaration
* E. 5 import statements and 7 package-private interface declarations
* F. A private interface

A Java file can have at most one top-level type and any number of package-private types.
For this reason, options A and E are correct.
Option B is incorrect because it can have at most one package statement.
Option C is incorrect because it cannot have two public top-level classes.
Option D is incorrect because the package statement must appear before the import statement.
Option F is incorrect because top-level types may not be private or protected.

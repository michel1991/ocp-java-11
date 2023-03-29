### What command is the simplest way to list what modules a JAR depends on without listing package names?
*  A. jdeps cookie.jar
*  B. jdeps –s cookie.jar
*  C. jdeps –jdkinternals cookie.jar
*  D. jdeps --jdkinternals cookie.jar
*  E. jdeps -jdk-unsupported cookie.jar
*  F. jdeps --jdk-unsupported cookie.jar

Without any command line flags, jdeps lists packages and module dependencies.
The -s flag provides a summary omitting the package name,
which means option B is the correct answer.

###### Which command can you run to determine whether you have any code
###### in your JAR file that depends on unsupported internal APIs and suggests an alternative?
* A. jdeps -internal-jdk
* B. jdeps --internaljdk
* C. jdeps --internal-jdk
* D. jdeps -s
* E. jdeps -unsupported
* F. jdeps –unsupportedapi
* G. jdeps –unsupported-api
* H. None of the above

The jdeps command has an option --internal-jdk that lists any
code using unsupported/internal APIs and prints a table with suggested alternatives.
Option D is incorrect because it does not print out the table with a suggested alternative.
Options A, B, C, E, F, and G are incorrect because those options do not exist.
For options A,B, and C, the options are reversed and should be “jdk-internals”.

##### Which command can you run to determine whether you have
##### any code in your JAR file that depends on unsupported internal
##### APIs and does not suggest an alternative?
*  A. jdeps -internal-jdk
*  B. jdeps --internaljdk
*  C. jdeps --internal-jdk
*  D. jdeps -s
*  E. jdeps -unsupported
*  F. jdeps –unsupportedapi
*  G. jdeps –unsupported-api
*  H. None of the above

Option D is correct because it prints jdk.unsupported but does not print a table with a suggested alternative.
Option C is incorrect because it does print a suggested alternative.
Options A, B, E, F, and G are incorrect because those options do not exist.

#### What command is the simplest way to list suggestions for classes in jdk.unsupported?
* A. jdeps cookie.jar
* B. jdeps –s cookie.jar
* C. jdeps –jdkinternals cookie.jar
* D. jdeps --jdkinternals cookie.jar
* E. jdeps -jdkunsupported cookie.jar
* F. jdeps --jdkunsupported cookie.jar
(Faux je pense)

Both options A and B note that the JAR depends on the jdk.unsupported module.
However, they do not list suggested replacements.
Options C and E are invalid because flags of this format need two dashes.
Option D is correct and option F is incorrect because the desired flag is --jdkinternals.
Note that --jdk-internals is also acceptable.

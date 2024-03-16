#### What command is the simplest way to list what modules
#### a JAR depends on without listing package names?
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

Option D is correct because it prints jdk.unsupported
but does not print a table with a suggested alternative.
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

### Which commands can list dependencies? (Choose all that apply.)
* A. jdeps flea.jar
* B. jdeps -d flea.jar
* C. jdeps -detail flea.jar
* D. jdeps --detail flea.jar

Option A is correct because it prints the details of the dependencies.
Options B, C, and D try to fool you with an invalid option.
The jdeps command uses command-line options to restrict the output to the summary level.

### Which are valid calls to list a summary of the dependencies? (Choose all that apply.)
* A. jdeps flea.jar
* B. jdeps -s flea.jar
* C. jdeps -summary flea.jar
* D. jdeps --summary flea.jar
* E. None of the above

Option A will run, but it will print details rather than a summary.
Options B and C are both valid options for the jdeps command.
Remember that -summary uses a single dash (-).

#### What module is always in the jdeps output?
* A. java.base
* B. java.lang
* C. java.self
* D. jdk.base
* E. jdk.lang
* F. jdk.self

Option B is tempting because the java.lang package is available to all classes.
However, the question asks about modules.
Option A is the correct answer because the java.base module
is available to all modules.
The other options are incorrect because those modules do not exist.

#### Which command produces output such as the following?
```ssh
 animal.puppy -˃ animal.dog
```

* A. jdeps –d zoo.animal.puppy.jar
* B. jdeps –s zoo.animal.puppy.jar
* C. jmod –d zoo.animal.puppy.jar
* D. jmod –s zoo.animal.puppy.jar
* E. None of the above

The jdeps command lists information about dependencies within a module.
The –s option provides a summary of output rather than verbose output,
making option B the correct answer.
There is no –d option. The jmod command is for working with JMOD files.

#### What command is the simplest way to list what modules a JAR depends on including package names?
*  A. jdeps cookie.jar
*  B. jdeps –s cookie.jar
*  C. jdeps –jdkinternals cookie.jar
*  D. jdeps --jdkinternals cookie.jar
*  E. jdeps -jdk-unsupported cookie.jar
*  F. jdeps --jdk-unsupported cookie.jar

Without any command line flags, jdeps lists packages and module dependencies,
making option A correct. Option D will also list the packages; however,
it is longer than option A.

#### Which commands can include the following output? (Choose two.)
```txt
 JDK Internal API   Suggested Replacement
 sun.misc.Unsafe    See http://openjdk.java.net/jeps/260
```

* A. jdeps sneaky.jar
* B. jdeps -j sneaky.jar
* C. jdeps -s sneaky.jar
* D. jdeps --internals sneaky.jar
* E. jdeps -jdkinternals sneaky.jar
* F. jdeps --jdk-internals sneaky.jar

Options B and D are incorrect because those flags do not exist on the jdeps command.
Options A and C do exist, but do not include suggested replacements.
Options E and F are correct as they will include a table of suggestions
if any internal APIs are used in the JAR.

### Which of the following statements are correct about --jdk-internals option
### of jdeps tool when run on a jar file or a class file?

* A. It analyzes all classes of the given jar file for class level dependence on Java API.
* B. It analyzes all classes of the given jar file for class level dependence on jdk's deprecated API. If any such dependence is found, it is printed with a suggestion for replacement.
* C. It analyzes all classes of the given jar file for class level dependence on jdk's internal API. If any such dependence is found, it is printed with a suggestion for replacement.
* D. It analyzes all input modules and list all jdk internal modules on which the input modules depend. If any such dependence is found, it is printed with a suggestion for replacement.
* E. It can only be used with -summary or -verbose options.
* F. It performs static analysis.
Jdeps does not execute any classes/modules. It only inspects the code.
Thus, it cannot find out dependencies that are created due classes loaded at run time using reflection API.

(Correct C, F)

-jdkinternals or --jdk-internals
Finds class-level dependencies in the JDK internal APIs. By default, this option analyzes
all classes specified in the --classpath option and input files unless you specified the -include option.
You can’t use this option with the -p, -e, and -s options.

For example, if you have the following class (you need to compile it with JDK 8 or less because sun.misc.BASE64Encoder was removed in Java 9):

```java
   public class TestClass{
   public static void main(String[] args) throws Exception {
     sun.misc.BASE64Encoder encoder = new sun.misc.BASE64Encoder();
     String s = encoder.encode("hello".getBytes());
   }
 }
```

and if you run jdeps -jdkinternals TestClass.class, you will see the following output:
TestClass.class -> JDK removed internal API TestClass -> sun.misc.BASE64Encoder
JDK internal API (JDK removed internal API) Warning: JDK internal APIs are unsupported
and private to JDK implementation that are subject to be removed or changed incompatibly
and could break your application. Please modify your code to eliminate dependence on any JDK internal APIs.
For the most recent update on JDK internal API replacements,
please check: https://wiki.openjdk.java.net/display/JDK8/Java+Dependency+Analysis+Tool JDK Internal
API Suggested Replacement ---------------- --------------------- sun.misc.BASE64Encoder Use java.util.Base64 @since 1.8



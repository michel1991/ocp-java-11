#### Which are valid modes on the jmod command? (Choose three.)
*  A. create
*  B. list
*  C. hash
*  D. show
*  E. verbose
*  F. version

The jmod command has five possible modes: create, extract, describe, list, and hash.

### Which are valid modes for the jmod command? (Choose all that apply.)
*  A. add
*  B. create
*  C. delete
*  D. describe
*  E. extract
*  F. list
*  G. show

This is another question you just have to memorize.
The jmod command has five modes you need to be able to list: create, extract, describe, list, and hash.
The hash operation is not an answer choice. The other four are making options B, D, E, and F correct.

##### What can be created using the Java Platform Module System
##### that could not be created without it? (Choose all that apply.)
*  A. JAR file
*  B. JMOD file
*  C. Smaller runtime images for distribution
*  D. Operating system specific bytecode
*  E. TAR file
*  F. None of the above

Option A is incorrect because JAR files have always been available regardless of the JPMS.
Option D is incorrect because bytecode runs on the JVM and is not operating system specific by definition.
While it is possible to run the tar command, this has nothing to do with Java, making option E incorrect.
Option B is one of the correct answers as the jmod command creates a JMOD file.
Option C is the other correct answer because specifying dependencies is one of the benefits of the JPMS.

#### Which of the following commands can be used to identify class and module dependencies?
* A. jar -describe
* B. java --describe
* C. jmod describe
* D. jmod --describe
* E. jmod --show-module-resolution
    The --show-module-resolution option is available in the java command.
    It prints out the complete module dependency tree for a given module

jmod is used for mod files, which are not on the exam. However, you might be asked about
the describe option which prints module details for a jmod file. For example:

jmod describe jmods/ma.jmod
Observe that there are no hypens (or dashes or minus sign) before describe.

It prints the modules required by the ma.jmod file. However, it does not show complete module resolution.
Correct(C)

####
```
Note: jmod is not on the part 1 exam.
However some candidates have seen it mentioned in one of the incorrect options.
You may read about jmod if you have time.

Which of the following options are supported by jmod?
```
* A. create
* B. add
* C. delete
* D. list
* E. extract
* F. describe
```
    The describe option prints module details for a jmod file. For example:

    jmod describe jmods/ma.jmod
    (Observe that there are no hypens (or dashes or minus sign) before describe.)
    Assuming that ma requires mb, it prints:


    ma
      requires mandated java.base
      requires mb


    jmod describe jmods/mb.jmod


    mb
      requires mandated java.base
      hashes ma SHA-256 07667d5032004b37b42ec2bb81b46df380cf29e66962a16481ace2e71e74073a
```

Jmod tool has 5 options: create, extract, list, describe, hash.

According to the documentation, JMOD enables aggregating files other
than class files, metadata, and resources such as native codes
and other things that cannot be stored in a JAR file.
Therefore, JMOD files are designed to contain file types
that cannot be contained by JAR files.
However, unlike JARs, which are executable, the JMOD files cannot be executed.
This means this files contained in JMOD can be used only at
compile-time or link-time, but not at runtime.

Correct(A, D, E,F)
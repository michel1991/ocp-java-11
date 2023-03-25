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
### Which of the following are modules supplied by the JDK? (Choose three.)
*  A. java.logging
*  B. java.javadoc
*  C. java.jdk
*  D. java.management
*  E. java.naming
*  F. java.scripts

The java.logging, java.management, and java.naming modules exist, making options A, D, and E correct.
Option B is tempting. However, jdk.javadoc exists, not java.javadoc. Options C and F are completely made up.

### Which of the following are modules supplied by the JDK? (Choose three.)
A. jdk.base
B. jdk.basic
C. jdk.desktop
D. jdk.javadoc
E. jdk.jdeps
F. jdk.net

The java.base module is automatically available to any module without specifying it.
However, this question tries to trick you with option A by specifying jdk.base instead.
Similarly, java.desktop exists, but not jdk.deskop, making option C wrong.
Options D, E, and F are correct because jdk.javadoc , jdk.jdeps,
and jdk.net are modules supplied with the JDK.
You do need to be able to recognize the names of built-in modules.

#### Which of the following are modules supplied by the JDK? (Choose three.)
* A. java.base
* B. java.basic
* C. java.desktop
* D. java.sdk
* E. java.sql
* F. java.swing

The java.base module is automatically available
to any module without specifying it, making option A correct.
Options C and E are also correct because java.desktop and java.sql
are modules supplied with the JDK.
You do need to be able to identify built-in modules for the exam.


### Which module is available to your named module without needing a requires directive?
* A. java.all
*  B. java.base
*  C. java.default
*  D. java.lang
*  E. None of the above

Option B is correct because java.base is provided by default.
It contains the java.lang package among others.

### Which of the following modules contains the java.sql package? (Choose all that apply.)
*  A. java.base;
*  B. java.database;
*  C. java.jdbc;
*  D. java.sql;
*  E. None of the above

Sorry. You just need to memorize this.
The java.sql package is in the java.sql module,
making option D correct. It just so happens to have the same name.

#### Which of the following statements would you need to have in the module-info of a Java Swing based desktop application?
* A. requires java.swing;
* B. requires javax.swing;
* C. requires java.desktop;
* D. requires javax.desktop;
* E. No special requires clause is necessary because Swing classes are part of the standard JDK.
   ----------- For E ---------
    It is true that Swing classes are a part of Java SE but they are not part of the java.base module.
   Only the classes that belong to java.base are accessible to other classes without an explicit requires clause.
    Swing classes (as well as AWT classes) belong to the javax.swing package, which belongs to the java.desktop module.
    Therefore, a modular application that uses Swing classes must have requires java.desktop; clause in its module-info


Correct(C)
Although the exam objectives do not explicitly mention Swing/AWT classes,
some candidates have reported getting a question that requires you to know the module required for using Swing classes in an application.



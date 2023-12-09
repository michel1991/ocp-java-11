### Given the following module-info:
```java
module book{
    requires org.pdf;
    uses org.pdf.Print;
}

```

### Which of the following statements are correct?

* A. The module that defines Print service must be present on --module-source-path for book module to compile.

* B. The module that defines Print service must be present on --module-path for book module to compile.
    book module can be compiled in two ways:  Either put the code for the org.pdf module on
    the --module-source-path  or put compiled classes/jar of the org.pdf module on the --module-path.
    
* C. The module that defines Print service must be present on --module-path for book module to execute.

* D. Exactly one module that provides Print service must be present on --module-path for book module to execute.
    This is not true. Multiple modules that provide the given service may be present on the module path.
    The user of the service may get a reference to any or all of them through java.util.ServiceLoader.
    
* E. A module that defines Print service may be added later without requiring book module to recompile.
   Although it is not clear what is meant by "added" here. However, we have seen such vague wording used in the exam questions.
    Our guess is, it just means that any service provider module can be added to the module-path while executing book module.
    
* F An implementation of org.pdf.Print can be added to the book module.
    Again, it is not clear what is meant by "added" here.
    One can certainly have a class that implements org.pdf.Print
    interface in the book module as the book module already contains the appropriate requires clause.
    Of course, the book module cannot be considered as a provider
    of Print service because there is no provide-with clause for the Print service in module-info.
(Correct C, E, F)
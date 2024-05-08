#### Given the following module-info:

```
    module book{
        requires org.pdf;
        uses org.pdf.Print;
    }
``` 


Which of the following statements are correct?

* A. book module can be compiled without requiring any module that provides Print service.
book module depends only on the module that defines Print service. It does not depend on any module that implements Print service.

A module providing an implementation of the Print interface will need to be available at run time on
the module-path only if the book module tries to locate and use a Print service using ServiceLoader.
Even at run time, if no print service is found, there will not be any exception thrown by the JVM on its own.
ServiceLoader.load(Print.class) will simply return an Iterator with zero elements in that case.

* B.  At least one implementation of Print service must be available on module-source-path for book module to compile.

* C. At least one implementation of Print service must be available for book module to execute without an exception.
    This is not really necessary because it depends on what the book module does. For example, if a class in book module does the following:

```
  ServiceLoader<Print> pLoader = ServiceLoader.load(Print.class); // note that ServiceLoader implements Iterable interface
    for (Print p : pLoader){
        p.print("Hello");
    }
``` 

    
    
There will be no exception even if there is no module that provides
Print implementation because ServiceLoader.load will return a ServiceLoader with no elements.

* D.
    At least one implementation of Print service must be available for book module to load successfully at run time.
    The JVM does not check whether a service implementation is present or not while loading a module.

* E. The requires org.pdf; clause in the given module-info is redundant.
This clause is actually required because org.pdf is the module that contains org.pdf.Print interface.
Coincidently, org.pdf is also the package to which Print belongs but that is irrelevant
here because requires clause contains the module name, not the package name.

Correct(A)
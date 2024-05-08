#### Given:
```java
    module abc.print{
        requires org.pdf;
        provides org.pdf.Print with com.abc.print.SimplePrintImpl;
        provides org.pdf.Print with com.abc.print.ComplexPrintImpl;
    }
``` 


Assuming that another module named book uses abc.print module and contains the following code,

```java
ServiceLoader<Print> psLoader = ServiceLoader.load(Print.class);
for (Print p : psLoader){
    p.print("Hello");
}
``` 


identify correct statements.

* A. Only the print method from SimplePrintImpl will be invoked.
* B. Only the print method from ComplexPrintImpl will be invoked.
* C. print methods from SimplePrintImpl as well as ComplexPrintImpl will be invoked.

* D.abc.print module will not compile.
    As per JLS 11 section 7.7.4
    It is a compile-time error if more than one provides directive in a module declaration specifies the same service.
    
    It is a compile-time error if the with clause of a given provides directive specifies the same service provider more than once.

* E. An exception will be thrown at run time when the given code is executed.

Here are the rules for a service provider:

1. If a service provider explicitly declares a public constructor with no formal parameters,
or implicitly declares a public default constructor, then that constructor is called the provider constructor.

2. If a service provider explicitly declares a public static method called provider with no formal parameters,
then that method is called the provider method.

3. If a service provider has a provider method, then its return type must (i) either be declared in the current module,
or be declared in another module and be accessible to code in the current module;
and (ii) be a subtype of the service specified in the provides directive; or a compile-time error occurs.

4. While a service provider that is specified by a provides directive must be declared in the current module,
its provider method may have a return type that is declared in another module.
Also, note that when a service provider declares a provider method, the service
provider itself need not be a subtype of the service.

5. If a service provider does not have a provider method,
then that service provider must have a provider constructor and must be a subtype of the service specified in the provides directive,
or a compile-time error occurs.

Correct(D)

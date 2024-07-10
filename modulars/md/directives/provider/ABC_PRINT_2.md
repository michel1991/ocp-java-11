### Given:
```
Given:
module abc.print{
   requires org.pdf;
   provides org.pdf.Print with com.abc.print.PrintImpl;
}

Identify correct statements about the above module.
```  

Identify correct statements about the above module.

* A. org.pdf.Print must be an interface.
* B. org.pdf.Print must be an interface or an abstract class.

```
Ideally, Print should be an interface or an abstract class but there is no such technical restriction.

As per JLS Section 7.7.4:
The service must be a class type, an interface type, or an annotation type. It is a compile-time error if a provides directive specifies an enum type as the service.
``` 


* C. com.abc.print.PrintImpl must have a no-args constructor.

```
 This is not necessary. It could also have a provider method.
``` 
   

* D. com.abc.print.PrintImpl must implement (or extend) org.pdf.Print.

```
This is not necessary. If PrintImpl has a provider method, then that method could return any sub-type of Print. PrintImpl does not have to be a sub-type of Print.

```

* E. None of the above are correct.


Here are the rules for a service provider:

1. If a service provider explicitly declares a public constructor with no formal parameters, or implicitly declares a public default constructor, then that constructor is called the provider constructor.

2. If a service provider explicitly declares a public static method called provider with no formal parameters, then that method is called the provider method.

3. If a service provider has a provider method, then its return type must (i) either be declared in the current module, or be declared in another module and be accessible to code in the current module; and (ii) be a subtype of the service specified in the provides directive; or a compile-time error occurs.

4. While a service provider that is specified by a provides directive must be declared in the current module, its provider method may have a return type that is declared in another module. Also, note that when a service provider declares a provider method, the service
provider itself need not be a subtype of the service.

5. If a service provider does not have a provider method, then that service provider must have a provider constructor and must be a subtype of the service specified in the provides directive, or a compile-time error occurs.

Correct(E)


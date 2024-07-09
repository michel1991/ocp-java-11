### Which of the following statements are true?

* A. Private methods cannot be overridden in subclasses.
    Only methods that are inherited can be overridden and private methods are not inherited.
    
* B. A subclass can override any method in a non-final superclass.
    Only the methods that are not declared to be final can be overridden.
    Further, private methods are not inherited so they cannot be overridden either.
    
* C. An overriding method can declare that it throws a wider spectrum of checked exceptions than the method it is overriding.

* D. The parameter list of an overriding method must be a subset of the parameter list of the method that it is overriding.
    An overriding method (the method that is trying to override the base class’s method) must have the same parameters.
    
* E. The overriding method may opt not to declare any throws clause even if the original method has a throws clause.
    No exception (i.e. an empty set of exceptions)
    is a valid subset of the set of exceptions thrown
    by the original method so an overriding method can choose to not have any throws clause.
    
A method can be overridden by defining a method with the same signature(i.e. name and parameter list)
and return type as the method in a superclass.
The return type can also be a subclass of the original method's return type.

Only methods that are accessible can be overridden.
A private method cannot, therefore, be overridden in subclasses,
but the subclasses are allowed to define a new method with exactly the same signature.

A final method cannot be overridden.
An overriding method cannot exhibit behavior
that contradicts the declaration of the original method.
An overriding method therefore cannot return a different type (except a subtype)
or throw a wider spectrum of exceptions than the original method in the superclass.
This, of course, applies only to checked
exceptions because unchecked exceptions are not required to be declared at all.

A subclass may have a static method with the same signature
as a static method in the base class but it is not called overriding.
It is called hiding because the concept of polymorphism doesn't apply to static members
(Correct A, E)

## Given the following method code:

public void myMethod() throws MyException {

  //method code

}

* A. If the throws MyException clause is removed from the method and if the method fails to compile, then MyException must be an unchecked exception.

```txt
In that case, it would be a checked exception because a method is required to declare only checked exceptions in its throws clause.
```

* B. If the throws MyException clause is removed from the method and if the method fails to compile, then MyException must be extending RuntimeException.

```txt
Error and RuntimeException are unchecked exception classes. Any subclass of Error or RuntimeException need not be declared in the throws clause.
```

* C. A method that calls myMethod must wrap the call in a try block.

```
If MyException is an unchecked exception, then there is no need of a try block. Even if MyException is a checked exception, the method could simply declare it in its throws clause instead of wrapping the call in a try block.
```

* D. The code in myMethod can throw only MyException.
```txt
It can throw MyException or its subclasses. It can also throw any unchecked exception.
```
* E. If MyException class is made to extend RuntimeException, there would be no impact on myMethod.
```
Extending from RuntimeException would make MyException an unchecked exception. It is not a problem if an unchecked exception is declared in the throws clause of a method.
```

Correct(E)


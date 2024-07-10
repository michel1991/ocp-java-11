#### Which of the following method definitions will prevent overriding of that method?

* A. public final void m1()
```
final methods cannot be overridden or hidden. That is the purpose of final keyword.
``` 


* B. public static void m1()

* C. public static final void m1()
```
Keep in mind that static methods are never overridden, they may be hidden by a static method of a subclass with the same signature.

``` 

* D. public abstract void m1()

* E. private void m1()

``` txt
private void m1()
private methods are not inherited at all so there is no question of overriding or hiding a private method. A subclass is free to have a static or instance method with the same signature as that of a private instance or static method of a super class. The subclass method will neither override nor hide the superclass's method in such a case.
```

Correct(A, B, C E)



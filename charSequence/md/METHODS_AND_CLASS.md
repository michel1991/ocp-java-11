### Which of the following statements are true?
* A. method length() of String class is a final method.
```
Actually, String class itself is final and so all of its methods are implicitly final.
```


* B. You can make mutable subclasses of the String class.

```
Both - String and StringBuilder are final classes. So is StringBuffer.
```


* C. StringBuilder extends String.
```
StringBuilder extends Object
``` 

* D. StringBuilder is a final class.
```
String, StringBuilder, and StringBuffer - all are final classes.

1. Remember that wrapper classes (java.lang.Boolean, java.lang.Integer, java.lang.Long, java.lang.Short etc.) are also final and so they cannot be extended.

2. java.lang.Number, however, is not final. Integer, Long, Double etc. extend Number.

3. java.lang.System is final as well.
```

* E. String class is not final.

Correct(A, D)


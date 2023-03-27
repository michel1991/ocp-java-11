### What is true of the following method?
```java
    public String getColor() {
        return color;
    }
```

* A. It is a correctly implemented accessor method.
* B. It is a correctly implemented mutator method.
* C. It is an incorrectly implemented accessor method.
* D. It is an incorrectly implemented mutator method.
* E. None of the above.

The method is a correct getter or accessor, making option A is correct.

#### What are possible outputs of the following
#### given that the comment on line X can be replaced by code?

``` java
// Mandrill.java
public class Mandrill {
    public int age;
    public Mandrill(int age) {
        this.age = age;
    }
    public String toString() {
        return "" + age;
    }
}

// PrintAge.java
public class PrintAge {
    public static void main (String[] args) {
        var mandrill = new Mandrill(5);

        // line X

        System.out.println(mandrill);
    }
}
```

* A. 0
* B. 5
* C. Either 0 or 5
* D. Any int value
* E. Does not compile

This class has poor encapsulation since the age variable is public.
This means that a developer could modify the body of main()
to change the value of mandrill.age to any integer value, and option D is correct.

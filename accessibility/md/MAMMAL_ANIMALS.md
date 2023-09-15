#### What is the result of executing the Sounds program?

```java
    // Sheep.java
    package com.mammal;
    
    public class Sheep {
        private void baa() {
            System.out.println("baa!");
        }
        private void speak() {
            baa();
        }
    }
    
    // Sounds.java
    package com.animals;
    import com.mammal.Sheep;
    
    public class Sounds {
        public static void main(String[] args) {
            var sheep = new Sheep();
            sheep.speak();
        }
    }
```
* A. The code runs and prints baa!.
* B. The Sheep class does not compile.
* C. The Sounds class does not compile.
* D. Neither class compiles.

The speak() method has private access,
which does not allow code outside the class to call it.
Therefore, option C is the answer.

#### What is the result of executing the Sounds program?

```java
/package com.mammal;

public class Sheep {
    private void baa() {
        System.out.println("baa!");
    }
    private static void speak() {
        baa();
    }
}

// Sounds.java
package com.animals;
import com.mammal.Sheep;

public class Sounds {
    public static void main(String[] args) {
        var sheep = new Sheep();
        sheep.speak();
    }
}
```

* A. The code runs and prints baa!.
* B. The Sheep class does not compile.
* C. The Sounds class does not compile.
* D. Neither class compiles.


The Sheep class does not compile since a static method cannot call an instance method.
The Sounds class does not compile because it does not have access to the speak() method.
Since neither class compiles, option D is correct.




#### What does the following code print?
``` java
    package com.animal;
    
    public class Hare {
        void init() {
            System.out.print("init-");
        }
        protected void race() {
            System.out.print("hare-");
        }
    }
    
    // Tortoise.java
    package com.animal;
    
    public class Tortoise {
        protected void race(Hare hare) {
            hare.init();    // x1
            hare.race();    // x2
            System.out.print("tortoise-");
        }
        public static void main(String[] args) {
            var tortoise = new Tortoise();
            var hare = new Hare();
            tortoise.race(hare);
        }
    }

```

* A. init-hare-tortoise
* B. init-hare
* C. The first line with a compiler error is line x1.
* D. The first line with a compiler error is line x2.
* E. The code does not compile due to a different line.
* F. The code throws an exception.

The init() method is accessible from the same package.
The race() method is available from the same package or subclasses.
Since Tortoise is in the same package, both methods are available and option A is correct.
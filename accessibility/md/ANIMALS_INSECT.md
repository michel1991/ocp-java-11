##### What does the following print?
##### What is the result of executing the Grasshopper program?

``` java
    // Hopper.java
    package com.animals;
    
    public class Hopper {
        protected void hop() {
            System.out.println("hop");
        }
    }
    
    // Grasshopper.java
    package com.insect;
    import com.animals.Hopper;
    
    public class Grasshopper extends Hopper {
        public void move() {
            hop();  // p1
        }
        public static void main(String[] args) {
            var hopper = new Grasshopper();
            hopper.move();  // p2
            hopper.hop();   // p3
        }
    }
```


* A. The code prints hop once.
* B. The code prints hop twice.
* C. The first compiler error is on line p1.
* D. The first compiler error is on line p2.
* E. The first compiler error is on line p3.

The hop() method has protected access,
which allows subclasses to call it.
Both the move() method and main() method are allowed
to call hop() since Grasshopper is a subclass.
The code runs without error and prints hop twice,
making option B the answer.


#### What is the result of executing the HopCounter program?
```java
    // Hopper.java
    package com.animals;
    
    public class Hopper {
        protected void hop() {
            System.out.println("hop");
        }
    }
    
    // Grasshopper.java
    package com.insect;
    import com.animals.Hopper;
    
    public class Grasshopper extends Hopper {
        public void move() {
            hop();  // p1
        }
    }
    
    // HopCounter.java
    package com.insect;
    
    public class HopCounter {
        public static void main(String[] args) {
            var hopper = new Grasshopper();
            hopper.move();  // p2
            hopper.hop();   // p3
        }
    }
```

* A. The code prints hop once.
* B. The code prints hop twice.
* C. The first compiler error is on line p1.
* D. The first compiler error is on line p2.
* E. The first compiler error is on line p3.

The hop() method has protected access, which allows subclasses to call it,
making line p1 correct. The HopCounter class is allowed
to call the move() method because it is public.
However, it is not allowed to call the hop() method since it is referencing
a subclass, but not in one. Therefore, option E is the answer.

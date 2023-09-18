
### My  Rule Protected in Different package
* prior static analysis at the left side(1)
* While Reference type(at left) is current Reference type of current child it is ok for method that hold accessibility protected

### What is the result of the following code?
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
package com.animals;

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

The hop() method has protected access,
which allows subclasses to call it, making line p1 compile.
Additionally, code in the same package is allowed to access it,
making lines p2 and p3 compile.
The code compiles and runs without error, making option B the answer.

### Which lines in Tadpole give a compiler error? (Choose all that apply.)
```java
    package animal;
    public class Frog { //2
        protected void ribbit() { } //3
        void jump() {} //4
    }
    
    package other;
    class Tadpole extends Frog { // 3:
        public static void main(String[] args) { //  4:
            Tadpole t = new Tadpole(); //  5:
            t.ribbit(); //    6:
            t.jump(); //   7:
            Frog f = new Tadpole(); //  8:
            f.ribbit(); //   9:
            f.jump(); //  10:
        } } //  11:
```
* A. 5
* B. 6
* C. 7
* D. 8
* E. 9
* F. 10

The jump() method has default (package-private) access,
which means it can be accessed only from the same package.
Tadpole is not in the same package as Frog, causing lines 7 and 10 to give a compiler error,
making options C and F correct.
The ribbit() method has protected access,
which means it can only be accessed from
a subclass reference or in the same package.
Line 6 is fine because Tadpole is a subclass.
Line 9 does not compile because the variable reference is to a Frog, making option E correct.
This is the trickiest question you can get on this topic on the exam.
For more information, see Chapter 7.
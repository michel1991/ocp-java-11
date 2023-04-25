### My  Rule Protected in Different package
* While Reference type is current Reference type of current child it is ok for method that hold accessibility protected

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

The jump() method has default (package-private) access, which means it can be accessed only from the same package.
Tadpole is not in the same package as Frog, causing lines 7 and 10 to give a compiler error, making options C and F correct.
The ribbit() method has protected access, which means it can only be accessed from a subclass reference or in the same package.
Line 6 is fine because Tadpole is a subclass. Line 9 does not compile because the variable reference is to a Frog, making option E correct.
This is the trickiest question you can get on this topic on the exam. For more information, see Chapter 7.

# Given the following code, which of the statements are true? (Choose all that apply.)
```java
    1: package animal;
    2: public class Frog {
        3:    ______ void ribbit() { }
        4: }

    1: package _____;
    2: import animal.*;
    3: public class Tadpole extends Frog {
        4:    public static void main(String[] args) {
            5:       Tadpole t = new Tadpole();
            6:       t.ribbit();
            7:    } }
```

*  A. If Tadpole is in package animal, t.ribbit() will compile if given default access.
*  B. If Tadpole is in package animal, t.ribbit() will compile if given protected access.
*  C. If Tadpole is in package animal, t.ribbit() will compile if given private access.
*  D. If Tadpole is in package baby, t.ribbit() will compile if given default access.
*  E. If Tadpole is in package baby, t.ribbit() will compile if given protected access.
*  F. If Tadpole is in package baby, t.ribbit() will compile if given private access.

If the two classes are in the same package, they will compile if ribbit() has public, protected, or default access.
If the two classes are not in the same package, they will compile if ribbit() has public or protected access.

##### Suppose we have the following class in the file /my/directory/named/A/Bird.java. Which of the answer options replaces INSERT CODE HERE when added independently if we compile from /my/directory? (Choose all that apply.)
```java
 //INSERT CODE HERE
  public class Bird {
  }
```
* A. package my.directory.named.a;
* B. package my.directory.named.A;
* C. package named.a;
* D. package named.A;
* E. package a;
* F. package A;

The package name represents any folders underneath the current path, which is named.A in this case.
Option B is incorrect because package names are case sensitive, just like variable names and other identifiers.

### Given the following my.school.Classroom and my.city.School class definitions, which line numbers in main() generate a compiler error? (Choose all that apply.)
```java
    package my.school; // 1:
    public class Classroom { // 2:
        private int roomNumber; //   3:
        protected static String teacherName; // 4:
        static int globalKey = 54321; //  5:
        public static int floor = 3; //  6:
        Classroom(int r, String t) { //   7:
            roomNumber = r; //  8:
            teacherName = t; } } //  9:

    package my.city; // 1:
    import my.school.*; //  2:
    public class School { //   3:
        public static void main(String[] args) { //  4:
            System.out.println(Classroom.globalKey); //  5:
            Classroom room = new Classroom(101, "Mrs. Anderson"); //  6:
            System.out.println(room.roomNumber); // 7:
            System.out.println(Classroom.floor);  //  8:
            System.out.println(Classroom.teacherName); } } // 9:

```
* A. None, the code compiles fine.
* B. Line 5
* C. Line 6
* D. Line 7
* E. Line 8
* F. Line 9

The two classes are in different packages, which means private access and default (package-private) access will not compile.
This causes compile errors in lines 5, 6, and 7, making options B, C, and D correct answers.
Additionally, protected access will not compile since School does not inherit from Classroom.
This causes the compiler error on line 9, making option F a correct answer as well.

### Which of the following can fill in the blank in this code to make it compile? (Choose all that apply.)
```java
public class Ant {
    _____ void method() {}
    }
```
* A. default
* B. final
* C. private
* D. Public
* E. String
* F. zzz:

The keyword void is a return type.
Only the access modifier or optional specifiers are allowed before the return type.
Option C is correct, creating a method with private access.
Option B is also correct, creating a method with default access and the optional specifier final.
Since default access does not require a modifier, we get to jump right to final.
Option A is incorrect because default access omits the access modifier rather than specifying default.
Option D is incorrect because Java is case sensitive.
It would have been correct if public were the choice.
Option E is incorrect because the method already has a void return type.
Option F is incorrect because labels are not allowed for methods.

### Which can fill in the blank to create a properly encapsulated class? (Choose all that apply.)

```java
    public class Rabbits {
        _____ int numRabbits = 0;
        _____ void multiply() {
            numRabbits *= 6;
        }
        ______ int getNumberOfRabbits() {
            return numRabbits;
        }
    }
```


* A. private, public, and public
* B. private, protected, and private
* C. private, private, and protected
* D. public, public, and public
* E. None of the above since multiply() does not begin with set
* F. None of the above for a reason other than the multiply() method

Instance variables must the private access modifier,
making option D incorrect. While it is common for methods to be public, this is not required.
Options A, B, and C are all correct, although some are more useful than others.
Since the class can be written to be encapsulated, options E and F are incorrect.

### What can fill in the blank so the play() method can be called from all classes in the com.mammal and com.mammal.eland package, but not the com.mammal.gopher package?
```java
    package com.mammal;

    public class Enrichment {
        _____  void play() {}
    }

```
*  A. Leave it blank.
*  B. private
*  C. protected
*  D. public
*  E. None of the above.

If only the com.mammal class needed access, option A would be correct.
Access modifiers cannot be used to grant access to a list of packages.
The Java Platform Module Framework can do this, but it is not an option in this question. Therefore, option E is correct.

####  What is the result of executing the Tortoise program?

```java
    // Hare.java
    package com.mammal;

    public class Hare {
        public void init() {
            System.out.print("init-");
        }
        private void race() {
            System.out.print("hare-");
        }
    }

    // Tortoise.java
    package com.reptile;
    import com.mammal.Hare;

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

The init() method is accessible from any code. However, the race() method is available only within the Hare class.
Since Tortoise is a different class, the method is not available, and option D is correct.

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
making line p1 correct. The HopCounter class is allowed to call the move() method because it is public.
However, it is not allowed to call the hop() method since it is referencing
a subclass, but not in one. Therefore, option E is the answer.

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

##### What does the following print? What is the result of executing the Grasshopper program?

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

The hop() method has protected access, which allows subclasses to call it.
Both the move() method and main() method are allowed to call hop() since Grasshopper is a subclass.
The code runs without error and prints hop twice, making option B the answer.

#### What can fill in the blank so the play() method can be called
#### from all classes in the com.mammal package, but not the com.mammal.gopher package?

``` java
    package com.mammal;

    public class Enrichment {
        _____  void play() {}
    }

```
* A. Leave it blank.
* B. private
* C. protected
* D. public
* E. None of the above.

Since only one package needs access and it is the same package the class is in, option A is correct.

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
which does not allow code outside the class to call it. Therefore, option C is the answer.





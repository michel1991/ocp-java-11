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
### Given the following code, which of the statements are true? (Choose all that apply.)

```java
    package animal;  // 1:
    public class Frog {  // 2:
        void ribbit() { } //  3:______
        } //4:

    package _____;  //  1:
    import animal.*; //  2:
    public class Tadpole extends Frog { //  3:
        public static void main(String[] args) { //  4:
            Tadpole t = new Tadpole(); //  5:
            t.ribbit();  //  6:
            } } // 7:
```
* A. If Tadpole is in package animal, t.ribbit() will compile if given default access.
* B. If Tadpole is in package animal, t.ribbit() will compile if given protected access.
* C. If Tadpole is in package animal, t.ribbit() will compile if given private access.
* D. If Tadpole is in package baby, t.ribbit() will compile if given default access.
* E. If Tadpole is in package baby, t.ribbit() will compile if given protected access.
* F. If Tadpole is in package baby, t.ribbit() will compile if given private access.

If the two classes are in the same package, they will compile if ribbit() has public, protected, or default access.
If the two classes are not in the same package, they will compile if ribbit() has public or protected access.

### Which lines in Tadpole give a compiler error? (Choose all that apply.)
```java
package animal; // 1:
public class Frog { // 2:
    protected void ribbit() { } //  3:
    void jump() { } // 4:
    } //  5:
    package other; // 1:
    import animal.*; //  2:
    public class Tadpole extends Frog { //  3:
        public static void main(String[] args) { // 4:
            Tadpole t = new Tadpole(); //  5:
            t.ribbit(); // 6:
            t.jump(); // 7:
            Frog f = new Tadpole(); //  8:
            f.ribbit(); //  9:
            f.jump(); //  10:
            }} //  11:

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
Line 6 is fine because Tadpole is a subclass.
Line 9 does not compile because the variable reference is to a Frog, making option E correct.
This is the trickiest question you can get on this topic on the exam. For more information, see Chapter 7.

### Which of the following correctly overload this method? (Choose all that apply.)
```java
public void buzz() { }
```
* A. private void buzz(String sound) { }
* B. public final void buzz() { }
* C. public static void buzz() { }
* D. public static void buzz(int... time) { }
* E. public void buzz(boolean softly) { }
* F. public void buzzLouder() { }

Options B and C are incorrect because they have the same name and empty parameter list as the original.
One of these must differ to be an overload. Option F is incorrect because the method name is different than the original.
It is a perfectly fine method, but it isn’t an overload.
Options A, D, and E are correct overloads because the method name is the same and the method parameter list is different.
Anything else is allowed to vary. Remember that Java is case sensitive.
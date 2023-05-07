### My  Rule Protected in Different package
* prior static analysis at the left side(1)
* While Reference type(at left) is current Reference type of current child it is ok for method that hold accessibility protected

# Given the following code, which of the statements are true? (Choose all that apply.)
```java
    1: package animal;
    2: public class Frog {
    3:    ______ void ribbit() { }
    4: }

    1: package _____;
    2: import animal.*;
    3: public class Tadpole extends Frog {
    4:     public static void main(String[] args) {
    5:       Tadpole t = new Tadpole();
    6:           t.ribbit();
    7:    } }
```

*  A. If Tadpole is in package animal, t.ribbit() will compile if given default access.
*  B. If Tadpole is in package animal, t.ribbit() will compile if given protected access.
*  C. If Tadpole is in package animal, t.ribbit() will compile if given private access.
*  D. If Tadpole is in package baby, t.ribbit() will compile if given default access.
*  E. If Tadpole is in package baby, t.ribbit() will compile if given protected access.
*  F. If Tadpole is in package baby, t.ribbit() will compile if given private access.

If the two classes are in the same package,
they will compile if ribbit() has public, protected, or default access(me: for this A, B).
If the two classes are not in the same package,
they will compile if ribbit() has public or protected access(me: for this E).
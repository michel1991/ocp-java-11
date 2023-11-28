#### Given that TestClass is a class, how many objects and reference variables are created by the following code?

```java
TestClass t1, t2, t3, t4;
t1 = t2 = new TestClass();
t3 = new TestClass();

```

* A. 2 objects, 3 references.
* B. 2 objects, 4 references.
two news => two objects. t1, t2, t3, t4 => 4 references.
* C. 3 objects, 2 references.
* D. 2 objects, 2 references.
E. None of the above.

A declared reference variable exists regardless
of whether a reference value (i.e. an object) has been assigned to it or not.
You may want to check out the free video by Dr.
Sean Kennedy explaining this question: https://youtu.be/Yu8JUIKQzdg
(Correct B)
#### Which of the following statements about an array are correct?

* A. An array can dynamically grow in size.
    Arrays cannot grow in size once created. ArrayLists can do that.
* B. Arrays can be created only for primitive types.
    You can have arrays for objects also. For example:
    Object[] objArray = new Object[4];
    String[] arrayOfStrings = { "a", "b" };
* C. Every array has a built in property named 'size' which tells you the number of elements in the array.
    It is named length and not size. ArrayList has a method named size() that returns the number of elements in the ArrayList.
```txt
    String[] sa = { "a", "b" };
    int k = sa.length; //k will be assigned a value of 2.
    
    ArrayList al = new ArrayList();
    int k = al.size(); //k will be assigned a value of 0.
```
* D. Every array has an implicit method named 'length' which tells you the number of elements in the array.
    Arrays don't have a method named length. They have a field named length.
    Element indexing starts at 0.
* E. All arrays can be cloned using clone method.

Actually, the clone method is defined in Object class but it has protected access.
All array classes override this method and make it public.
The clone method returns a shallow clone of an array. For example, if you have,
```txt
    Student[] sa1 = new Student[]{
    new Student(), new Student()}; //assuming that a Student class exists, you can do:
    Student[] sa2 = sa1.clone();
``` 

sa2 will now point to a new array of Student objects. But the elements of
this new array will point to the same Student objects that were there in the original array.
In other words, when you clone an array,
the array is cloned but the elements of the array are not cloned.

Thus, sa1 == sa2 will be false, but sa1[0] == sa2[0] will be true.
(Correct D, E)

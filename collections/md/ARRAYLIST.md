### Which of the following are benefits of an array over an ArrayList ?

* A. It consumes less memory.
    This is an ambiguous option because in certain situation an ArrayList may consume
    a little bit more memory than an array (because of additional internal data structure and pointers),
    while in some other situation it may consume less (when your array is only half full).
* B. Accessing an element in an array is faster than in ArrayList.
    Although very little, but a direct array access using an index is faster than calling a method on ArrayList.
* C. You do not have to worry about thread safety.
    Neither an ArrayList nor an array is thread safe. If you have multiple threads trying to add
    and remove elements from an ArrayList or an array, you have to write additional code to ensure thread safety.
* D. It implements Collection interface and can thus be passed where ever a Collection is required.
    arrays do not implement Collection interface. ArrayList does. This is actually an advantage of an ArrayList over an array

An ArrayList resized dynamically at run time as per the situation. An array cannot be resized once created.
This reduces the amount of boiler plate code that is required to do the same task using an array.
(Correct is A, B)
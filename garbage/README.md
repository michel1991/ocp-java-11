### Which of the following statements about garbage collection are correct? (Choose all that apply.)
* A. Calling System.gc() is guaranteed to free up memory by destroying objects eligible for garbage collection.
* B. Garbage collection runs on a set schedule.
* C. Garbage collection allows the JVM to reclaim memory for other objects.
* D. Garbage collection runs when your program has used up half the available memory.
* E. An object may be eligible for garbage collection but never removed from the heap.
* F. An object is eligible for garbage collection once no references to it are accessible in the program.
* G. Marking a variable final means its associated object will never be garbage collected.

In Java, there are no guarantees when garbage collection will run.
The JVM is free to ignore calls to System.gc(). For this reason, options A, B, and D are incorrect.
Option C is correct, as the purpose of garbage collection is to reclaim used memory.
Option E is also correct that an object may never be garbage collected,
such as if the program ends before garbage collection runs.
Option F is correct and is the primary means by which garbage collection algorithms determine whether
an object is eligible for garbage collection.
Finally, option G is incorrect as marking a variable final means it is constant within its own scope.
For example, a local variable marked final will be eligible for garbage collection after the method ends,
assuming there are no other references to the object that exist outside the method

### Response Grasshopper
* C, D
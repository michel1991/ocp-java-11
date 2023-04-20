##### What statement best describes the notion of effectively final in Java?
* A. A local variable that is marked final
* B. A static variable that is marked final
* C. A local variable whose primitive value or object reference does not change after it is initialized
* D. A local variable whose primitive value or object reference does not change after a certain point in the method
* E. None of the above

A local variable is effectively final when its primitive
value or object reference does not change after it is initialized,
making option C the correct answer. Note that option D
is incorrect because any change to the variable
after it is initialized disqualifies
it for being considered effectively final.
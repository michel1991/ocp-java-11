### Which of these for statements are valid when present in a method?

* 1. for (var i=5; i=0; i--) { }

* 2.  var j=5;
      for(int i=0, j+=5;  i<j ; i++) {  j--;  }

* 3. int i, j;
    for (j=10; i<j; j--) { i += 2; }

* 4. var i=10;
    for ( ; i>0 ; i--) { }

* 5. for (int i=0, j=10; i<j; i++, --j) {;}

* 6. for (var i=0, j=10; i<j; i++, --j) {;}

* 1, 2
* 3, 4
* 1, 5
* 1 is not valid.
* 4, 5
* 5
* 4, 5, 6
* var is not allowed in compound declaration. So, var i=0, j=10; is invalid.

No 1.
uses '=' instead of '==' for condition which is invalid. The loop condition must be of type boolean.

No 2.
uses 'j +=5'. Now, this statement is preceded by 'int i=0,' and that means we are trying to declare variable j.
But it is already declared before the for loop. If we remove the int in the initialization part and
declare i before the loop then it will work. But if we remove the statement int j = 5;
it will not work because compiler will try to do j = j+5 and you can't use the variable
before it is initialized. Although the compiler gives a message 'Invalid declaration' for j += 5,
it really means the above mentioned thing.

No 3. i is uninitialized.

No 4. is valid. It contains empty initialization part.

No 5.
This is perfectly valid. You can have any number of comma separated statements
in initialization and incrementation part. The condition part must contain a single expression that returns a boolean.
All a for loop needs is two semi colons :-
for( ; ; ) {} This is a valid for loop that never ends. A more concise form for the same is : for( ; ; );


### Given the following Venn diagram and the boolean variables, apples,
### oranges, and bananas, which expression most
### closely represents the filled-in region of the diagram?

[image](images/apples_oranges_bananas_filled.jpg)
* A. apples && oranges && !bananas
* B. orange || (oranges && !bananas)
* C. (apples || bananas) && oranges
* D. oranges && apples
* E. (apples || oranges) && !bananas
* F. apples ^ oranges

The diagram represents all cases where apples or oranges is true,
but bananas is false, making option E correct.
Option A is close but is correct only
if the top overlapping portion of apples and oranges was filled in.
For fun, you should try to draw the diagrams that would represent the other answers.

##### How many of these statements can be inserted
##### after the println to have the code flow follow the arrow in this diagram?

[image](images/control_flow.png)
* A. One
* B. Two
* C. Three
* D. Four
* E. Five
* F. None of above

If the code follows the arrow, then it prints each letter once,
breaking out of the inner loop on every iteration.
Since a break without a label applies to the innermost structure,
break and break numbers are equivalent,
and both of these two are correct answers.
Likewise, continue and continue numbers are both equivalent
although both wrong in this case since they resume operation of the inner loop.
That leaves break letters and continue letters.
In this case, break letters stops the outer loop after printing just one letter,
so it is incorrect. On the other hand, continue letters
exits the inner loop and returns control to the outer loop,
which is the desired behavior.
Since three statements are correct, option C is correct.

####
``` txt
    You have been given an array of objects and you need to process this array as follows -
    1. Call a method on each object from first to last one by one.
    2. Call a method on each object from last to first one by one.
    3. Call a method on only those objects at even index (0, 2, 4, 6, etc.)

    Which of the following are correct?
```
* A. Enhanced for loops can be used for all the three tasks.
* B. Enhanced for loop can be used for only the first task. For the rest, standard for loops can be used.
* C. Standard for loops can be used for tasks 1 and 2 but not 3.
* D. All the tasks can be performed either by using only standard for loops or by using only enhanced for loops.
* E. Neither standard for loops nor enhanced for loops can be used for all three tasks.

``` txt
    The enhanced for loop is tailor made for processing each element of a collection (or an array) in order.
    Most importantly, it does not give you an iterating variable that you can manipulate and that makes
    it impossible to change the order or to skip an element. Therefore, tasks 2 and 3 cannot be done by an enhanced for loop.

    The standard for loop is very flexible. It can do pretty much anything. Here is how you can do task 2 and 3 using a standard for loop -

        //processing in reverse
        for(int i=arr.length-1; i>=0; i--){
            arr[i].m1();
        }

        //processing alternate
        for(int i=0; i<arr.length; i=i+2){
            arr[i].m1();
        }
```

Correct(B)


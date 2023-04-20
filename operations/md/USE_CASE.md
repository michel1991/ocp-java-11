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

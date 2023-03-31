### Which properties of the Clean annotation must be true for the following to compile? (Choose three.)
``` java
   @Clean("Basement") public class House {}
```
* A. The annotation must contain exactly one element.
* B. The annotation must contain an element named value.
* C. The element must not have a default value.
* D. The element may have a default value.
* E. The annotation may contain more than one element.
* F. The annotation must contain an element named values

An annotation may omit the element name if it contains an element named value,
declared as value(), making option B correct and option F incorrect.
Additionally, it may contain any number of additional elements,
provided none of them is required, making option E correct.
Finally, the element may optionally have a default value, making option D correct.
The other options are incorrect statements that contradict the correct answers.

### What properties must be true to use an annotation with an element value, but no element name? (Choose all that apply.)
* A. The element must be named values().
* B. The element must be required.
* C. The annotation declaration must not contain any other elements.
* D. The annotation must not contain any other values.
* E. The element value must not be array.
* F. None of the above

To use an annotation with a value but not element name,
the element must be declared with the name value(), not values(), making option A incorrect.
The value() annotation may be required or optional, making option B incorrect.
The annotation declaration may contain other elements,
provided none is required, making option C incorrect.
Option D is correct, as the annotation must not include any other values.
Finally, option E is incorrect, as this is not a property of using a value() shorthand.
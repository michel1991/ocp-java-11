##### The following diagram shows two reference variables pointing
##### to the same Bunny object in memory. The reference variable myBunny is of type Bunny,
###### while unknownBunny is a valid but unknown data type.
##### Which statements about the reference variables are true?
##### Assume the instance methods and variables shown in the diagram are marked public. (Choose three.)

* A. The reference type of unknownBunny must be Bunny or a supertype of Bunny.
* B. The reference type of unknownBunny cannot be cast to a reference type of Bunny.
* C. The reference type of unknownBunny must be Bunny or a subclass of Bunny.
* D. If the reference type of unknownBunny is Bunny, it has access to all of the same methods and variables as myBunny.
* E. The reference type of unknownBunny could be an interface, class, or abstract class.
* F. If the reference type of unknownBunny is Object, it has access to all of the same methods and variables as myBunny without a cast.

[image](images/myBunny_unknownBunny.jpg)
The reference type of unknownBunny must be Bunny or a supertype of Bunny,
including any abstract classes, concrete classes, or interfaces that Bunny inherits.
For this reason, options A and E are correct, and option C is incorrect.
Option B is incorrect. Since it already points to an instance of Bunny,
casting it to a Bunny reference is allowed. Option D is trivially true.
If the reference types of both are the same, then they can call the same instance members.
Option F is incorrect, as casting is required to access members declared in Bunny that are not defined in Object.

##### How many cells in the following table are incorrect?
* A. Zero
* B. One
* C. Two
* D. Three
* E. Four
[image](images/number_of_cell_with_errors.jpg)
A concrete class is not allowed to have abstract methods,
but the other two types are. This makes the second row in the first column incorrect.
All three types are allowed to have static final constants,
making the whole second column correct. In the last column,
there are two errors. An abstract class can have a constructor,
but an interface cannot. Note that an abstract class cannot be instantiated.
Instead, it requires a subclass.
This gives us a total of three incorrect cells, making option D the answer.


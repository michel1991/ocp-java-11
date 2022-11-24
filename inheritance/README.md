# Which statements about inheritance are correct? (Choose all that apply.)
A. A class can extend multiple interfaces.
B. Java supports multiple inheritance of parent classes.
C. A class inherits at most one class.
D. An interface may extend multiple interfaces.
E. A class can extend multiple classes.
F. A class can implement multiple interfaces.

Classes do not extend interfaces, but they can implement multiple interfaces, making option A incorrect and option F correct.
Java supports single inheritance of objects, making option B incorrect and option E incorrect.
While Java supports single inheritance, a class can inherit multiple classes.
For example, RuntimeException inherits Exception, which inherits Error, and finally Object.
For this reason, option C is incorrect.
An interface can extend multiple interfaces, making option D correct.
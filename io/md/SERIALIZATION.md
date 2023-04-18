###### An object has validation code in the constructor.
##### When deserializing an object, the constructor
##### is called with which of the following?
* A. readObject()
* B. readResolve()
* C. Both
* D. Neither

When deserializing an object, Java does not call the constructor.
Therefore, option D is correct.

### Which of the following are true statements about serialization in Java? (Choose all that apply.)
* A. Deserialization involves converting data into Java objects.
* B. Serialization involves converting data into Java objects.
* C. All nonthread classes should be marked Serializable.
* D. The Serializable interface requires implementing serialize() and deserialize() methods.
* E. Serializable is a functional interface.
* F. The readObject() method of ObjectInputStream may throw a ClassNotFoundException even if the return object is not cast to a specific type.

In Java, serialization is the process of turning an object to a stream,
while deserialization is the process of turning that stream back into an object.
For this reason, option A is correct, and option B is incorrect.
Option C is incorrect, because many nonthread classes
are not marked Serializable for various reasons.
The Serializable interface is a marker interface
that does not contain any abstract methods, making options D and E incorrect.
Finally, option F is correct, because readObject()
declares the ClassNotFoundException even if the class is not cast to a specific type.

##### What modifiers must be used with
##### the serialPersistentFields field in a class? (Choose all that apply.)
* A. final
* B. private
* C. protected
* D. public
* E. transient
* F. static

The serialPersistentFields field is used to specify
which fields should be used in serialization.
It must be declared private static final, or it will be ignored.
Therefore, options A, B, and F are correct.


### What are the bestscenarios for customizing the serialization process? (Choose two.)
*  A. To prevent SQL injection.
*  B. To shuffle data among users.
*  C. It is the only way to prevent a sensitive field like birthdate from being written to disk.
*  D. To improve performance by applying advanced optimization techniques.
*  E. To encrypt a password before it is saved to disk.
*  F. To customize the handling of certain user sensitive data like a Social Security number.

Encrypting or customizing the handling of certain sensitive fields
are good reasons to customize the serialization process via methods,
making options E and F correct. Options A, B, and D
are invalid and are not reasons to customize the process.
Option C is incorrect as the transient modifier or serialPersistentFields
can be used to exclude fields from serialization
without the need to add any serialization methods.

### What are the requirements for a class that you want to serialize to a stream? (Choose all that apply.)
*  A. The class must be marked final.
*  B. The class must extend the Serializable class.
*  C. The class must declare a static serialVersionUID variable.
*  D. All static members of the class must be marked transient.
*  E. The class must implement the Serializable interface.
*  F. All instance members of the class must be serializable or marked transient.

For a class to be serialized, it must implement the Serializable interface and contain instance members
that are serializable or marked transient. For these reasons, options E and F are correct.
Marking a class final does not impact its ability to be serialized,
so option A is incorrect. Option B is incorrect, as Serializable is an interface, not a class.
Option C is incorrect. While it is a good practice
for a serializable class to include a static serialVersionUID variable,
it is not required. Finally, option D is incorrect
as static members of the class are ignored on serialization already.

#### Which classes are least likely to be marked Serializable. (Choose two.)
* A. A class that monitors the state of every thread in the application
* B. A class that holds data about the amount of rain that has fallen in a given year
* C. A class that manages the memory of running processes in an application
* D. A class that stores information about apples in an orchard
* E. A class that tracks the amount of candy in a gumball machine
* F. A class that tracks which users have logged in

Generally speaking, classes should be marked with the Serializable
interface if they contain data that we might want to save and retrieve later.
Options B, D, E, and F describe the type of data that we would want
to store over a long period of time. Options A and C, though,
define classes that manage transient or short-lived data.
Application processes change quite frequently,
and trying to reconstruct a process is often considered a bad idea.


##### During deserialization from an I/O stream, which element
##### of the class can be used to assign a value to the deserialized object?
* A. Variable initializer
* B. Instance initializer
* C. Static initializer
* D. Constructor
* E. The restoreObject() method
* F. None of the above

When data is deserialized, none of variable initializers,
instance initializers, or constructors is called. The class can have static initializers,
but they are not called as part of deserialization.
Finally, there is no restoreObject() method that is used in standard deserialization.
For these reasons, option F is correct.


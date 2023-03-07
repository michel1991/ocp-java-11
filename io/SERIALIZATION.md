### An object has validation code in the constructor. When deserializing an object, the constructor is called with which of the following?
* A. readObject()
* B. readResolve()
* C. Both
* D. Neither

When deserializing an object, Java does not call the constructor. Therefore, option D is correct.

### Which of the following are true statements about serialization in Java? (Choose all that apply.)
* A. Deserialization involves converting data into Java objects.
* B. Serialization involves converting data into Java objects.
* C. All nonthread classes should be marked Serializable.
* D. The Serializable interface requires implementing serialize() and deserialize() methods.
* E. Serializable is a functional interface.
* F. The readObject() method of ObjectInputStream may throw a ClassNotFoundException even if the return object is not cast to a specific type.

In Java, serialization is the process of turning an object to a stream, while deserialization is the process of turning that stream back into an object.
For this reason, option A is correct, and option B is incorrect.
Option C is incorrect, because many nonthread classes are not marked Serializable for various reasons.
The Serializable interface is a marker interface that does not contain any abstract methods, making options D and E incorrect.
Finally, option F is correct, because readObject() declares the ClassNotFoundException even if the class is not cast to a specific type.

### What modifiers must be used with the serialPersistentFields field in a class? (Choose all that apply.)
* A. final
* B. private
* C. protected
* D. public
* E. transient
* F. static

The serialPersistentFields field is used to specify which fields should be used in serialization.
It must be declared private static final, or it will be ignored. Therefore, options A, B, and F are correct.


### What are the bestscenarios for customizing the serialization process? (Choose two.)
*  A. To prevent SQL injection.
*  B. To shuffle data among users.
*  C. It is the only way to prevent a sensitive field like birthdate from being written to disk.
*  D. To improve performance by applying advanced optimization techniques.
*  E. To encrypt a password before it is saved to disk.
*  F. To customize the handling of certain user sensitive data like a Social Security number.

Encrypting or customizing the handling of certain sensitive fields are good reasons to customize the serialization process via methods,
making options E and F correct. Options A, B, and D are invalid and are not reasons to customize the process.
Option C is incorrect as the transient modifier or serialPersistentFields
can be used to exclude fields from serialization without the need to add any serialization methods.
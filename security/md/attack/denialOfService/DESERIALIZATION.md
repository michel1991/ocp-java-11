#### Which of the following activities are potential targets of denial of service attacks?

* A. Printing low level exception messages from infrstructural libraries in log files.
    This is a potential concern for security of confidential information.
    Guideline 2-1 / CONFIDENTIAL-1: Purge sensitive information from exceptions

* B. Sloppy format validation for input values.
Textual input values should be checked thoroughly for valid format. This is a well know cause of injection attacks.

Guideline 3-1 / INJECT-1: Generate valid formatting
Attacks using maliciously crafted inputs to cause incorrect formatting of outputs are well-documented [7].
Such attacks generally involve exploiting special characters in an input string, incorrect escaping, or partial removal of special characters

* C. Allowing any one to create instances of a class by making the class's constructors public.
During construction objects are at an awkward stage where they exist but are not ready for use.
Such awkwardness presents a few more difficulties in addition to those of ordinary methods.

Guideline 7-1 / OBJECT-1: Avoid exposing constructors of sensitive classes
Construction of classes can be more carefully controlled if constructors are not exposed.
Define static factory methods instead of public constructors.
Support extensibility through delegation rather than inheritance.
Implicit constructors through serialization and clone should also be avoided.

* D. Not defining the serialPersistentFields array field appropriately for a Serializable class.
    This affects the security of sensitive information.
    
    Guideline 8-2 / SERIAL-2: Guard sensitive data during serialization
    Once an object has been serialized the Java language's access controls
    can no longer be enforced and attackers can access private fields in an object by analyzing its serialized byte stream.
    Therefore, do not serialize sensitive data in a serializable class.
    
    Approaches for handling sensitive fields in serializable classes are:
    
    Declare sensitive fields transient
    Define the serialPersistentFields array field appropriately
    Implement writeObject and use ObjectOutputStream.putField selectively
    Implement writeReplace to replace the instance with a serial proxy
    Implement the Externalizable interface

* E. Java deserialization and Java Beans XML deserialization of data.
    Guideline 1-1 / DOS-1: Beware of activities that may use disproportionate resources

    Java deserialization and Java Beans XML deserialization of malicious data may result in unbounded memory or CPU usage


Correct(E)

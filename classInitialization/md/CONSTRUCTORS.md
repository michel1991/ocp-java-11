### Which of the following are true about the "default" constructor?

* A. It is provided by the compiler only if the class and any of its super classes does not define any constructor.
    It is provided by the compiler if the class does not define any constructor.
    It is immaterial if the super class provides a constructor or not.
* B. It takes no arguments.
* C. A default constructor is used to return a default value.
        A constructor does not return any value at all. It is meant to initialize the state of an object.
* D. To define a default constructor, you must use the default keyword.
* E. It is always public.
The access type of a default constructor is same as the access type of the class.
Thus, if a class is public, the default constructor will be public.
Note that you can only use private and protected access modifers
for nested classes only (and not for package level classes).

The default constructor is provided by the compiler only when a class does not define
ANY constructor explicitly. For example,
``` java
public class A{
    public A()  // This constructor is automatically inserted by the compiler 
    //because there is no other constructor defined by the programmer explicitly.
    {

        //Note that it calls the super class's default no-args constructor.
        super();  // 
    }
}

public class A{
    // Compiler will not generate any constructor 
    //because the programmer has defined a constructor.
    public A(int i){
        // do something
    }
}
``` 

(Correct is B)

### Which of these statements are true?

* A. A super( <appropriate list of arguments> ) or this( <appropriate list of arguments> ) call must always be provided explicitly as the first statement in the body of the constructor.
    super(); is automatically added if the sub class constructor doesn't call any of the super class's constructors.
* B. If a subclass does not have any declared constructors, the implicit default constructor of the subclass will have a call to super( ).
* C. If neither super( ) or this( ) is declared as the first statement of the body of a constructor, then this( ) will implicitly be inserted as the first statement.
    super() is added and not this()
* D. super(<appropriate list of arguments>) can only be called in the first line of the constructor but this(<appropriate list of arguments>) can be called from anywhere.
* E. You can either call super(<appropriate list of arguments>) or this(<appropriate list of arguments>) but not both from a constructor.
    
Note that calling super(); will not always work because if the super class has defined a constructor
with arguments and has not defined a no args constructor then no args constructor will not be provided by the compiler.
It is provided only to the class that does not define ANY constructor explicitly.

(Correct B, E)
            
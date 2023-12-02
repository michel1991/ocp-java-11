### Which of the following are meta-annotations?

* A. @Repeatable
* B. @Retention
* C. @SafeVarargs
* D. @Target
* E. @FunctionalInterface
    It is defined with @Retention(RUNTIME)

A functional interface must have exactly one abstract method.
Remember that methods of the java.lang.Object class do not count
towards the number of abstract methods of an interface.
So, for example, the following is still a valid functional
interface even though it has three abstract method declarations:
```java
    @FunctionalInterface
    public interface FI{
        int m1(); //valid abstract method
        boolean equals(Object o); //valid declaration
        //but it does not count towards the number of abstract methods
        String toString(); //valid declaration
        //but it does not count towards the number of abstract methods
    }
``` 

It is not necessary to apply the @FunctionalInterface annotation
to a functional interface but it is recommended to do so because
doing so enables IDEs and compilers to generate error message
if the interface does not satisfy the requirements of functional interface

Annotations that apply to other annotations are called meta-annotations.
These annotations are used when you create your own new annotations.
(They are defined with @Target(ANNOTATION_TYPE) .
Therefore, they can only be used on annotations themselves.)

There are several meta-annotation types defined in java.lang.annotation.
The ones you should be aware of for the exam are - @Retention, @Documented, @Target, @Inherited, and @Repeatable

Example:
```java
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    public @interface DBField { //creating a new annotation named DBField
        public String value() default "";
    }
``` 

(Correct A, B, D)
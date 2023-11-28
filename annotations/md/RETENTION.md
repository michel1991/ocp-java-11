#### Which of the following annotations are retained for run time?
* A. @SuppressWarnings
    It is defined with @Retention(SOURCE)
* B. @Override
    It is defined with @Retention(SOURCE)
* C. @SafeVarargs
    It is defined with @Retention(RUNTIME)
* D. @FunctionalInterface
    A functional interface must have exactly one abstract method.

    Remember that methods of the java.lang.Object class do not count towards the number of
    abstract methods of an interface. So, for example, the following is still
    a valid functional interface even though it has three abstract method declarations:

    ```java
    @FunctionalInterface
    public interface FI{
        int m1(); //valid abstract method
        boolean equals(Object o); //valid declaration,
        //but it does not count towards the number of abstract methods
    
        String toString(); //valid declaration,
        //but it does not count towards the number of abstract methods
    }
    ```

    It is not necessary to apply the @FunctionalInterface annotation to a functional
    interface but it is recommended to do so because doing so enables IDEs and compilers
    to generate error message if the interface does not satisfy the requirements of functional interface.
* E. @Deprecated
   It is defined with @Retention(RUNTIME)


(correct C, D? E)
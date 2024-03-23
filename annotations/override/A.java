package annotations.override;

/**
 * Given the following class which intends to customize the logic for equals method:
   A. @Override should be applied at //1.
   B.  Applying @Override at //1 will cause compilation failure.
   C. There is no need to apply @Override at //1.
   D. A warning will be generated if @Override is not applied at //1.
   
   E.  @SuppressWarnings("override") should be applied at //1.
       "override" is not a valid argument for @SuppressWarnings.
        As per JLS 11 section 9.6.4.5, @SuppressWarnings must support three values: unchecked, deprecation, and removal.
        However, it is not an error if you use a value that is not supported by the compiler. A compiler simply ignores it.
        Different compilers may support more values.
        For example, Oracle's javac compiler supports a large number of values (https://docs.oracle.com/en/java/javase/11/tools/javac.html ) .
        The ones that you should be aware of for the exam are: none, rawtypes, serial, and varargs.
        
        This annotation is not repeatable. Therefore, you cannot use it twice on the same type.
        However, you can specify multiple values like this:
        @SuppressWarnings({"deprecation", "unchecked"})
     
  
 Since the code intends to override the equals method of the Object class, @Override annotation should be applied.
 However, the given implementation does not correctly override the equals method of the Object class
 (the arugment to equals should be of type Object and not A). Thus, the compiler will generate an error.

    As per JLS 9.6.4.4 @Override
    Programmers occasionally overload a method declaration when they mean to override it, leading to subtle problems.
    The annotation type Override supports early detection of such problems.
    The classic example concerns the equals method. Programmers write the following in
    class Foo :
    public boolean equals(Foo that) { ... }
    when they mean to write:
    public boolean equals(Object that) { ... }
    This is perfectly legal, but class Foo inherits the equals implementation from Object, which can cause some subtle bugs.
    Add/Edit Note
 */
class A{
    private String s;
    //1
    public boolean equals(A a){ //override the equals methods
        return this.s != null && this.s.equals(a.s);
    }
}
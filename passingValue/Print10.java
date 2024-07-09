package passingValue;

/**
   What will the following program print?
   
    A. 10
    B. 20
    C. It will not compile.
    D. It will throw an exception at runtime.
    E. None of the above.
    
    ---------------------
    In case of primitives such as an int, it is the value of the primitive that is passed.
    For example, in this question, when you pass someInt to changeIt method,
    you are actually passing the value 10 to the method, which is then assigned to method variable 'a'. In the method, you assign 20 to 'a'.
    However, this does not change the value contained in someInt. someInt still contains 10. Therefore, 10 is printed.

    Theoretically, java supports Pass by Value for everything ( i.e. primitives as well as Objects).
    
    Remember that:
    1. Primitives are always passed by value.
    2. Object "references" are passed by value. So it looks like the object is passed by reference
    but actually it is the value of the reference that is passed.
    
            An  example:
          Object o1 = new Object();
    
    Let us say, this object is stored at memory location 15000.  Since o1 actually stores just the address
    of the memory location where the object is stored, it contains 15000.
    
    Now, when you call someMethod(o1); the value 15000 is passed to the method.  Therefore, this is what happens inside the method someMethod():
    
    
           someMethod( Object localVar) {
    localVar now contains 15000, which means localVar also points to the same memory location where the object is stored.
    Therefore, when you call a method on localVar, it will be executed on the same object.
    
    However, when you change the value of localVar itself, for example, if you do localVar=null,
    then localVar starts pointing to a different memory location.
    But the original variable o1 still  contains 15000 so it still points to the same object.
            }
    
    If you need even more detailed explanation, please check http://www.javaranch.com/campfire/StoryPassBy.jsp
    
    Correct(A)

 */
class TestClass{ // public
    static int someInt = 10;
    public static void changeIt(int a){
      a = 20;
    }
    public static void main(String[] args){
      changeIt(someInt);
      System.out.println(someInt);
    }
  }
public class Print10 {
    public static void main(String[] args){
        TestClass.main(args);
      }
}
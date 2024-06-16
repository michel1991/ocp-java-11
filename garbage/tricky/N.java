package garbage.tricky;
/**
   Given:
   
    Assuming that System.gc() does its job, what will be printed?
     
     A. null
     B.
       It will throw a NullPointerException at run time.
       ------
        It is important to understand that garbage collection doesn't set the references that are "in scope" i.e.
        the references that you can access, to null. In fact, if you are able to access a reference, then, by definition,
        the object pointed to by that reference is NOT garbage! So, you will almost NEVER get a NullPointerException because of garbage collection.
        (There is a category of references called "soft references", which do not prevent an object from being collected
        and such references may become null after garbage collection.
        This is a very advanced topic and is not required for either OCP Part 1 or Part 2 exam.)
        
     C. hello
     D. It will thrown an IllegalAccessException at run time.

     E. It will not compile.

     ------------------
     Note that objects pointed to by static variables of a class are not collected even when all objects
     of that class are collected because those variables belong to the class (and not to the instance of the class).
     They are GCed only when the class itself is unloaded by the class loader.

    In the given code, m is an instance variable of class N. So, when an object of class N is garbage collected,
    the object pointed to by its instance variable is also liable to be garbage collected if there are no other references to that object.
    Therefore, here, the object refered to by the variable n and the object referred to by the variable n.m, will be garbage collected.
    
    However, obj is a static variable of class M. The object referred to by obj will not be garbage collected because the static variable
    remains in scope as long as the class M remains loaded by the classloader.
    
      Correct(C)
 */
class M {
    static Object obj = null;
    public M(String val){ obj = val; }
 }
 
 class N{
 
    private M m = new M("hello");
 
    public static void main(String[] args){
       N n = new N();
       n = null;
       System.gc();
       System.out.println(M.obj);
    }
 }
package generics.tricky;

/**
   Given:

    class MyGenericClass<T>{
        public <T> String transform(T t){
            return t.toString()+"-"+t.hashCode();
        }
    }

    and the following code snippet:

    MyGenericClass gc = new MyGenericClass();
    System.out.println(gc.transform(1)); //1
    System.out.println(gc.transform("hello")); //2
    MyGenericClass<String> gcStr = new MyGenericClass<String>();
    System.out.println(gcStr.transform(1.1)); //3
    
    
    What will it print when compiled and run?
    
    A. Compilation failure at //1
    B. Compilation failure at //1 and //2
    C. Compilation failure at //1, //2, and //3
    D. Compilation failure at //3
    E.
        1-1
        hello-<some hashcode value>
        1.1--<some hashcode value>
    F. An exception will be thrown at run time.
    
    -----------------------------------
     The cause of confusion in the given code is the presence of <T> in the class declaration as well as in the method declaration.
     You need to know that the two generic type variables are independent of each other.
     This means that the <T> in MyGenericClass<T> has no relation to the <T> in public <T> String transform(T t).
    
    Thus, when if you type a MyGenericClass object to String using MyGenericClass<String>, that doesn't mean the transform method is also typed to String.
     The T in transform method will be typed as per the type of the argument passed to this method.
    
    Therefore, when you call gcStr(1.1), T is typed to Double for the purpose of this method (even though T is typed to String for the class).
     Ideally, one should use different names for different types to avoid confusion. For example:
    
    class MyGenericClass<T>{
        T t;
        public <P> String transform(P p){ //<-Using a different name P here instead of T
            //this.t = p; //will NOT compile
            return p.toString()+"-"+p.hashCode();
        }
    }
    
    
    If you want to use the same type that is used for the class, then you should not redeclare it for the method. For example:
    
    class MyGenericClass<T>{
        T t;
        public String transform(T t){   //<-- removed <T> from this line
            this.t  =  t; //valid because T is same for the class and for the method
    
        //now t is same as the type used for the class
            return t.toString()+"-"+t.hashCode();
        }
    } 
   Correct(E)
 */
public class MyGenericClass<T> {
    public <T> String transform(T t){
            return t.toString()+"-"+t.hashCode();
    }
    
    public static void main(String...args){
        MyGenericClass gc = new MyGenericClass();
        System.out.println(gc.transform(1)); //1
        System.out.println(gc.transform("hello")); //2
        MyGenericClass<String> gcStr = new MyGenericClass<String>();
        System.out.println(gcStr.transform(1.1)); //3
    }
}
package lambda.tricky;

/**
   What will the following code print when run?
   A.  It will fail to compile at line marked //1
        No problem here. A lambda expression can use a local variable if that variable is final or effectively final.
        Here, e is not being changed anywhere in the code (it keeps pointing to the same
        Employee object throughout, although the fields values do change) and is therefore effectively final.
   B. It will fail to compile at line marked //3
        No reason for any failure here.
   C. It will print 40.
        Observe that at line //2, e.age is being set to 50. However,
        at line //3, the lambda expression defined at line //1 is executed.
        It changes e.age to 40.
      So, even though, visually, e.age=50 appears in the code after e.age=40, it is actually executed before e.age=40.
    D. It will print 50.
    E. It will throw an exception at run time.
    
    Correct( C)
 */
import java.util.function.*;
class Employee{
    int age;   
}


public class EmployeTestCase {
    public static void main(String[] args) {
        Employee e = new Employee();
        Supplier<Employee> se = ()->{ e.age = 40; return e; }; //1
        e.age = 50;//2
        System.out.println(se.get().age); //3
    }
}
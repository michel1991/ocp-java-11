package annotations.suppressWarnings;
import java.util.*;

/**
 * Given :

    //1
    public class TestClass {
    //2
        public static void main(String[] args) throws Exception{
            var al = new ArrayList<Integer>();
            printElements(al);
        }
    
    //3
        static void printElements(List<Integer>... la) {
            for(List<Integer> l : la){
                System.out.println(l);
            }
        }
    }
    
    Which option(s) will get rid of compilation warning(s) for the above code?
    
    A. Apply @SuppressWarnings("all") at //1
    Although you can pass any string value to the SuppressWarnings annotation (unrecognized values are ignored),
    the Java specification mandates only three values - unchecked, deprecation, and removal. Different compilers and
    IDEs may support other values in addition to these three.
    
    In this particular case, "all" is not a valid argument for @SuppressWarnings. @SuppressWarnings("unchecked") will work.
    
    Applying @SuppressWarnings("unchecked") on the class suppresses all unchecked warnings from that class.
    Note that the set of warnings suppressed in a given element is a superset of the warnings suppressed in all containing elements.
    For example, if you annotate a class to suppress one warning and annotate a method to suppress another,
    both warnings will be suppressed in the method. However, note that if a warning is suppressed in a module-info file,
    the suppression applies to elements within the file and not to types contained within the module.
    
    As a matter of style, programmers should always use this annotation on the most deeply nested element where it is effective.
    If you want to suppress a warning in a particular method, you should annotate that method rather than its class.
    
    B. Apply @SuppressWarnings("unchecked") at //2
    C. Apply @SuppressWarnings("rawtypes") at //2
    D. Apply @SuppressWarnings("rawtypes") at //3
        The "rawtypes" warning is issued when you use a parameterized class without a type parameter.
        For example, List al = new ArrayList();.
        Here, List and ArrayList are parameterized classes and you should specify the type parameter in the declaration and instantiation i.e.
        List<String> al = new ArrayList<>();
        
        The "unchecked" warning is issued where a compiler is not able to check the type safety of the operation. For example:
        
        List al = new ArrayList(); //rawtypes warning here
        al.add(""); //unchecked warning here
        
    E.Apply @SuppressWarnings("unchecked") at //2 as well as //3.
      Any time you invoke a method or declare a method that uses varargs with a generic type, you will get an "unchecked" warning.
      Thus, @SuppressWarnings("unchecked') would be issued because of the call to printElements(al)
      in main and the declaration of the printElements method.
      
   F. Apply @SuppressWarnings("rawtypes") at //2 as well as //3.
   Correct(E)
    
       
 */

//1
public class TestClass {
//2
  @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception{
        var al = new ArrayList<Integer>();
        printElements(al);
    }

//3
 @SuppressWarnings("unchecked")
    static void printElements(List<Integer>... la) {
        for(List<Integer> l : la){
            System.out.println(l);
        }
    }
}
package collections.lists.uncheckedOrUnsafe;
import java.util.*;

public class DoElements {
    /**
     * Consider the following code:
       A. Line //1 will cause the compile to generate "unchecked or unsafe" warning,
       which can be removed using@SuppressWarnings("unchecked")

      B.  Line //2 will cause the compile to generate "unchecked or unsafe" warning,
          which can be removed using @SuppressWarnings("unsafe")

      C.  Both the lines //1 and //2 will cause the compile to generate "unchecked or unsafe" warning,
        which can be removed using @SuppressWarnings()
        Remember that @SuppressWarnings annotation requires at least one string argument.

      D.  Neither of the lines //1 and //2 will cause the compile to generate "unchecked or unsafe" warning.
      
      Compiler generates the "unchecked or unsafe operations" warning when
      it notices the possibility of a collection getting corrupt due to insertion of incompatible elements.
      In the given code, since the variable l uses a raw List, the compiler cannot know what kind of elements
      this list is supposed to contain. So, when you try to add a String to it,
      the compiler thinks that this might corrupt the list and generates a warning.
      
     If you are sure that it is ok to add strings to this list, you can apply @SuppressWarnings("unchecked")
     to the method to suppress this warning.

      l.get(0) simply returns the element from the list and has no impact on the list itself and doesn't cause any warning.

      (Correct A)
     */
    static void doElements(List l) {
        l.add("string"); //1
        System.out.println(l.get(0)); //2
    }

    public static void main(String... args){
        
    }
}
package collections.lists.tricky;
import java.util.function.*;
import java.util.*;

public class SubListMethod {
    /**
     What will the following code print?
      A. iou
      B.  io
      C.  ou
      D.  ei
      E.  aeiou
      F.  Compilation error
      
      There is no problem with the code.
        The List.subList method returns a view backed by the original list.
        It doesn't change the existing list. Therefore, when you print the elements from the original
        list after calling subList, you will see all the elements of the original list.
        
        Remember that, however, if you modify the sub list, the changes will be visible in the original list.
         For example, the following will print aeioxu:
        List<String> view = f.apply(vowels);//get a view backed by the original list
        view.add("x");//modify the view
        vowels.forEach(System.out::print); //updates visible in original list
        
      (Correct E)
      

     */
    public static void  returnsAViewBackedByTheOriginalList(){
        List<String> vowels = new ArrayList<String>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
        Function<List<String>, List<String>> f = list->list.subList(2, 4);
        f.apply(vowels);
        vowels.forEach(System.out::print);
    }
    
    public static void main(String...args){
        returnsAViewBackedByTheOriginalList();
    }
}
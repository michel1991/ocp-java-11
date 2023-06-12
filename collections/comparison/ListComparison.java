package list.comparison;
import java.util.*;

class ListComparison{

    /**
     * Fill in the blank so the code prints gamma. (Choose two.)
        A. (s, t) -> s.compareTo(t)
        B. (s, t) -> t.compareTo(s)
        C. Comparator.comparing((String s) -> s.charAt(0))
        D. Comparator.comparing((String s) -> s.charAt(0)).reverse()
        E. E. Comparator.comparing((String s) -> s.charAt(0)).reversed()

        The goal is to write code that sorts in descending order.
        Option A sorts ascendingly and option B sorts descendingly.
        Similarly, option C sorts ascendingly and option E sorts descendingly.
        Option D attempts to call the reverse() method, which is not defined.

     */
    static void choiceComparatorsOne(){
        var list = Arrays.asList("alpha", "beta", "gamma");
        Collections.sort(list, (s, t) -> t.compareTo(s) ); //________________ (s, t) -˃ t.compareTo(s)
        System.out.println(list.get(0));
    }

   public static void main(String... args){
     System.out.println("reverse alphabetical");
     System.out.println();
   }
}

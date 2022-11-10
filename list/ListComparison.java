package list;
import java.util.*;


class MyComparator implements Comparator<String> {
    /**
    * The array is sorted using MyComparator, which sorts the elements in reverse alphabetical order in a case-insensitive fashion.
    * Normally, numbers sort before letters. This code reverses that by calling the compareTo() method on b instead of a.
     */
    public int compare(String a, String b) {
        return b.toLowerCase().compareTo(a.toLowerCase());
    }

    static String[] reverseAlphabetical(){
        String[] values = { "123", "Abb", "aab" };
        Arrays.sort(values, new MyComparator());
        return values;
    }
}

class ListComparison{
    /**
    * This code has a double negative. The code c2.compareTo(c1) sorts in descending order. However,
    * the negative sign before it switches to ascending order. Since uppercase sorts before lowercase, option B is correct.
     */
   public static void ascendingUpperCaseFirst(){
      List<String> cats = new ArrayList<>();
      cats.add("leo");
      cats.add("Olivia");

      cats.sort((c1, c2) -> -c2.compareTo(c1)); // line X
      System.out.println(cats);
    }

   public static void main(String... args){
     ascendingUpperCaseFirst();
     var result = MyComparator.reverseAlphabetical();
     System.out.println("reverse alphabetical");
     System.out.println(Arrays.asList(result));
   }
}

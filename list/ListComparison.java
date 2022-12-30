package list;
import java.util.*;


class MyComparator implements Comparator<String> {
    /**
       What is the result of the following program?
        A. Abb aab 123
        B. aab Abb 123
        C. 123 Abb aab
        D. 123 aab Abb
        E. The code does not compile.
        F. A runtime exception is thrown.

       The array is sorted using MyComparator, which sorts the elements in reverse alphabetical order in a case-insensitive fashion.
       Normally, numbers sort before letters. This code reverses that by calling the compareTo() method on b instead of a.
     */
    public int compare(String a, String b) {
        return a.toLowerCase().compareTo(a.toLowerCase());
    }

    static String[] reverseAlphabetical(){
        String[] values = { "123", "Abb", "aab" };
        Arrays.sort(values, new MyComparator());
        return values;
    }
}

class ListComparison{
    /**
      What is the output of the following code?
      
        A. [leo, Olivia]
        B. [Olivia, leo]
        C. The code does not compile because of line X.
        D. The code does not compile for another reason.
        E. A runtime exception is thrown.
        
        This code has a double negative. The code c2.compareTo(c1) sorts in descending order. However,
        the negative sign before it switches to ascending order. Since uppercase sorts before lowercase, option B is correct.
     */
   public static void ascendingUpperCaseFirst(){
      List<String> cats = new ArrayList<>();
      cats.add("leo");
      cats.add("Olivia");

      cats.sort((c1, c2) -> -c2.compareTo(c1)); // line X
      System.out.println(cats);
    }

    /**
    *  Which can fill in the blank so the code prints 2?
    *   A. copy
        B. list
        C. newList
        D. The code does not compile with any of these options.
        E. A runtime exception is thrown with any of these options.
        F. None of the above. The code prints an index other than 2 with one or more of these options.

        The List is sorted and searched using a custom comparator, which does reverse-case insensitive order, which sorts to [bd, ba, ab, aa].
        The index of ab is 2 since indexes start with 0.
        However, list and copy are immutable, which means they throw an UnsupportedOperationException when you try to sort them.
        Option C is a mutable list and therefore the correct answer.
     */
    static void choiceCorrectReferenceToReverseOrder(){
        var list = List.of("ab", "ba", "bd", "aa");
        var copy = List.copyOf(list);
        var newList = new ArrayList<String>(copy);

        var candidate =  newList ; // _____________

        Comparator<String> comparator = Comparator.reverseOrder();
        Collections.sort(candidate, comparator);
        int index = Collections
                .binarySearch(
                candidate,
                "ab",
                comparator
        );
        System.out.println("Begin choice Correct Reference To Reverse order");
        System.out.println("\t" + index);
        System.out.println("End  choice Correct Reference To Reverse order");

    }

    /**
    * What is the result of the following code? (Choose all that apply.)
    *   A. One or more of the comparators can fill in the blank so that the code prints 0.
        B. One or more of the comparators can fill in the blank so that the code prints 1.
        C. One or more of the comparators can fill in the blank so that the code prints 2.
        D. The result is undefined regardless of which comparator is used.
        E. A runtime exception is thrown regardless of which comparator is used.
        F. The code does not compile.

        When using binarySearch(), the List must be sorted in the same order that the Comparator uses.
        Since the binarySearch() method does not specify a Comparator explicitly, the default sort order is used.
        Only c2 uses that sort order and correctly identifies that the value 2 is at index 0.
        Therefore, option A is correct.
        The other two comparators sort in descending order.
        Therefore, the precondition for binarySearch() is not met, and the result is undefined for those two.
     */
    static  void choiceCorrectComparators(){
        Comparator<Integer> c1 = (o1, o2) -> o2 - o1;
        Comparator<Integer> c2 = Comparator.naturalOrder();
        Comparator<Integer> c3 = Comparator.reverseOrder();

        var list = Arrays.asList(5, 4, 7, 2);
        Collections.sort(list, c2); //  ________
        System.out.println(Collections.binarySearch(list, 2));
    }

   public static void main(String... args){
     ascendingUpperCaseFirst();
     var result = MyComparator.reverseAlphabetical();
     System.out.println("reverse alphabetical");
     System.out.println(Arrays.asList(result));
     System.out.println();
     choiceCorrectReferenceToReverseOrder();
   }
}

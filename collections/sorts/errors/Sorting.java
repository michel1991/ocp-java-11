package collections.sorts.errors;
import java.util.*;

/**
  *  What is the result of the following code?
    A. [4, 5, 7]
    B. [5, 4, 7]
    C. [7, 5, 4]
    D. The code does not compile due to the implementation of compare().
    E. A runtime exception is thrown.
    F. None of the above.

    Lizard implements Comparator, not Comparable.
    To sort a List without specifying a Comparator, it needs to be Comparable.
    This causes a compiler error when calling the sort() method. The compare() method does compile.
    Creating a custom Comparator and calling it is overkill to compare numbers, but it does work.

 */
public class Sorting {
    static class Lizard implements Comparator<Lizard> { //  4:
        private int weight; //  5:
        //6:
       // Assume getters/setters/constructors provided  7:
    
    public Lizard(int weight){
        this.weight = weight;
    }
    
    public int getWeight(){
        return weight;
    }
    
     // 8:
        public int compare(Lizard x, Lizard y) { // 9:
            return Comparator.comparing(Lizard::getWeight) //  10:
            .compare(x, y); //  11:
        } //  12:
    public String toString() { return "" + weight; } //  13:
    } //  14:
    public static void main(String[] args) { // 15:
        List<Lizard> list = new ArrayList<>(); // 16:
        list.add(new Lizard(5)); // 17:
        list.add(new Lizard(4)); // 18:
        list.add(new Lizard(7)); //  19:
        Collections.sort(list); //   20:
        System.out.println(list); //  21:
    }  //  22:
}
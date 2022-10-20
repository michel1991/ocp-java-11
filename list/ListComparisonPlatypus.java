package list;
import java.util.*;

/**
* We’re looking for a Comparator definition that sorts in descending order by beakLength. Option A is incorrect because it sorts in ascending order
*  by beakLength. Similarly, option C is incorrect because it sorts the beakLength in ascending order within those matches that have the same name.
*  Option E is incorrect because there is no thenComparingNumber() method.
*   Option B is a correct answer, as it sorts by beakLength in descending order.
*   Options D and F are trickier. First notice that we can call either thenComparing() or thenComparingInt() because
*    the former will simply autobox the int into an Integer. Then observe what reversed() applies to.
*    Option D is incorrect because it sorts by name in ascending order and only reverses the beak length of
*   those with the same name. Option F creates a comparator that sorts by name in ascending order and then by beak size in ascending order.
* Finally, it reverses the result. This is just what we want, so option F is correct.
 */
public class ListComparisonPlatypus {
    static class Platypus{
        String name;
        int beakLength;

        public Platypus(String name, int beakLength){
            this.name = name;
            this.beakLength = beakLength;
        }

        public String getName(){
            return name;
        }

      public int getBeakLength(){
            return beakLength;
        }

         public String toString() {
             return  "name= " + name + " beakLength = " + beakLength;
         }
    }

    static List<Platypus> getList(){
        Platypus p1 = new Platypus("Paula", 3);
        Platypus p2 = new Platypus("Peter", 5);
        Platypus p3 = new Platypus("Peter", 7);
        List<Platypus> list = Arrays.asList(p1, p2, p3);

        return list;
    }

    static public void answerD(){
        List<Platypus> list = getList();
        Collections.sort(list,
                         Comparator.comparing(Platypus::getName)
                         .thenComparing(
                                 Comparator.comparing(Platypus::getBeakLength).reversed()
                         )
        );
        System.out.println("answer D incorrect ");
        System.out.println(list);
    }

    public static void answerF(){
        List<Platypus> list = getList();
        Collections.sort(list,
                         Comparator.comparing(Platypus::getName)
                         .thenComparingInt(Platypus::getBeakLength)
                        .reversed()
        );
        System.out.println("answer F correct ");
        System.out.println(list);
    }

      public static void main(String[] args) {
        // correct expected [7, 5, 3]
              answerD();
              System.out.println();
              answerF();
       }
}
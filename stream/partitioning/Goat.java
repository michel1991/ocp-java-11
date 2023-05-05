package stream.partitioning;

/**
 * What is the output of the following?
    A. canshorts
    B. hay
    C. hayhay
    D. shortscan
    E. The code does not compile.
    F. The code compiles but throws an exception at runtime.

 This code contains three stream pipelines for the price
  of one! Lines 16–17 are the first pipeline.
  They group the four Goat instances by the type of food they eat.
  This creates a Map with the elements {hay=[hay, hay], can=[can], shorts=[shorts]}.
  Lines 19–22 are the second pipeline.
  This one starts by only including elements that have two matches, in our case hay.
  We then use the String key Goat.
  Finally, this pipeline partitions the single key based
  on whether it has any characters giving us {false=[hay], true=[]}.
  On line 23, we get just one of the lists leaving us with [hay].
  The final pipeline is lines 24–26. It sorts the single element
  in an attempt to confuse you and then prints it.
  Therefore, only one hay is printed, and option B is the answer.


 */
import static java.util.stream.Collectors.*; // 1: 
 import java.util.*; // 2: 
// 3:
public class Goat { // 4:
    private String food; //     5:  
   // 6:    
//7:     // constructor, getter and toString
   
    public Goat(String theFood){
         food = theFood;
    }
    
    public String getFood(){
        return  food ;
    }
    
    public String toString(){
        return food;
    }
    
//8:
  public static void main(String[] args) { // //9:   
      var goats = List.of( // 10: 
              new Goat("can"), //   11: 
              new Goat("hay"), //  12:  
              new Goat("shorts"), //     13:  
              new Goat("hay")); //      14:   
        //15:
       goats.stream() // 16: 
         .collect(groupingBy(Goat::getFood)) //   17:   
         .entrySet() //     18: 
          .stream() //    19: 
        .filter(e -> e.getValue().size() == 2) //     20:  
         .map(e -> e.getKey()) //     21: 
             .collect(partitioningBy(e -> e.isEmpty())) // 22: 
            .get(false) // 23:  
           .stream() //   24: 
        .sorted() //     25:  
         .forEach(System.out::print); //     26: 
  } //    27: 
} //   28: 
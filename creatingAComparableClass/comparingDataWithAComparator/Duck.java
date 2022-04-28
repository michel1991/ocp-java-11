package creatingAComparableClass.comparingDataWithAComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Duck implements Comparable<Duck>{

  private String name;
  private int weight;

  public Duck(String theName, int theWeight){
      name = theName;
      weight = theWeight;
   }

   //Assume getters/setters/constructors provided
  
   public int getWeight(){
     return weight;
   }  


  public String toString(){
    return name;
  }

  public int compareTo(Duck d){
        return name.compareTo(d.name);
   }

  public static void main(String[] args){
       Comparator<Duck> byWeight = new Comparator<Duck>(){
          public int compare(Duck d1, Duck d2){
              return d1.getWeight() - d2.getWeight();
          }
      };

     var ducks = new ArrayList<Duck>();
     ducks.add(new Duck("Quack", 7));
     ducks.add(new Duck("Puddles", 10));
     Collections.sort(ducks);
     System.out.println(ducks); // [Puddles, Quack]
    
     Collections.sort(ducks, byWeight);
     System.out.println(ducks); // [Quack, Puddles]

   }

}

package enums.errors;

/**
* The declaration of Fruit does not compile because enums are required to list their values first.
* Even if the code was corrected to put the list of values first, the main() method in FruitShopper does not compile.
* The fully qualified name of the enum should be used. In other words, the right side of line 10 needs to be FruitStore.Fruit.PLUM.
* If all of these issues were fixed, then the code would print PLUM is purple.
* Option F is incorrect because inner classes can contain instance members
 */
 class FruitStore {
   public enum Fruit {
       // APPLE("red"), BANANA("yellow"), ORANGE("orange"), PLUM("purple");
       private Fruit(String color) {
           this.color = color;
           System.out.println(" color is " + color);
       }

       public String color;
       APPLE("red"), BANANA("yellow"), ORANGE("orange"), PLUM("purple");
     }
 }

public class EnumValueMustBeFirst {
     public static void main(String[] args) {
         var one = Fruit.PLUM;
         //var one = FruitStore.Fruit.PLUM;
         System.out.println(one + " is " + one.color);
     }
}
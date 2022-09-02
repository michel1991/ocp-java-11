package convenienceMethodsOnFunctionalInterfaces;
import java.util.function.*;

public class ConvenienceWithPredicate{
   static Predicate<String>  getEgg(){
       Predicate<String> egg = s -> s.contains("egg");
       return egg;
   }

   static Predicate<String>  getBrown(){
     Predicate<String> brown = s -> s.contains("brown"); 
     return brown;
   }

   static Predicate<String> getBrownEgg(){
       Predicate<String> egg = getEgg();
        Predicate<String> brown = getBrown();
	Predicate<String> convenienceBrownEggs = egg.and(brown);

	return convenienceBrownEggs;
  }

  static Predicate<String>  getOtherEggs(){
       Predicate<String> egg = getEgg();
       Predicate<String> brown = getBrown();
       Predicate<String> convenienceOtherEggs = egg.and(brown.negate());

       return convenienceOtherEggs;
  }

  static Predicate<String>  getBrownEggOldVersion(){
    Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");

    return   brownEggs ;
  }

  static Predicate<String> getOtherEggsOldVersion(){
    Predicate<String> otherEggs = s -> s.contains("egg") && !s.contains("brown");

    return otherEggs;
  }


 public static void main(String[] args){
   //predicate();
   String myText = "I Like eat egg and I have brown head";
   Predicate<String> eggBrownVersionWithoutAnd =  getBrownEggOldVersion();
   System.out.println(" find egg brown: Result without and method of Predicate " + eggBrownVersionWithoutAnd.test(myText) );

   Predicate<String> eggBrownVersionWithoutVersionWithAnd =  getBrownEgg();
   System.out.println(" find egg brown:  Result with and method of Predicate " + eggBrownVersionWithoutVersionWithAnd.test(myText) );
   

   Predicate<String> otherEggsWithoutCombinaisonOfPredicate = getOtherEggsOldVersion();
   System.out.println(" find egg not contains brown: Result without and method of Predicate " + otherEggsWithoutCombinaisonOfPredicate.test(myText) );
   Predicate<String> otherEggsWithAndMethod = getOtherEggs();
   System.out.println(" find egg not contains brown: Result without and method of Predicate " + otherEggsWithAndMethod.test(myText) );

 }

}

package workingWithGenerics.boundingGenericTypes.upperBoundedWildcards;
import java.util.*;
import java.util.function.*;

class UsingUpperBoundedWildCard{
    private static void anyFlyer(List<Flyer> flyer){
        System.out.println("only Flyer ");
        Consumer<Flyer> callFly = Flyer::fly;
	    flyer.forEach(callFly);
    }

  private static void groupOfFlyers(List<? extends Flyer> flyer){
        System.out.println("start group of flyers ");
	    Consumer<Flyer> callFly = Flyer::fly;
        flyer.forEach(callFly);
   }

  public static void main(String... args){
      List<Flyer> listOfFlyerGooseOnly = new ArrayList<>();
      listOfFlyerGooseOnly.add(new Goose() );
      listOfFlyerGooseOnly.add(new Goose() );
     
      anyFlyer(listOfFlyerGooseOnly);

      System.out.println();
      List<Goose> listMixedOfFlyer = new ArrayList<>();
      listMixedOfFlyer.add(new Goose() );
      listMixedOfFlyer.add(new Goose() );
      groupOfFlyers( listMixedOfFlyer );
  }
}

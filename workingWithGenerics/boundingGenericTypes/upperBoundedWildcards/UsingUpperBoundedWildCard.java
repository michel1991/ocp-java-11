package workingWithGenerics.boundingGenericTypes.upperBoundedWildcards;
import java.util.*;
import java.util.function.*;

class UsingUpperBoundedWildCard{
    private void anyFlyer(List<Flyer> flyer){
        System.out.println("only Flyer ");
        Consumer<Flyer> callFly = Flyer::fly;
	flyer.forEach(callFly);
    }

  private void groupOfFlyers(List<? extends Flyer> flyer){
        System.out.println("start group of flyers ");
	Consumer<Flyer> callFly = Flyer::fly;
        flyer.forEach(callFly);
   }

  public static void main(String... args){
    List<Flyer> listOfFlyerOnly = new ArrayList<>();
     listOfFlyerOnly.add(new Goose() );
     listOfFlyerOnly.add(new Goose() );

     UsingUpperBoundedWildCard handleUsing = new UsingUpperBoundedWildCard();
      handleUsing.anyFlyer(  listOfFlyerOnly );

      System.out.println();
      List<Goose> listMixedOfFlyer = new ArrayList<>();
      listMixedOfFlyer.add(new Goose() );
      listMixedOfFlyer.add(new Goose() );
      handleUsing.groupOfFlyers( listMixedOfFlyer );
  }
}

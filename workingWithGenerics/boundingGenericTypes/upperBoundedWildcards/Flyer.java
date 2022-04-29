package workingWithGenerics.boundingGenericTypes.upperBoundedWildcards;
import java.util.*;

interface Flyer{
  void fly();

 private void anyFlyer(List<Flyer> flyer){

 }

  private void groupOfFlyers(List<? extends Flyer> flyer){

   }
}

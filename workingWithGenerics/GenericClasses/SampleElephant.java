package workingWithGenerics.GenericClasses;

public class SampleElephant{

  public static void main(String[] args){
     Elephant elephant = new Elephant();
    Crate<Elephant>  crateForElephant = new Crate<>();
    crateForElephant.packCrate(elephant);
    Elephant inNewHome = crateForElephant.emptyCrate();
  }

}

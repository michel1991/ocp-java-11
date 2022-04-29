package workingWithGenerics.GenericClasses;

public class SampleUsingGenericWithMultipleParameters{
  public static void main(String[] args){
        Elephant elephant = new Elephant();
       Integer numPounds = 15_0000;
       SizeLimitedCrate<Elephant, Integer> c1 = new SizeLimitedCrate<>(elephant, numPounds);
   }
}

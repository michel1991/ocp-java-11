package workingWithGenerics.boundingGenericTypes.upperBoundedWildcards;

class Goose implements Flyer{ 
    static int instanceNumberCreated ;

    public Goose(){
      ++instanceNumberCreated;
    }
   public void fly(){
     System.out.println("I am Goose " + instanceNumberCreated);
  }
}

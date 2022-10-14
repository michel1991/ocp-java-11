package creatingAComparableClass.comparingMultipleFields;

public class Squirrel{
  private int weight;
  private String species;

  public Squirrel(int theWeight, String theSpecies){

      weight = theWeight;
      species = theSpecies;
  }

  public int getWeight(){
     return weight;
  }

  public String getSpecies(){
      return species;
   }
  
  public String toString(){
     return "{ weight =  " + weight  + ", species = " + species + " } "; 
  }
}

package usingMethodReferences.numberofParametersInAMethodReference;

public class Penguin{
  public static Integer countBabies(Penguin... cuties){
      return cuties.length;
   }
}

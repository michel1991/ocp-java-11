package inheritingDuplicateDefaultMethods;

public class ErrorCat implements Walk, Run{ // does not compile
  public static void main(String[] args){
     System.out.println(new ErrorCat().getSpeed());
  } 

}

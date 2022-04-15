package inheritingDuplicateDefaultMethods.callingAHiddenDefaultMethod;
import inheritingDuplicateDefaultMethods.Walk;
import inheritingDuplicateDefaultMethods.Run;

public class CatCallingParentDefaultMethod implements Walk, Run{
  public int getSpeed(){
    return 1;
  }

 public int getWalkSpeed(){
    return Walk.super.getSpeed();
 }

  public static void main(String[] args){
     System.out.println(new CatCallingParentDefaultMethod().getWalkSpeed());
  } 

}

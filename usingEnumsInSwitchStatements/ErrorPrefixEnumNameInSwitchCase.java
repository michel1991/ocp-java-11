package usingEnumsInSwitchStatements;
import  creatingSimpleEnums.Season; 

class ErrorPrefixEnumNameInSwitchCase{
  public static void main(String[] args){
     Season summer = Season.SUMMER;
     switch(summer){
         case Season.FALL:
            System.out.println("Rake some leaves");
            break;
         case 0:
            System.out.println("Get out the sled");
            break;
         
     }
  }
}

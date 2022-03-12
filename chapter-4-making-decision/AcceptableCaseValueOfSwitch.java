public class AcceptableCaseValueOfSwitch{
    private int getSortOrder(String firstName, final String lastName){
      String middleName = "Patricia";
      final String suffix = "JR";
      int id = 0;
      switch(firstName){
         case "Test":
           return 52;
         case middleName: 
          id = 5;
          break;
        case lastName:
         id = 8;
         break;
       case 5:
         id = 7;
         break;
       case 'J':
          id = 10;
          break;
       case java.time.DayOfWeek.SUNDAY:
         id = 15;
         break;
      }
     return id;
   }
  
   public static void main(String[] args){
     AcceptableCaseValueOfSwitch sample = new  AcceptableCaseValueOfSwitch();
     //sammple.getSortOrder();
  }
}

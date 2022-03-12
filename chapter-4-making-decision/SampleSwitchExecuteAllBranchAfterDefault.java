public class SampleSwitchExecuteAllBranchAfterDefault{
  public static void main(String[] args){
       var dayOfWeek = 5;
       switch(dayOfWeek){
           case 0:
             System.out.println("Sunday");
           default:
            System.out.println("Weekday");
          case 6:
            System.out.println("Saturday");
            break;
       }
   }
}

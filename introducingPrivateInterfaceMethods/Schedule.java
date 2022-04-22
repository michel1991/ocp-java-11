package introducingPrivateInterfaceMethods;

public interface Schedule{

   private void checkTime(int hour){
        if(hour > 17){
           System.out.println("You 're late!");
        } else{
           System.out.println("You have " + (17 - hour) + " hours left " + "to make the appointment");
       }
    }

   default void wakeup(){
      checkTime(7);
    }

   default void haveBreakfast(){
       checkTime(9);
   }

    default void haveLunch(){
        checkTime(12);
    }

   default void workOut(){
     checkTime(18);
   }

}

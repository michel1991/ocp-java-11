public class StaticInitialization{
  private static final int NUM_SECONDS_PER_MINUTE;
  private static final int NUM_MINUTES_PER_HOUR;  
  private static final int NUM_SECONDS_PER_HOUR;
  static {
     NUM_SECONDS_PER_MINUTE = 60;
     NUM_MINUTES_PER_HOUR = 60;
    }

  static {
      NUM_SECONDS_PER_HOUR =  NUM_SECONDS_PER_MINUTE * NUM_MINUTES_PER_HOUR; 
   }

   public static void main(String... args){
     System.out.println(" NUM_SECONDS_PER_HOUR " + NUM_SECONDS_PER_HOUR );
   }

}

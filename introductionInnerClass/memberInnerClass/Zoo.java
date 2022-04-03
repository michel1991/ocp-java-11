package introductionInnerClass.memberInnerClass;

public class Zoo{
   private interface Paper{
       public String getId();    
   }

  public class Ticket implements Paper{
     private String serialNumber;

        public String getId(){
          return serialNumber;
       }
  }
}

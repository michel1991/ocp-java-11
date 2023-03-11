package declaringAssertions.demos;

public class Travel {
   public static void toCountry(){
       System.out.println("Travel toCountry");
     String country = "Cameroon";
     assert country.equals("cameroon"); 
   }

    public static void main(String[] args) {
       toCountry();
   }
}
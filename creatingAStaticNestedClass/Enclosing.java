package creatingAStaticNestedClass;

public class Enclosing{

  static class Nested{
      private int price = 6;
      static String name = "jobs";
  }

  public static String getNameOfNestedClass(){
     return Nested.name;
  }

  public static void main(String[] args){
     Nested nested = new Nested();
     System.out.println(nested.price);
     System.out.println(" member field from static inner class " + getNameOfNestedClass() );
  }

}

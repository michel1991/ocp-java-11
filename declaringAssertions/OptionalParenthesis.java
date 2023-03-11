package declaringAssertions;

/**
 * Not recommended to handle Error Eception
 */
public class OptionalParenthesis {
  public static void main(String... args){
      int length = 100;
      int age = 1;
      int height = 3;
      String name = "Mvouma";
      try{
          assert 1 == age;
      }catch(Error ex){
          ex.printStackTrace();
      }

      try{
          assert(2 == height);
      }catch(Error ex){
          ex.printStackTrace();
      }

      try{
          assert 100.0 == length : "Problem with length";
      }catch(Error ex){
       ex.printStackTrace();
      }

      try{
          assert ("Cecelia".equals(name)): "Failed to verify user data";
      }catch(Error ex){
          ex.printStackTrace();
      }


  }
}
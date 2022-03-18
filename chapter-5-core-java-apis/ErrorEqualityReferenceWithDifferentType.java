public class ErrorEqualityReferenceWithDifferentType{
  public static void main(String[] args){
    String string = "a";
   StringBuilder builder = new StringBuilder("a");
   System.out.println(string == builder ); // does not compile
  }
}

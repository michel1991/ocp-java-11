public class TypeInferenceWithNullOnlyOnObject{
  public static void main(String[] args){
    var n = "myData";
        n = null;
    System.out.println(n);
  }
}

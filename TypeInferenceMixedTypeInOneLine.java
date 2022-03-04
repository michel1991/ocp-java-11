public class TypeInferenceMixedTypeInOneLine{
  public void twoTypes(){
   int a, var b = 3; // does not compile
  }
  public static void main(String[] args){
   TypeInferenceMixedTypeInOneLine sample = new TypeInferenceMixedTypeInOneLine();
    sample.twoTypes();
  }
}

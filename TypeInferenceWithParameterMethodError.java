public class TypeInferenceWithParameterMethodError{

  public int addition(var a, var b){ // does not compile
    return a + b;
  }
  public static void main(String[] args){
    TypeInferenceWithParameterMethodError sample = new TypeInferenceWithParameterMethodError();
    int result  = sample.addition();
    System.out.println("Type using as method parameter " + result);
  }
}

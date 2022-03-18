public class SampleCastingArrayError{
  public static void main(String[] args){
    String[] strings = { "stringValue" };
    Object[] objects = strings;
    String[] againStrings = (String[]) objects;
    againStrings [0] = new StringBuilder(); // does not compile
    objects[0] = new StringBuilder(); // careful
  }
}

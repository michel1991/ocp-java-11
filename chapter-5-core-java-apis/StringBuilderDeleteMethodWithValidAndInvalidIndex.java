public class StringBuilderDeleteMethodWithValidAndInvalidIndex{
  public static void main(String[] args){
     StringBuilder sb = new StringBuilder("abcdef");
     sb.delete(1,3);
     System.out.println("original value= " + " abcdef"  + " index to delete begin = 1 and before end index = 3, the result is = " + sb);
     sb.deleteCharAt(5); // also failed with invisible index 4 
     System.out.println(sb); 
  }
}

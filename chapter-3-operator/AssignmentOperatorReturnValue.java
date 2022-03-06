public class AssignmentOperatorReturnValue{
  public static void main(String[] args){
    long wolf = 5;
    long coyote =  (wolf = 3);
   System.out.println(wolf);
   System.out.println(coyote);
  }
}

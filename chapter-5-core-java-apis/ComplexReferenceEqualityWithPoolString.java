public class ComplexReferenceEqualityWithPoolString{
  public static void main(String[] args){
     String first = "rat" + 1;
     String second = "r" + "a" + "t"+ "1";
     String third = "r" + "a" + "t" + new String("1");
     System.out.println(first == second);
     System.out.println(first == second.intern());
     System.out.println(first == third);
     System.out.println(first == third.intern());
  }
  
}

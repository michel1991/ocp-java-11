public class NumericPromotionSmallTypeAreConvertToInt{
  public static void main(String[] args){
   short x = 10;  
   short y = 3;
   var z = x + y;
   System.out.println("small type byte, char, short, are convert first to int " + z); 
  }
}

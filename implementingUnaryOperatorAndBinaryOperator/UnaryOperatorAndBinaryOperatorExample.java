package implementingUnaryOperatorAndBinaryOperator;
import java.util.function.*;

class UnaryOperatorAndBinaryOperatorExample{
  
   static void unaryOperator(){
      UnaryOperator<String> u1 = String::toUpperCase;
      UnaryOperator<String> u2 = x -> x.toUpperCase();

      System.out.println("UnaryOperator with refernce method " + u1.apply("chirp")); // CHIRP
      System.out.println("UnaryOperator lambda " + u2.apply("chirp")); // CHIRP

   } 


   static void binaryOpertor(){ 
      BinaryOperator<String> b1 = String::concat;
      BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);
    
      System.out.println("BinaryOperator with refernce method " + b1.apply("baby ", "chick"));
      System.out.println("BinaryOperator lambda " + b2.apply("baby ", "chick"));                                                                      
    
   }
 
  public static void main(String[] args){
     unaryOperator();
     System.out.println();
     binaryOpertor();
  }
}

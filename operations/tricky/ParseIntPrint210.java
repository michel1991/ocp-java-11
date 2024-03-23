package operations.tricky;
/**
   Given:
   What is the result?
   
   A. Compilation failure at //1.
        There is no cause for a compilation error or an exception at runtime at this line.
        parseInt(String valie , int radix) is a valid method in Integer class.
        It parses the string argument as a signed integer in the radix specified by the second argument.
        The characters in the string must all be digits of the specified radix.
        
        Since NumberFormatException is an unchecked exception, there is no need for a throws clause in the second constructor.
        
        For example:
        parseInt("10", 2) returns 2
        parseInt("-FF", 16) returns -255
        parseInt("12", 2) throws a NumberFormatException
        //because 2 is not a valid digit in numbers in base 2.
        
    B. Compilation failure at //2.
        There is no cause for a compilation error or an exception at runtime at this line.
        Double.parseDouble(str) returns a primitive double and in this case, it will be parse the string "10" into 10.0
        
     C. Exception in parsing
        0 0.0
        
      D. Exception in parsing
        10 0.0
        
      E. Equal
        10 10.0
        
      F. 10 10.0
      
      G. 2 10.0 (correct)
      
      F. Exception in parsing
        2 0.0
        
    Note that Double.parseDouble(str) returns a primitive double but it will be boxed into a
    Double when it is assigned to dVal because dVal is a Double variable.
    Comparing a numeric wrapper object reference with a numeric primitive varable using == is legally valid.
    The wrapper object will be unboxed into a primitive value and then the two primitive values will be compared.
    That is why, if you compare a primitive numeric value with a primitive wrapper object containing the same value, the result is true.
    
    However, a comparison between two different types of wrapper variables (for example,
    a Double variable and an Integer variable) will cause compilation failure. So, for example,
    had iVal been declared as Integer iVal = 0; a compilation error would be raised at //2.
    
    The following code illustrates the rules described above:
    
      Double d1 = 1000.0;
      double d2 = 1000.0;
      int i1 = 1000;
      Integer i2 = Integer.valueOf(1000); //returns an new Integer object containing 1000
      Integer i3 = Integer.valueOf(1000); //returns an new Integer object containing 1000
    
      System.out.println(d1 ==  d2); //prints true, d1 is unboxed
    //and both the values are the same
    
      System.out.println(d1 ==  i1); //prints true, d1 is unboxed
    //and both the values are the same
    
      System.out.println(i1 ==  i2); //prints true, i2 is unboxed
    //and both the values are the same
    
      System.out.println(i2 ==  i3); //prints false, i2 and i3 point to
    //two different Integer objects
    
      i2 = Integer.valueOf(100); //returns a cached Integer object because
    //the integer value is between -128 and 127
    
      i3 = Integer.valueOf(100); //returns the same cached Integer object
    //because the integer value is between -128 and 127
    
      System.out.println(i2 ==  i3); //prints true, because i2 and i3
    //point to the same Integer object
    
      System.out.println(d1 ==  i2); //will not compile. No unboxing here
    //because neither of the operands are primitive.
    
    
    
    You may want to check out the free video by Dr. Sean Kennedy explaining this question: https://youtu.be/fI2gdiDqrUg


 */
public class ParseIntPrint210 {
    public static void main(String[] args) {
        String str = "10";
        int iVal = 0;
        Double dVal = 0.0;
        try{
            iVal = Integer.parseInt(str);  //1
            if((dVal = Double.parseDouble(str)) == iVal){ //2
                System.out.println("Equal");
            }
        }catch(NumberFormatException e){
            System.out.println("Exception in parsing");
        }
        System.out.println(iVal+" "+dVal);

    }
    
}
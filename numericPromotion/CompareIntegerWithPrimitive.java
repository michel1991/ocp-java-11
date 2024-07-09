package numericPromotion;

public class CompareIntegerWithPrimitive {
    
    /**
      Given the following declarations, identify which statements will return true:
      
      A. i1 == i2
        This will return false because both are pointing to different objects.
        
      B. i1 == i3
            This will return true because one operand is a primitive int, so the other will be unboxed and then the value will be compared.
      
      C. i1 == b1
        This will not compile because type of i1 and b1 references are classes that are not in the same class hierarchy.
        So the compiler figures out at compile time itself these two references cannot ever point to the same object.
        
      D. i1.equals(i2)
        This will return true because both are Integer objects and both have the value 1.
        
      E. i1.equals(g1)
        
        This will return false because they are pointing to objects of different types.
        
        Signature of equals method is : boolean equals(Object o);
        Thus, it can take any object as a parameter and so there will be no compilation error.
        
        Further, The equals method of all wrapper classes first checks if the two object are of same class or not. If not, they immediately return false.
        
      F. i1.equals(b1)
            This will return false because they are pointing to objects of different types.
            
      G. d > 1L
        It will compile fine but will return false.
        Remember:
        1. Numeric wrappers can be compared with numeric primitive values using ==.
        2. When you compare a larger numeric type with a smaller numeric type (such as a double and an int),
           the smaller value is automatically promoted to the larger type.
        3. floating type values with 0 decimal part are equal to their corresponding integral values. For example, 1.0 == 1 is true.
        
       Correct (B, D)




     */
    public static void main(String... args){
        Integer i1 = 1;
        Integer i2 = new Integer(1);
        int i3 = 1;
        Byte b1 = 1;
        Long g1 = 1L;
        Double d = 1.0;
    }
}
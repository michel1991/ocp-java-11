package advancedDesign.integralAssignValue;
/**
   Which of the following declarations are valid?
   A.
       float f1 = 1.0;
           1.0 is a double.
   B.
      float f = 43e1;
         43e1 is a double.
   C.
      float f = -1;

   D.
     float f = 0x0123;

   E.
      float f = 4;
      
   F.
     var f1 = 1.0;
        float f2 = f1;
        1.0 is a double value. Therefore, compiler makes f1 a double variable.
        However, a double value cannot be assigned to a float variable and so, float f2 = f1; fails compilation
        
   G. var f = 4f;
    Type of f will be float because of the suffix f in 4. (Thus, float f2 = f; would also be valid if put next to this statement).

   
   ---------------------------------------------------
   The values in option 1 and 2 (1.0 and 43e1) are double values.
   Although these values are compile time constants and are small enough to fit into a float variable,
   the assignment is still invalid because Java does not permit implicit narrowing from double to float.
   Implicit narrowing is permitted only among byte, char, short, and int.
    Correct(C, D, E, G)
 */
public class FloatRepresentation {
    public static void main(String... args){
        float f = -1;
        float fResponseD = 0x0123;
        float fResponseE = 4;
        var fResponseG = 4f;


    }
}
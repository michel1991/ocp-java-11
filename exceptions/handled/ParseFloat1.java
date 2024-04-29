/**
 * Given:

    public static float parseFloat1(String s1){
        try{
            return Float.parseFloat(s1);
        }catch(NumberFormatException e){
            return 0.0f;
        }catch(IllegalArgumentException e){
            return Float.NaN;
        }
    }    

    Identify correct statements.
    A. Calling parseFloat1(""+Float.NEGATIVE_INFINITY); will return 0.0f.
        It will return a float value representing Float.NEGATIVE_INFINITY.
        FYI, System.out.print(Float.NEGATIVE_INFINITY) prints -Infinity.
    
    B. Calling parseFloat1(""+Float.POSITIVE_INFINITY); will return 0.0f.
        It will return a float value representing Float.POSITIVE_INFINITY.
    C.
       Calling parseFloat1("junk"); will return 0.0f.
    Since "junk" is not a valid float number, Float.parseFloat("junk");
    will throw a NumberFormatException, which will be caught by the catch(NumberFormatException e) block. Therefore, 0.0f will be returned.
    
   D.
      Calling parseFloat1("-Infinity"); will return NaN.
    Float.parseFloat correctly parses -Infinity to return the float value representing Float.NEGATIVE_INFINITY.
   
  E.
     Calling parseFloat1("NaN"); will return 0.0f.
    Float.parseFloat correctly parses the string NaN to return the float value representing Float.NaN
    
  -------------------------

   The Float.parseFloat method never throws an IllegalArgumentException.
   It throws a NumberFormatException when the given string does not contain a valid floating point number.
    It correctly parses strings containing "Infinity", "-Infinity", and "NaN" to their corresponding float values.
    If the input string contains a number that is too large to be represented by a float, it returns a float value representing
    Float.POSITIVE_INFINITY or Float.NEGATIVE_INFINITY (depending on whether the input String contains a positive or a negative number).
   
     correct(C)
    
 */
public class ParseFloat1 {
    public static float parseFloat1(String s1){
            try{
                return Float.parseFloat(s1);
            }catch(NumberFormatException e){
                return 0.0f;
            }catch(IllegalArgumentException e){
                return Float.NaN;
            }
    }
    
    public static void main(String... args){
        parseFloat1("junk");
    }
}
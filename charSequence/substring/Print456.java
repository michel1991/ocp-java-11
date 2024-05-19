package charSequence.substring;

/**
 * Which of these expressions will obtain the substring "456" from a string defined by String str = "01234567"?
 
    A. str.substring(4, 7)
    B. str.substring(4)
        It will return "4567".
    C. str.substring(3, 6)
        It will return "345".
    D. str.substring(4, 6)
        It will return "45".
    E. str.substring(4, 3)
        Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -1

    ----------------------------------------------------------------------
    Read this carefully:
    public String substring(int beginIndex, int endIndex)
        Returns a new string that is a substring of this string. The substring begins at the specified beginIndex and
        extends to the character at index endIndex - 1. Thus the length of the substring is endIndex-beginIndex.

    "hamburger".substring(4, 8) returns "urge"
    "smiles".substring(1, 5) returns "mile"
    "unhappy".substring(2) returns "happy"
    "Harbison".substring(3) returns "bison"
    "emptiness".substring(9) returns "" (an empty string)
     correct(A)

  
 */
public class Print456 {
    public static void main(String... args){
        var str = "01234567";
       var result =  str.substring(4, 7);
       System.out.println(result);
    }
}
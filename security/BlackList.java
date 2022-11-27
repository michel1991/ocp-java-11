package security;
public class BlackList {
    /**
    * What is this code an example of?
    *   A. Blacklist
        B. Bluelist
        C. Redlist
        D. Whitelist
        E. None of the above

       The validation code fails if specific characters are found.
       Since it is comparing to disallowed values, this is an example of a blacklist, and option D is correct.
       If it were the opposite, it would be a whitelist. There is no such thing as a blue or red list.
     */
    public static void validate(String amount) {
        for (var ch : amount.toCharArray())
            if (ch == '$' || ch == '%')
                throw new IllegalArgumentException("invalid " + ch);
     }

    public static void executeWithException(String value){
        try{
            validate(value);
        }catch(Exception ex){
            ex.printStackTrace();
            //System.out.println("errors " + ex.getMessage() );
        }
    }

    public static void main(String... args){
        validate("0123456789");
        executeWithException("$");
        executeWithException("%");
    }

}
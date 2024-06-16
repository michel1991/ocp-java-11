package security.guidelines.immutable;

/**
 A programmer has written the following code for Address class. The programmer intends this class to be immutable.

    public class Address {
        private String hNo;
        private String street;
        private String zip;
        public Address(String h, String s, String z){
            this.hNo = h; this.street = s; this.zip = z;
        }
        
        //only getters for three fields. No setters.
    }
    Which of the following actions implement the Java SE Secure guidelines?
    
    A. Make the class final.
      --
        As per Guideline 6.1 of Secure Coding Guidelines: "Immutable classes should not be subclassable."
        
    B.  Make the constructor private and provide a static factory method to return Address instances.
       --
        This is the preferred alternative to making the class final.
        By making the constructor private (and not making the class final), the provider of the class
        is free to implement "interning" in the factory method while still preventing anyone from subclassing.
        
    C.
       Make the fields final.
        Instance fields of immutable classes should be final as per Guideline 6-1 / MUTABLE-1: Prefer immutability for value types.
        
    D.
       Make the getter methods synchronized.
       ----
        Synchonization is not required for immutable classes.
        
        
    Correct(A, B, C)


 */
public class Address {
    private String hNo;
    private String street;
    private String zip;
    public Address(String h, String s, String z){
        this.hNo = h; this.street = s; this.zip = z;
    }
    
    //only getters for three fields. No setters.
    
    public String getHNo(){
        return hNo;
    }
    
    public String getStreet(){
        return street;
    }
    
    public String getZip(){
        return zip;
    }
    
    
}
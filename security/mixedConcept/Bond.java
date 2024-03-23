package security.mixedConcept;
/**
   A programmer has written the following code for Bond class. The programmer intends this class to be immutable.
   
   A.
   This class implements all Java SE security guideliness for immutable classes.
   
   B.
     Bond class should be made final.
    As per Guideline 6-1 / MUTABLE-1, an immutable class should not be subclassable.
    Thus, in order to guarantee immutability, the class should either be final or should have only private constructors
    (this means, it should have at least one explicitly defined private constructor, in order to not have a default constructor).

    The class given in this question does not have any publicly accessible constructor and thus, it is not required to be final to be immutable.
    
    C. The getter methods should be made final.

    
    D. The getMaturityDate method should return a clone of maturityDate.
        Although Bond class itself is immutable, Date is not. If you return the reference to the Date object referred
        to by the instance field maturityDate, the receiver can modify that Date object. This is undesirable for an immutable class
        
   E.
    The constructor should create a clone of the Date argument and assign the cloned Date object to maturityDate.
    If you don't make a clone of the passed Date object, one can pass a Date to the build() method
    and use the same Date object's reference to modify it. This would render Bond class mutable.
    
    Correct(D, E)
    
    Guideline 6-2 / MUTABLE-2: Create copies of mutable output values
    If a method returns a reference to an internal mutable object, then client code may modify the internal state of the instance.
    Unless the intention is to share state, copy mutable objects and return the copy.

    To create a copy of a trusted mutable object, call a copy constructor or the clone method:
    
            public class CopyOutput {
                private final java.util.Date date;
                ...
                public java.util.Date getDate() {
                    return (java.util.Date)date.clone();
                }
            }
 
 */
class Bond {
    private final String isin;
    private final double coupon;
    private final java.util.Date maturityDate;
    private Bond(String isin, double coupon, java.util.Date matDate){
        this.isin = isin; this.coupon = coupon; this.maturityDate = matDate;
    }

    public static Bond build(String isin, double coupon, java.util.Date matDate){
        return new Bond(isin, coupon, matDate);
    }

    public String getIsin(){ return isin; }
    public double getCoupon(){ return coupon; }
    public java.util.Date getMaturityDate(){ return maturityDate; }
}
package io.tricky;
import java.io.*;

/**
  Consider the following code:
 
 
   Which of the following approaches can be taken independent of each other so that a Portfolio
   object can be serialized while preserving the state of the Bond objects contained in Portfolio?
   
   A. It can be serialized as it is without any modification.
   B.  Just have Bond class implement Serializable.
   C.  Just make 'bonds' field in Portfolio transient.
    Making it transient will leave 'bonds' unserialized. So, its state will be lost when Portfolio is serialized.
   D.  Change the type of bonds from Bond[] to ArrayList<Bond> bonds;
    It will not have any bearing on the fact that Bond is not Serializable.
   E. Make bonds array transient in Portfolio and implement readObject(ObjectInputStream os)
   and writeObject(ObjectOutputStream os)  methods to read and write the state of Bond objects explicitly.
   

   
  If for any reason, you want to serialize Portfolio objects without making Bond class Serializable,
  you can customize the serialization of a Portfolio class by implementing readObject and writeObject methods as shown below:
  
    class Bond  // does not implement Serializable
    {
        String ticker = "bac"; double coupon = 8.3; 
        java.time.LocalDate maturity = new Date();
    }
    
    class Portfolio implements Serializable
    {
        String accountName;
    
       //bonds field must be transient because Bond class does not implement Serializable
        transient Bond[] bonds = new Bond[]{ }; 
    
        private void writeObject(ObjectOutputStream os) throws Exception{
    	os.defaultWriteObject();
    	os.writeInt(bonds.length);
    	//write the state of bond objects
    	for(int i=0; i<bonds.length; i++) {
    		os.writeObject(bonds[i].ticker); 
    		os.writeDouble(bonds[i].coupon);
    		os.writeObject(bonds[i].maturity);
    	}
        }
    
        private void readObject(ObjectInputStream os) throws Exception{
    	os.defaultReadObject();
    	int n = os.readInt();
    	this.bonds = new Bond[n];
    	//read the state of bond objects.
    	for(int i=0; i<bonds.length; i++) {
    		bonds[i] = new Bond();
    		bonds[i].ticker = (String) os.readObject();	
    		bonds[i].coupon = os.readDouble();
    		bonds[i].maturity = (java.util.Date) os.readObject();
    	}
    
        }    
    }
    
       Correct(B, E)
 */
class Bond
    {
        String ticker; double coupon; java.time.LocalDate maturity;
    }

class Portfolio implements Serializable
    {
        String accountName;
        Bond[] bonds;
    }

public class TestClass {
    public static void main(String[] args) throws Exception{
        Portfolio portfolio = new Portfolio(); // get portfolio somehow
        // serialize portfolio
    }
}
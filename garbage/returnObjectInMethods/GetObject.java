package garbage.returnObjectInMethods;
/**
    After which line will the object created at line XXX be eligible for garbage collection?
    A. //2
    B. //3
    C. //4
    D. Never in this method.
    E. Cannot be determined.
    
    ------
    
     Note that at line 2, c is assigned the reference of b. i.e. c starts pointing to the object created at //XXX.
     So even if at //3 b and a are set to null, the object is not without any reference.
    Also, at //4 c is being returned. So the object referred to by c cannot be garbage collected in this method!
    
     correct(D)

 */
public class GetObject {
    public Object getObject(Object a) //0
    {

        Object b = new Object();  //XXX
        
        Object c, d = new Object(); //1
        c = b; //2
        b = a = null; //3
        return c; //4
    }
}
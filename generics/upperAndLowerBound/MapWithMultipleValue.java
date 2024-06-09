package generics.upperAndLowerBound;
import java.util.*;

/**
   Consider the following code:
    import java.util.*;
    public class TestClass {
            public static void main(String[] args)
            {
                // put declaration here
    
                m.put("1", new ArrayList());    //1
                m.put(1, new Object());    //2
                m.put(1.0, "Hello");     //3
                System.out.println(m);
            }
    }
   
   How can 'm' be declared such that the above code will compile and run without errors?
   
   A. Map m = new TreeMap();
       ----
        This will throw an exception at runtime because the keys of a TreeMap must be mutually comparable.
        Here, String, Integer, and Double are not mutually comparable.
    
   B. Map<Object, Object> m = new TreeMap<Object, Object>();
       ---
        Same problem as the first option.
        
   C. Map<Object, ?> m = new LinkedHashMap<Object, Object>();
     
   D. Map<Object, ? super ArrayList> m = new LinkedHashMap<Object, ArrayList>(); will work if lines //2 and //3 are commented out.

   E. Map<Object, ? super ArrayList> m = new LinkedHashMap<Object, ArrayList>(); will work if lines //1 and //3 are commented out.
   
   F. Map m = new HashMap();

    -------------------------
     There is an important concept to be understood here so please read this carefully:

        Map<Object, ?> m = new LinkedHashMap<Object, Object>();
        
        While this is a valid declaration, it will not allow you to put anything into 'm'.
        The reason is that m is declared to be of type Map that takes an instance of Object class as a key and instance
        of 'Unknown class' as value.
        Therefore, if you try to put an Object, or Integer, or anything, the compiler will not allow it because that 'Unknown'
        class is not necessarily Object or Integer or any other class.
        Even though the actual object pointed to by 'm' is of type LinkedHashMap<Object, Object>,
        the compiler looks only at the reference type of the variable. Thus, 'm' is read-only.
        It would have worked if m were declared as Map<Object, Object> m = ....
        Because in this case the compiler *knows* that m can take an instance of Object as value. Object type covers all kind of objects.
        
        
        Map<Object, ? super ArrayList>
            m = new LinkedHashMap<Object, ArrayList>();
        
        You should read it aloud as follows: 'm' is declared to be of type Map that takes an instance
        of Object class as a key and an instance of 'a class that is either ArrayList or a superclass of Arraylist' as value.
        This means that the value can be an instance of ArrayList or its subclass
         (since an ArrayList object or its subclass object can be assigned to a reference of type ArrayList or its super class.).
         However, you cannot put Object (which is a superclass of ArrayList) in it because the compiler doesn't know
         the exact superclass that 'm' can take. It could be AbstractList, or Object, or any other super class of ArrayList.
         The compiler only knows that it is a superclass but not the exact type. So option 4 is correct but 5 is wrong.
        
        Thus, you can do: m.add(anyObj, new ArrayList());
        
        Just the opposite of super is extends. Consider the following method:
        
        public void m1(List<? extends Number> list)
        {
            list.add(new Integer(10));  
        //Error at compile time because the compiler only knows that
        //list contains Number or its subclass objects. It doesn't know the exact type.     
        //Therefore, it will not allow you to add anything to it.
        
            Number n = list.get(1);  //This will work
            //because the compiler knows that every object in list IS-A Number.
        
        }  
        
        
        
        
        Option 6 is untyped. So, it will allow anything to be put into 'm'.
   Correct(D, F)

   
 */
 class TestClass { // public
        public static void main(String[] args)
        {
            // put declaration here
            Map<Object, ? super ArrayList> m = new LinkedHashMap<Object, ArrayList>();
            m.put("1", new ArrayList());    //1
           // m.put(1, new Object());    //2
           // m.put(1.0, "Hello");     //3
            System.out.println(m);
        }
}

public class MapWithMultipleValue {
    
}
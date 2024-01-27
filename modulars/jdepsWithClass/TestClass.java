package modulars.jdepsWithClass;
/**
 * Given the following code:
 
   and the following commands:
    
    javac TestClass.java
    jdeps -summary TestClass.class
    
    What will be the output?
    
    A.  TestClass.class -> java.base
        TestClass.class -> java.sql
        TestClass.class -> java.util
    
    B. TestClass.class -> java.base
    
    C. TestClass.class -> java.base
        TestClass.class -> java.sql
       
    D.  TestClass.class -> java.sql
        TestClass.class -> java.util
        
    Compilation will be successful but the jdeps command will generate an error.
    
    Correct is C

 */
class TestClass{
    public static void main(String args[]){
        int time = 100;
        java.sql.Timestamp ts = new java.sql.Timestamp(time);
        java.util.Date d = new java.util.Date();
        ts = new java.sql.Timestamp(d.getTime());
        System.out.println(ts);
    }
}

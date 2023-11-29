package charSequence.errors;

/**
   Consider the following class...
   The above code will not compile.
    A. True
    B. False
    
    This will not compile because String is a final class and final classes cannot be extended.
    There are questions on this aspect in the exam and so you should remember
    that StringBuffer and StringBuilder are also final. All primitive wrappers are also final
    (i.e. Boolean, Character, Short, Integer, Byte etc).
    java.lang.System is also final.
    
    (Correct A)
    
 */
public class MyString extends String {
    MyString(){ super(); }
}
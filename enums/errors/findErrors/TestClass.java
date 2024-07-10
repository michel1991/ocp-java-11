package enums.findErrors;
/**
   Which of the following lines will cause the compilation to fail?
   
    A. 1
        An enum is allowed to implement interfaces including Serializable.
        
    B. 2
        java.lang.Enum (from which every enum extends implicitly), makes the clone method final. So you cannot override it.
        
    C. 3
        An enum cannot extend any other enum or class because an enum is implicitly extends from java.lang.Enum.
        
    D. 4
        The correct method name is ordinal() and not index(). For example, EnumC.CC.ordinal() will return 1 in this case.
        
    E. 5
        This is fine for the compiler but at run time it will thrown  java.lang.IllegalArgumentException.
        
    F. 6
        There is nothing wrong with this line.
        
    -------------------------------------------------------------
You need to know the following facts about enums:
    1. Enum constructor is always private. You cannot make it public or protected. If an enum type has no constructor declarations,
    then a private constructor that takes no parameters is automatically provided.
    2. An enum is implicitly final, which means you cannot extend it.
    3. You cannot extend an enum from another enum or class because an enum implicitly extends java.lang.Enum. But an enum can implement interfaces.
    
    4. Since enum maintains exactly one instance of its constants, you cannot clone it.
You cannot even override the clone method in an enum because java.lang.Enum makes it final.

    5. Compiler provides an enum with two public static methods automatically - values() and valueOf(String).
The values() method returns an array of its constants and valueOf() method tries to match the String argument exactly (i.e. case sensitive)
with an enum constant and returns that constant if successful otherwise it throws java.lang.IllegalArgumentException.

    6. By default, an enum's toString() prints the enum name but you can override it to print anything you want.
    
The following are a few more important facts about java.lang.Enum which you should know:
    1. It implements java.lang.Comparable (thus, an enum can be added to sorted collections such as SortedSet, TreeSet, and TreeMap). The natural order of the enum values is the order in which they are defined i.e. in the order of their ordinal value.
    2. It has a method ordinal(), which returns the index (starting with 0) of that constant i.e. the position of that constant in its enum declaration.
    3. It has a method name(), which returns the name of this enum constant, exactly as declared in its enum declaration.
    Correct(B, C, D)
 */
interface I { }

public enum EnumA implements I, Serializable { A, AA, AAA};  //1


class TestClass
{
    public enum EnumB{ B, BB, BBB;
     public Object clone(){ return B; } //2
   }

   public static enum EnumC{ C, CC, CCC };

   public static enum EnumD extends EnumC{ DDD }; //3

   public TestClass()
   {
      System.out.println(EnumC.CC.index()); //4
   }


   public static void main(String[] args)
   {
       System.out.println(EnumC.valueOf("ccc")); //5
       System.out.println(EnumC.CCC.name()); //6
   }
}
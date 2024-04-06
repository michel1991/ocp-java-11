//In file VehicleType
//package objective1;
package enums.errors.constructorRules;

/**
 * This following code appears in a file named VehicleType.java. Why would it not compile?
   A. VehicleType's definition cannot be public.
     An top level enum definition can only be either public or default (i.e. no access modifier). A nested enum can have any access modifier.
    
   B. VehicleType's constructor cannot be public.
    An enum's constructor is private by default. You cannot apply public or protected  to the constructor. private is allowed but is redundant.
    
   C. package statement is invalid for VehicleType.
    An enum can be defined within a package.
    
   D. VehicleType must be defined as a class instead of enum since it is the only definition in the file.
    An enum can be defined individually in a file
    
    You need to know the following facts about enums:
    1. Enum constructor is always private.
   You cannot make it public or protected. If an enum type has no constructor declarations,
   then a private constructor that takes no parameters is automatically provided.
   
    2. An enum is implicitly final, which means you cannot extend it.
    3. You cannot extend an enum from another enum or class because an enum implicitly extends java.lang.Enum. But an enum can implement interfaces.
    4. Since enum maintains exactly one instance of its constants, you cannot clone it.
    You cannot even override the clone method in an enum because java.lang.Enum makes it final.
    5. Compiler provides an enum with two public static methods automatically - values() and valueOf(String).
    The values() method returns an array of its constants and valueOf() method tries to match the String argument
    exactly (i.e. case sensitive) with an enum constant and returns that constant if successful otherwise it throws java.lang.IllegalArgumentException.
    
    6. By default, an enum's toString() prints the enum name but you can override it to print anything you want.
    The following are a few more important facts about java.lang.Enum which you should know:
    1. It implements java.lang.Comparable (thus, an enum can be added to sorted collections such as SortedSet, TreeSet, and TreeMap).
    The natural order of the enum values is the order in which they are defined i.e. in the order of their ordinal value.
    2. It has a method ordinal(), which returns the index (starting with 0) of that constant i.e.
    the position of that constant in its enum declaration.
    3. It has a method name(), which returns the name of this enum constant, exactly as declared in its enum declaration.
    
    Correct(B)
   
 */
public enum VehicleType
    {

        SUV, SEDAN, VAN, SPORTSCAR;

        public VehicleType()
        {

        }

    }

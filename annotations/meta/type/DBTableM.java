import java.lang.annotation.*;

/**
 * Given:
 
  Identify correct usages of the above annotation.
  
  
 */

@Target(ElementType.TYPE)
@interface DBTable { // public
    public String value();
    public String[] primarykey();
    public String surrogateKey() default "id";
}

/**
      A. 
          @DBTable("person", primarykey={"name"})
            interface Person{
            }
            Must use value="person" because you are specifying values for more than one elements
*/

/**
 * B. 
 */
@DBTable(value="person", primarykey={"name"})
    interface Person{
}

/**
  C. 
  @DBTable("person", {"name"}, "pid")
    class Person{
    }
    Must use elementName=elementValue format for specifying element values because you are specifying values for more than one element.
 */

/**
 * D
 */

@DBTable(value="DAYS", primarykey="name")
enum DAYS{
    MON, TUE, WED, THU, FRI, SAT, SUN;
}// Since the target of @DBTable annotation is specified as ElementType.TYPE, this annotation can be used on a class, an interface, or an enum.

/**
   E.
   @DBTable("DAYS", {"name"})
    enum DAYS{
      MON, TUE, WED, THU, FRI, SAT, SUN;
    }
*/

/**
    There are two rules that you need to remember while specifying values for annotation elements:
    1. You can omit the element name while specifying a value only when the name of the element
    is value and only when you are specifying just one value. In other words, if you are specifying values
    for more than one elements, you need to use the elementName=elementValue format for each element. The order of the elements is not important.
    
    2. If an element expects an array, you can specify the values by enclosing them in { }.
    But if you want to specify an array of length 1, you may omit the { }.
    
    Correct(B, D)

*/
    
public class DBTableM {
    
}
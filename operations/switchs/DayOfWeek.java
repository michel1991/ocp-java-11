package operations.switchs;

import java.time.LocalDate;
import static java.time.DayOfWeek.*;

/**
   Given:
   What is the output?
  
  A.
    working
    off
    
  B.
    working
    
  C.  No output will be produced
  
  D.  compilation failure
  
  E. Exception will be thrown at run time.
  
  -----------------------------------------------------
  Although not related to the exam objectives, you need to know the following points about java.time.LocalDate and java.time.DayOfWeek:

    1. LocalDate.now() returns a LocalDate instance representing the current datetime.
    The with(DayOfWeek dow) method returns a new LocalDate instance with date adjusted
    to the given day of same week to which the original LocalDate belonged.
    
    For example, assuming that today is Friday, 19th Jun 2020:
    System.out.println(LocalDate.now().with(MONDAY)); //prints 2020-06-15
    System.out.println(LocalDate.now().with(SUNDAY)); //prints 2020-06-21
    
    2. LocalDate has an instance method named dayOfWeek(), which returns a DayOfWeek enum value representing the day of the week.
    The DayOfWeek enum has values from MONDAY to SUNDAY, where MONDAY's ordinal value is 1 and SUNDAY's ordinal value is 7.
    
    Now, based on above knowledge it is easy to see that the variable day is of type DayOfWeek enum.
    Since a switch is allowed to use enums as the switch variable, the usage of day in a switch is valid.
    
    When you use an enum as a switch variable, the case statements of the switch must correspond to the values of that enum.
    Therefore, the given switch/case statements are also valid. (Note that you cannot use the enum name in the case statement. i.e.
    case DayOfWeek.MONDAY would not compile.)
    
    The real trick in this question is as follows:
    Every case block in a switch statement must start with the case keyword.
    Therefore, there are only two case blocks in the given code - case MONDAY: and case SATURDAY:.
    The other confusingly placed labels i.e. TUESDAY: WEDNESDAY: THURSDAY: FRIDAY: and SUNDAY: are just labels.
    They do not define the case blocks. Remember that you can label any line of code.
    So, basically, you are just applying the labels TUESDAY, WEDNESDAY, THURSDAY, FRIDAY to the line System.out.println("working");,
    which belongs to the case block defined by case MONDAY:.
    
    Similarly, SUNDAY: is merely a label applied to the statement System.out.println("off");, which belongs to the case block defined by case SATURDAY:.
    
    It is now easy to say that if day is set to FRIDAY, the code will not produce any output
    because neither is there a case block defined for FRIDAY nor the default block in the given switch statement.
    
    Correct(C)

 */
 class TestClass {
    public static void main(String[] args){
        var day = LocalDate.now().with(FRIDAY).getDayOfWeek();

        switch(day){
            case MONDAY:
            TUESDAY:
            WEDNESDAY:
            THURSDAY:
            FRIDAY:
                System.out.println("working");
            case     SATURDAY:
            SUNDAY:
                System.out.println("off");
        }
    }
}
public class DayOfWeek {
    public static void main(String[] args){
        TestClass.main(args);
    }
}
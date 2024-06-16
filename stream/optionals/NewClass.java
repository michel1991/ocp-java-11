package stream.optionals;
import java.util.*;

import java.util.Optional;

/**
   What will the following code print?
   A.
    UNKNOWN
    PASS
    
  B.
    Optional[UNKNOWN]
    PASS
 C.
    Optional[UNKNOWN]
    Optional[PASS]
 D.
    FAIL
    PASS
    
 E.
    Optional[FAIL]
    OPTIONAL[PASS]
   
 -------
 You should go through the following article about java.util.Optional: http://www.oracle.com/technetwork/articles/java/java8-optional-2175753.html

    Here are a few important things you need to know about Optional class:
    1. Optional has a static method named of(T t) that returns an Optional object containing the value passed as argument.
    It will throw NullPointerException if you pass null.
    If you want to avoid NullPointerException, you should use Optional.ofNullable(T t) method. This will return Optional.empty if you pass null.
    
    2. You cannot change the contents of Optional object after creation.
    Optional does not have a set method.
    Therefore, grade.of, although technically correct, will not actually change the Optional object referred to by grade.
    It will return a new Optional object containing the passed argument.
    
    3. The orElse method returns the actual object contained inside the Optional or the argument passed to this method if the Optional is empty.
    It does not return an Optional object. Therefore, print(grade1.orElse("UNKNOWN")) will print UNKNOWN and not Optional[UNKNOWN].
    
    4. isPresent() returns true if the Optional contains a value, false otherwise.
    
    5. ifPresent(Consumer ) executes the Consumer object with the value if the Optional contains a value.
    Not that it is the value contained in the Optional that is passed to the Consumer and not the Optional itself.
    Correct(A)

 */
public class NewClass {
    public static Optional<String> getGrade(int marks){
        Optional<String> grade = Optional.empty();
        if(marks>50){
            grade = Optional.of("PASS");
        }
        else {
            grade.of("FAIL");
        }
        return grade;
    }
    public static void main(String[] args) {
        Optional<String> grade1 = getGrade(50);
        Optional<String> grade2 = getGrade(55);
        System.out.println(grade1.orElse("UNKNOWN"));
        if(grade2.isPresent()){
            grade2.ifPresent(x->System.out.println(x));
        }else{
            System.out.println(grade2.orElse("Empty"));
        }
    }
}
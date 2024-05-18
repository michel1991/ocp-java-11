package annotations.repeatable;
import java.lang.annotation.*;

/**
  Which of the following are correct definitions of a repeatable annotation?
  A.
    public @interface Meal{
        String value();
    }
    ------
    For an annotation to be repeatable it must be defined with @Repeatable meta-annotation.
    @Repeatable requires the name of the container annotation class. It cannot be empty. For example, @Repeatable(Meals.class)
    
  B.
      @Repeatable(Meals.class)
    public @interface Meal {
        int id() default 0;
    }
    public @interface Meals{
        Meal[] meals();
    }
    --------------------
    The name of the Meal[] array should be value, not meals.

  C.
      public @interface Meals{
       Meal[] value();
        String course() default "maincourse";
       }
        @Repeatable(Meals.class)
        public @interface Meal{
            int id() default 0;
            String name();
        }
     -----------------------------
    The value of the @Repeatable meta-annotation, in parentheses, is the type of the container
    annotation that the Java compiler generates to store repeating annotations.
    
    Containing annotation type must have a value element with an array type.
    The component type of the array type must be the repeatable annotation type.
    
    It is possibe to use other elements in the container annotation but they must have default values.
    
  D.
      public @interface Meals{
       Meal[] value();
        String course();
       }
       
        @Repeatable(Meals.class)
        public @interface Meal{
            int id() default 0;
            String value();
        }
        It is possibe to use other elements in the container annotation but they must have default values.
        So, String course(); should be changed to something like String course() default "maincourse";
        
        The reason for this restriction is simple.
        Java allows you to use the contained annotation and omit the container annotation.
        But internally, the container does create the container annotation and if there is no default
        value for any element of the container annotation, the compiler will not be able to supply its value.

    --------------------------------------------------------------------------------------
       To make it easy to repeat annotations, Java does not require you to use the container annotation.
       You can just write @Meal(name="sandwich") but, internally, Java converts it to @Meals(@Meal(name="sandwich")).
        If you apply two such annotations, for example:
        @Meal(name="sandwich")
        @Meal(name="fries")
        
        the compiler will convert them to: @Meals({@Meal(name="sandwich"), @Meal(name="fries") })
        
        A container annotation is also an annotation and just like any other annotation, it can be used independently.
        It can have other elements as well. For example, you can use the @Meals annotation like this:
        
        @Meals(value={@Meal(name="sandwich"), @Meal(name="fries") }, course="starter")
        
        Remember that values of a repeated annotations are not additive.
        So, for example, you cannot expect @Meal(id=1) and @Meal(name="fries") to combine automatically to @Meal(id=1, name="fries").
        Since id is defined using a default value but name is not, @Meal(name="fries") is valid but @Meal(id=1) is not valid
      Correct(C)
 */
@interface Meals{ // public 
    Meal[] value();
    String course() default "maincourse";
}
@Repeatable(Meals.class)
public @interface Meal{
    int id() default 0;
    String name();
}
package constructorsInAbstractClasses;

abstract class Bear{
   abstract CharSequence chew();

   public Bear(){
    System.out.println(chew()); // does this compile

   }

}

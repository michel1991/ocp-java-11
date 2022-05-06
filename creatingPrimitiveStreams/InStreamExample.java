package creatingPrimitiveStreams;
import java.util.stream.*;

class InStreamExample{
  static void countFromOneToFiveLongVersion(){
       IntStream count = IntStream.iterate(1, n -> n + 1)
                                  .limit(5)
       ;

      count.forEach(System.out::println);
   }

 static void countFromOneToFiveShortVersionExcludeSecondParameterOfRange(){ 
    IntStream range = IntStream.range(1, 6);
    range.forEach(System.out::println);
  }
  
 static void countFromOneToFiveShortVersionIncludeSecondParameterOfRange(){
    IntStream range = IntStream.rangeClosed(1, 5);
    range.forEach(System.out::println);
  }


 public static void main(String[] args){
     System.out.println("count from one to five long version ");
     countFromOneToFiveLongVersion();
     System.out.println();

    System.out.println("count from one to five short version range 1 - 6 stop before 6 so exclude 6");
     countFromOneToFiveShortVersionExcludeSecondParameterOfRange();
     System.out.println();

   
     System.out.println("count from one to five short version rane 1 - 5 include 5  ");   
     countFromOneToFiveShortVersionIncludeSecondParameterOfRange();
     System.out.println();
 }

}

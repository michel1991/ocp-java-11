package puttingTogetherThePipeline;
import java.util.*;
import java.util.stream.*;

class FirstTwoNamesOfOurFriends{

   public void wayWeUseHow(){
       var list = List.of("Toby", "Anna", "Leroy", "Alex");
       List<String> filtered = new ArrayList<>();
       for (String name : list)
	        if(name.length() == 4)
			filtered.add(name);
       Collections.sort(filtered);
       var iter = filtered.iterator();
       if(iter.hasNext())
	       System.out.println(iter.next());
        if(iter.hasNext())
		System.out.println(iter.next());
   }	

  public static void main(String[] args){
     var list = List.of("Toby", "Anna", "Leroy", "Alex");
     list.stream()
         .filter( n -> n.length() == 4)
         .sorted()
         .limit(2)
         .forEach(System.out::println)
    ;
  }
}

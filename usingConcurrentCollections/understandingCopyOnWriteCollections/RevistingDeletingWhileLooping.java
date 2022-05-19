package usingConcurrentCollections.understandingCopyOnWriteCollections;
import java.util.*;
import java.util.concurrent.*;

class RevistingDeletingWhileLooping{

  static void deleteWithEnhanceLoopUsingCopyOnWriteArray(){
   List<String> birds = new CopyOnWriteArrayList<>();
   birds.add("hawk");
   birds.add("hawk");
   birds.add("hawk");
                  
     for (String bird : birds){
         birds.remove(bird);
      }
     System.out.println();
     System.out.println("Size with enhance loop: " + birds.size());

  }


  static void deleteWithIteratorOfArrayList(){
   List<String> birds = new ArrayList<>();
   birds.add("hawk");
   birds.add("hawk");
   birds.add("hawk");
   var iterator = birds.iterator();
     while (iterator.hasNext()) {
         iterator.next();
         iterator.remove();
      }
     System.out.println();
     System.out.println("Size with iterator: " + birds.size());

  }


  public static void main(String[] args){
     deleteWithEnhanceLoopUsingCopyOnWriteArray();
     deleteWithIteratorOfArrayList();
  }
}

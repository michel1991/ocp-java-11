package usingConcurrentCollections.understandingCopyOnWriteCollections;
import java.util.*;
import java.util.concurrent.*;

class CopyNumber{
  public static void main(String[] args){
     List<Integer> favNumbers = new CopyOnWriteArrayList<> (List.of(4, 3, 42));
     for (var n : favNumbers){
         System.out.print(n + " ");
         favNumbers.add(9);
      }
     System.out.println();
     System.out.println("Size: " + favNumbers.size());
      
  }
}

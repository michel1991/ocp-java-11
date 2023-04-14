package usingConcurrentCollections.understandingCopyOnWriteCollections;
import java.util.*;
import java.util.concurrent.*;

class ExampleCopyOnWriteArraySet{
  public static void main(String[] args){
     Set<Character> favLetters = new CopyOnWriteArraySet<> (List.of('a', 't'));
     for (char c : favLetters){
         System.out.print(c + " ");
         favLetters.add('s');
      }
     System.out.println();
     System.out.println("Size: " + favLetters.size());
  }
}

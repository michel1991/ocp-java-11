package workingWithAdvancedStreamPipelineConcepts.linkingStreamsToTheUnderlyingData;
import java.util.stream.*;
import java.util.*;

class LinkingStreamsToTheUnderlyingData{

    /**
    * N'oubliez pas que les flux sont évalués paresseusement.
    * Cela signifie que le flux n'est pas réellement créé à la ligne 28. Un objet est créé qui sait où rechercher les données lorsque cela est nécessaire.
     */
  static void basicExample(){
     var cats = new ArrayList<String>();
     cats.add("Annie");
     cats.add("Ripley");
     var stream = cats.stream(); // ligne 28
     cats.add("KC");
     System.out.println("count " + stream.count());
  }

  public static void main(String[] args){
    basicExample();
    
  }
}

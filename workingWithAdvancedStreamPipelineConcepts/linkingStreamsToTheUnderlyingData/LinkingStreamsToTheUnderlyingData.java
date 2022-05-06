package workingWithAdvancedStreamPipelineConcepts.linkingStreamsToTheUnderlyingData;
import java.util.stream.*;
import java.util.*;

class LinkingStreamsToTheUnderlyingData{

  static void basicExample(){
     var cats = new ArrayList<String>();
     cats.add("Annie");
     cats.add("Ripley");
     var stream = cats.stream();
     cats.add("KC");
     System.out.println("count " + stream.count());
  }

  public static void main(String[] args){
    basicExample();
    
  }
}

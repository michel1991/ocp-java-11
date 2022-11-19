package list;
import java.util.*;


/**
*   Which of the following can fill in the blank to make a defensive copy of weights? (Choose all that apply.)
*  A. weights
*  B.  new ArrayList<>(weights)
*  C. weights.clone()
*  D. (ArrayList) weights.clone()
*  E. weights.copy()
*  F. (ArrayList) weights.copy()
*
* Option A is incorrect because it does not make a copy. Options E and F are incorrect because ArrayList does not have a copy() method.
* Option C is incorrect because the clone() method returns an Object and needs to be cast, so that option does not compile.
* Options B and D are correct because they copy the ArrayList using the copy constructor and clone() method, respectively.
 */
class Turkey {
    private ArrayList<Double> weights;
    public Turkey(ArrayList<Double> weights) {
        this.weights =  (ArrayList) weights.clone() ; // or  (ArrayList) weights.clone() || new ArrayList<>(weights)
    }

    public List<Double> getWeights(){
        return weights;
    }
}

public class DefensiveCopy {
  public static void main(String... args){
      List<Double> doubleList = List.of(5.0, 2.8);
      //List<Double> doubleList = new ArrayList<Double>();
      Turkey turkey = new Turkey(new ArrayList<Double>(doubleList));
      System.out.println(turkey.getWeights());
  }
}
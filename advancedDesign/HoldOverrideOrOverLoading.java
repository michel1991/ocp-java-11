
package advancedDesign;

/**
* Question: Given the following class definition, which method declaration could appear in a subclass of Otter? (Choose all that apply.)
* A. protected void eatFish(int count){}
* B. protected void eatFish(){}
* C. protected int eatFish(int count){}
* D. void eatFish(int fishCount){}
* E. public void eatFish(int numberOfFish){}
*
* Option A is correct because it is a straight override with the same access modifier.
* Option B is an overload, not an override, but that means it can still appear in a subclass of Otter.
* Since the abstract method isn’t implemented, a concrete subclass with this overload must be abstract as well.
* Option C is incorrect because the return type has changed; void and int are not covariant return types.
* Option D can be eliminated because the assumed default access modifier is more restrictive than the inherited protected modifier.
* Finally, option E is acceptable because the public modifier is less restrictive than the inherited protected modifier, so it is allowed for an override.
 */
abstract class Otter {
     protected abstract void eatFish(int count);
}

class childOfOtter extends Otter{
    protected void eatFish(int count){

    }

    protected void eatFish(){

    }
}

public class HoldOverrideOrOverLoading {
   public static void main(String... args){

   }
}
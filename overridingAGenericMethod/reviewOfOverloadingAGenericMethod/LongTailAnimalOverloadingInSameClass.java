package overridingAGenericMethod.reviewOfOverloadingAGenericMethod;
import java.util.*;
public class LongTailAnimalOverloadingInSameClass {
    protected void chew(List<Object> input){
    }
    
    protected void chew(List<Double> input){} // does not compile
}
package genericReturnTypes;
import java.util.*;

public class Mammal{
    public List<CharSequence> play(){
     return new ArrayList<CharSequence>();
    }

    public CharSequence sleep(){
       return "Mammal";
    }

}

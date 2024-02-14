package collections.lists.tricky;
import java.util.*;
import java.io.*;

public class UnmodifiableList {
    static void supportedNull(){
        List<String> families = new ArrayList<>();
        families.add(null);
        families.add("mvouma");
        Collections.unmodifiableList(families);
        System.out.println(families);
    }
    
    static void unmodifiableXXXMethodReturnViewThatImpactCopyIfWeAddItem(){
        List<String> names = new ArrayList<>(List.of("mvouma", "michel"));
        List<String> copyNames = Collections.unmodifiableList(names);
        names.add("stephane");
        System.out.println(copyNames);
    }
    public static void main(String... args){
        unmodifiableXXXMethodReturnViewThatImpactCopyIfWeAddItem();
        PrintStream ps = System.out;
        ps.println();
        supportedNull();
        
        
    }
}
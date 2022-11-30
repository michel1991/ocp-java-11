package annotations.errors;
import java.lang.annotation.*;



/**
*  Which annotations, when applied independently, allow the following program to compile?
    * A. @Cable
    B. @Cable(value=Technology.USB)
    C. @Cable(value={Technology.USB})
    D. @Cable(Technology.USB)
    E. @Cable({Technology.USB})

   An annotation element type must be one of the predefined immutable types: a primitive, String, Class, enum, another annotation, or an array of these types.
   Since Technology is an interface, the declaration of Cable does not compile regardless of what is placed in the blank, making option F correct.
   If Technology were re-implemented as an enum, then options B, C, D, and E would be correct.
   Option A would still not be correct, as value() is required.
Note that option C uses the long form of the annotation, with the others using various short-hand notations.
 */

interface Technology {
    int USB = 1, THUNDERBOLT = 2;
}

@Retention(RetentionPolicy.CLASS)
@interface Cable {
    boolean grounded = true;
    Technology[] value();
}


class PurchaseItem {  // _________________

}

public class CableUseInterfaceThatIsNotAnnotation {


}
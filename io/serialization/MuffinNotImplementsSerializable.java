package io.serialization;
import java.io.*;
/**
   Let’s say you want to serialize the following class,
    but only want the flour quantity saved. What changes,
    if any, are required to the following class for this to occur?

    A. No changes are required.
    B. Mark eggs and sugarastransient.
    C. Remove the serialPersistentFields variable.
    D. Remove the final modifier from the serialPersistentFields variable.
    E. Add a missing modifier to the serialPersistentFields variable.
    F. None of the above.

    The class is not marked Serializable,
    meaning none of the changes will work and making option F correct.
    If it was corrected to implement Serializable,
    then it would serialize all of the fields, not just flour as written.
    This is because serialPersistentFields is declared without the static modifier.Alternatively,
    all of the other fields besides flour could be marked transient to achieve the desired result.
 */
 class Muffin {
    private Double flour;
    private Integer eggs;
    private Float sugar;
    private final ObjectStreamField[] serialPersistentFields =
{ new ObjectStreamField("flour", Double.class) };
}
public class MuffinNotImplementsSerializable {

}
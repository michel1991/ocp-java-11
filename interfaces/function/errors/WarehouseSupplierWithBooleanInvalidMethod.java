package interfaces.function.errors;
import java.util.function.*;

/**
 *  What is the output of the following application?
    A. Plenty!
    B. On Backorder!
    C. The code does not compile because of the checkInventory() method.
    D. The code does not compile for a different reason.
    
    The primitive Supplier functional interfaces, such as BooleanSupplier and LongSupplier,
    do not have a get() method.
    Instead, they have methods such as getAsBoolean() and getAsLong(), respectively.
    For this reason, the first line of the checkInventory() method does not compile,
    making option C the correct answer. If the method call was changed to getAsBoolean(),
    then the rest of the code would compile without issue,
    print Plenty! at runtime, and option A would be the correct answer.
 */
class Warehouse {
  private int quantity = 40;
  private final BooleanSupplier stock;
  {
    stock = () -> quantity >0;
  }
  public void checkInventory() {
    if(stock.get())
      System.out.print("Plenty!");
    else {
      System.out.print("On Backorder!");
    }
  }
  public static void main(String... widget) {
    final Warehouse w13 = new Warehouse();
    w13.checkInventory();
  }
}



public class WarehouseSupplierWithBooleanInvalidMethod {
  
}
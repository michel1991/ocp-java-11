/*
   * Immediately after line 8, only Grasshopper g1, created on line 6, is eligible for garbage collection since both one and two point to Grasshopper g2,
   * making option C correct and option A incorrect. Immediately after line 9, we still only have Grasshopper g1 eligible for garbage collection,
   * since one points to it. For this reason, option B is incorrect and option D is correct. Reference two now points to null.
   * Immediately after line 10, both Grasshopper objects are eligible for garbage collection since both one and two point to null,
   * making option E incorrect. The code does compile, so option F is incorrect. Although it is traditional to declare instance variables early
   * in the class, you don’t have to. For more information, see Chapter 2.
   *
 */
package advancedDesign;
public class GrasshopperGarbageCollector {
    public GrasshopperGarbageCollector(String n) {
         name = n;
    }

    public static void main(String[] args) {
        GrasshopperGarbageCollector one = new GrasshopperGarbageCollector("g1");
        GrasshopperGarbageCollector two = new GrasshopperGarbageCollector("g2");
        one = two;
        two = null;
        one = null;
        System.out.println("End eligible for garbage Collector");
    }
    private String name;
}
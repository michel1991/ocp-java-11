package security.guidelines;
/**
 * Given:
   Which actions implement Java SE security guidelines?
   
    A. Change getVertices to _getVertices.
    B. Make get and set Vertices methods synchronized.
    C. Make the vertices field volatile.
    
    D. Change getVertices to return vertices.clone().
      Mutability should be avoided as much as possible.
      When you return a reference to an array, other code may modify the contents of that array. To prevent this, return a clone.
      Guideline 6-1 / MUTABLE-1: Prefer immutability for value types
      
   E. Change setVertices to this.vertices = vertices.clone();.
       Since the calling code has a reference to the passed array,
       it can change the elements. To prevent this from happening, always clone input arrays (and collections).
       Guideline 6-3 / MUTABLE-3: Create safe copies of mutable and subclassable input values
       
   F. Make vertices field private.
     As per Guideline 0-6 / FUNDAMENTALS-6: Encapsulate - Fields should be private to prevent unnecessary access by other classes.
     
   G. Make vertices field private and final.
    As per Guideline 6-1 / MUTABLE-1: Prefer immutability for value types, immutable classes should make fields final.
   However, here, since the class is not final, it doesn't seem to be an immutable class.
   Therefore, making the field final is not requried

   Correct(D, E, F)


 */

class Point{
    
}
public class Shape {

    Point[] vertices;

    public Shape(Point[] verts){  this.vertices = verts; }

    public Point[] getVertices(){ return vertices; }   

    public void setVertices(Point[] vertices){ this.vertices = vertices; }
}
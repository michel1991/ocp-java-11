package declaringConstructors.callingOverloadedConstructorsWithThis.errors;
public class Gopher{
   public Gopher(){
       this(5); // does not compile
   }

  public Gopher(int dugHoles){
    this(); // does not compile
  }

}

package advancedDesign; 
class Rodent {
    public Rodent(var x) {}
    protected static Integer chew() throws Exception {
         System.out.println("Rodent is chewing");
        return 1;
        }
    }
 class Beaver extends Rodent {
     Number chew() throws RuntimeException {
        System.out.println("Beaver is chewing on wood");
        return 2;
        }
}

public interface ErrorDeclareExplicitConstructorRemoveImplicit {
  public static void main(String... args){

  }
}
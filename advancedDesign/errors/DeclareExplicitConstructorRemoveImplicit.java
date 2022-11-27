package advancedDesign.errors;
/**
* The code doesn’t compile, so option A is incorrect.
* The first compilation error is on line 2, as var cannot be used as a constructor argument type.
* The second compilation error is on line 8. Since Rodent declares at least one constructor and it
* is not a no-argument constructor, Beaver must declare a constructor with an explicit call to a super() constructor.
* Line 9 contains two compilation errors. First, the return types are not covariant since Number is a supertype,
*  not a subtype, of Integer. Second, the inherited method is static, but the overridden method is not,
* making this an invalid override. The code contains four compilation errors, although they are limited to three lines, making option D the correct answer.
 */
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

public interface DeclareExplicitConstructorRemoveImplicit {
  public static void main(String... args){

  }
}
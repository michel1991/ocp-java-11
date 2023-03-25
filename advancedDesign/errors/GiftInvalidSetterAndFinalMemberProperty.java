package advancedDesign.errors;
/**
  What is a possible output of the following application?
    A. Your gift: wrap.Gift@29ca2745
    B. Your gift: Your gift:
    C. It does not compile.
    D. It compiles but throws an exception at runtime.

    The code contains a compilation error in regard to the contents instance variable.
    The contents instance variable is marked final, but there is a setContents() instance
    method that can change the value of the variable. Since these two are incompatible,
     the code does not compile, and option C is correct.
     If the final modifier were removed from the contents variable declaration,
     then the expected output would be of the form shown in option A.
 */
class Gift {
    private final Object contents;
    protected Object getContents() {
        return contents;
    }
    protected void setContents(Object contents) {
       this.contents = contents;
    }
    public void showPresent() {
        System.out.print("Your gift: "+contents);
    }
    public static void main(String[] treats) {
        Gift gift = new Gift();
        gift.setContents(gift);
        gift.showPresent();
    }
}

public class GiftInvalidSetterAndFinalMemberProperty {

}
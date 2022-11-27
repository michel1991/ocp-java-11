package advancedDesign.errors;

/*
*  Popcorn is an inner class. Inner classes are only allowed to contain static variables that are marked final.
* Since there are no other compilation errors, option C is the only correct answer.
* If the final modifier was added on line 6, then the code would print 10 at runtime.
* Note that private constructors can be used by any methods within the same class.
*/
class InnerMemberClassDoesNotHoldStaticField {
    private int butter = 5;
    private InnerMemberClassDoesNotHoldStaticField() {}
    protected class Popcorn {
        private Popcorn() {}
    public  static int butter = 10;
        public void startMovie() {
            System.out.println(butter);

        }
    }
    public static void main(String[] args) {
        var movie = new InnerMemberClassDoesNotHoldStaticField();
        InnerMemberClassDoesNotHoldStaticField.Popcorn in = new InnerMemberClassDoesNotHoldStaticField().new Popcorn();
        in.startMovie();
    }
}

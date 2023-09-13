package inheritance.errors.finalNotAllow;

final class Cook {
    static class Vegetable {
        float vitamins() { return 8f; }
    }
    final class Carrot extends Vegetable {
        final float vitamins() { return 4; }
    }

}


public class InheritanceWithFinalUsingAnonymousClass {
    public final static void main(String[] unused) {
        final Cook.Carrot c = new Cook().new Carrot() {};
        System.out.println(c.vitamins());
    }
}
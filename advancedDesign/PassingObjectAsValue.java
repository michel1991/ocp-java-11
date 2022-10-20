package advancedDesign;

class Toy{
    private boolean containsIce = false;
    public boolean containsIce() {
        return containsIce;
    }
    public void removeIce() {
        this.containsIce = true;
    }
}

class Otter {
     static void play(Toy toy) {
        toy = new Toy();
        toy.removeIce();
    }

}

public class PassingObjectAsValue {
    public static void main(String[] args) {
        Toy toy = new Toy();
        Otter.play(toy);
        System.out.println(toy.containsIce());
    }
}
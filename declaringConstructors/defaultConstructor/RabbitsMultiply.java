package declaringConstructors.defaultConstructor;

public class RabbitsMultiply{
    public static void main(String[] args){
        Rabbit r1 = new Rabbit();
        Rabbit2 r2 = new Rabbit2();
        Rabbit3 r3 = new Rabbit3(true);
        Rabbit3 r4 = new Rabbit4(); // does not compile
    }
}
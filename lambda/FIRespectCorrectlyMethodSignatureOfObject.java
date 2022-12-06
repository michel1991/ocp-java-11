package lambda;
/*
 Which of the following are valid functional interfaces? (Choose all that apply.)
    A. Whistle
    B. Bark
    C. Meow
    D. Howl
    E. Woof
    F. None of the above are valid functional interfaces.

    The requirement for a functional interface is that it contains a single abstract method, excluding any that match the signature
    of public methods in java.lang.Object. Meow is a valid functional interface, as is Whistle that extends it,
    because the only abstract method that counts is meow(). The hashCode() and toString(), while abstract, match the
    signature of methods in Object, while purr() is a default method. For these reasons, options A and C are correct.
    Options B and D are incorrect because they do not contain any abstract methods.
    Option E is incorrect because it contains two abstract methods. If the equals() method took Object instead of Woof,
     then it would match the signature of the equals() method, and Object and Woof would be a functional interface.
    */
public class FIRespectCorrectlyMethodSignatureOfObject {
    public interface Whistle extends Meow {
        public abstract int hashCode();
    }
    public interface Bark {
        public static int bark() { return 10; }
    }
    public interface Meow {
        abstract String toString();
        public int meow();
        public default void purr() {}
    }
    public interface Howl {}
    public interface Woof extends Bark {
        abstract Long wolf();
        public abstract boolean equals(Woof w);
    }
}
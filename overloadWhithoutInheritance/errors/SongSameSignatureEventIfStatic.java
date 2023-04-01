package overloadWhithoutInheritance.errors;

/**
 * What is the output of the following application?
    A. Play!
    B. Music!
    C. The code does not compile.
    D. The code compiles, but the answer cannot be determined until runtime.
    
    A class cannot contain two methods with the same method signature,
    even if one is static and the other is not. Therefore,
    the code does not compile because the two declarations of playMusic()
    conflict with one another, making option C the correct answer.
 */
 class Song {
    public void playMusic() {
        System.out.print("Play!");
    }
    private static void playMusic() {
        System.out.print("Music!");
    }
    private static void playMusic(String song) {
        System.out.print(song);
    }
    public static void main(String[] tracks) {
        new Song().playMusic();
    }
}


public class SongSameSignatureEventIfStatic {
  
}
package inheritance.withGenerics.override;
import java.util.*;

/**
 Given:

    class Game{ }
    class Cricket extends Game{ }
    class Instrument{ }
    class Guitar extends Instrument{ }
    
    interface Player<E>{ void play(E e); }
    interface GamePlayer<E extends Game> extends Player<E>{ }
    interface MusicPlayer<E extends Instrument> extends Player{ }
    
    Identify valid declarations.
    
    A.
      class Batsman implements GamePlayer<Cricket>{
            public void play(Game o){ }
        }
       ----------------
       Observe the declaration of GamePlayer.
       It stipulates that it be typed with a class that extends Game (named temporarily as E) and that Player be typed to the exact same type E.
        Here, GamePlayer is typed to Cricket. Thus, Player is also typed to Cricket.
       Therefore,  public void play(Game o){ } does not satisfy Player interface
       (because Player now requires a method  public void play(Cricket o){ } ).
       
    B.
      class Bowler implements GamePlayer<Guitar>{
            public void play(Guitar o){ }
        }
    ------------
        GamePlayer declaration stipulates that it be typed to a class that extends Game. Guitar does not extend Game.
       
    C.
       class Bowler implements Player<Guitar>{
            public void play(Guitar o){ }
        }
       ----------------------
        This is valid because Player has no restriction on what it can be typed to.
        It is only restriction is that the play() method must also use the same type. So play(Instrument ) will not be valid here.

    D.
       class MidiPlayer implements MusicPlayer {
            public void play(Guitar g){ }
        }
        ----------------------------
        Observe that MusicPlayer extends plain untyped Player.
        This means, MusicPlayer interface gets the abstract method play(Object obj) from Player.
        Thus, any non-abstract class that implements MusicPlayer must have play(Object ) method.
        Thus, MidiPlayer must have a method play(Object ).
        
        If MusicPlayer were defined like this: interface MusicPlayer extends Player<Instrument>{ },
        then it would have been a typed usage of Player (typed to Instrument) and then
        it would have been ok for any MusicPlayer to implement play(Instrument ).

    E.
        class MidiPlayer implements MusicPlayer<Instrument> {
        public void play(Guitar g){ }
    }
      -------------
      MidiPlayer must have a method play(Object ).

    
    --------------------
      Correct(C)
 */

class Game{ }
class Cricket extends Game{ }
class Instrument{ }
class Guitar extends Instrument{ }

interface Player<E>{ void play(E e); }
interface GamePlayer<E extends Game> extends Player<E>{ }
interface MusicPlayer<E extends Instrument> extends Player{ }

class Bowler implements Player<Guitar>{
    public void play(Guitar o){ }
}
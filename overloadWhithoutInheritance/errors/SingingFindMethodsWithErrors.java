package overloadWhithoutInheritance.errors;
/**
  How many of these methods compile?
    A. Zero
    B. One
    C. Two
    D. Three
    E. Four
    F. Five
    
    To a call an instance method, you can use the this prefix.
    The class name is not included, ruling out the last three methods.
    A method may contain at most one varargs parameter,
    and it must appear as the last argument in the list.
    For this reason, the sing_do() method is the only method using varargs that compiles.
    The sing() method also compiles without using varargs.
    Therefore, option C is the answer.
 */
 class Singing {
    private void sing(String key) { }
    public void sing_do(String key, String... harmonies) {
        this.sing(key);
    }
    public void sing_re(int note, String... sound, String key) {
        this.sing(key);
    }
    public void sing_me(String... keys, String... pitches) {
        this.sing(key);
    }
    public void sing_far(String key, String... harmonies) {
        this.Singing.sing(key);
    }
    public void sing_so(int note, String... sound, 
                        String key) {
        this.Singing.sing(key);
    }
    public void sing_la(String... keys, String... pitches) {
        this.Singing.sing(key);
    }
}

public class SingingFindMethodsWithErrors {
    
}
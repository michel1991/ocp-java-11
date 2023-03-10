package security;

/**
 * Given the following two classes, what change to the StealSecret class would allow it to read and email the password to a hacker?
    A. There are no changes, as the Secret class is secure.
    B. Override the mySecret variable.
    C. Override the setSecret() method.
    D. Override the printSecret() method.
    E. Override the saveToDisk() method.
    F. Add a constructor.

    Option C is the correct answer.
    A hacker could override the setSecret() method to first steal the inputted secret value
    and email it herself and then pass the data along to the parent by calling super.setSecret()
    without anyone noticing any difference.
    One fix would be to mark this method final in the Secret class or make the Secret class final.
    Option B is incorrect because variables can only be hidden,
    not overridden, so declaring a new mySecret variable would not grant access to the parent variable.
    Option D is incorrect as overriding this method won’t allow the attacker to access the mySecret variable directly.
    Option E is trivially incorrect, as private methods cannot be overridden.
    Finally, option F is incorrect as adding a constructor does not grant access to private members in the parent class.
 */
class Secret {
    private String mySecret;
    public void setSecret(String secret) {
        mySecret = secret;
    }
    public void printSecret() {
        throw new UnsupportedOperationException("Nope!");
    }
    private void saveToDisk() {
        // IMPLEMENTATION OMITTED
    }
}

public class StealSecret extends Secret {
    // DO BAD STUFF
}

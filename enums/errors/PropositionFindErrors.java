package enums.errors;

/**
   Given the following enum declaration, how many lines contain compilation errors?
    A. Zero
    B. One
    C. Two
    D. Three
    E. More than three

    The code does not compile. First, the enum list is not terminated with a semicolon (;),
    which is required when an enum includes anything beyond just the list of values.
    Second, the access modifier of TRUE’s implementation of getNickName() is package-private,
     but the abstract method signature has a protected modifier.
     Since package-private is a more restrictive access than protected, the override is invalid,
     and the code does not compile. For these two reasons, option C is the correct answer.
     Note that the value variable is not final
     nor properly encapsulated and can therefore be modified by callers outside the enum.
     This is permitted but considered a poor practice.

 */
enum Proposition {
    TRUE(1) { String getNickName() { return "RIGHT"; }},
    FALSE(2) { public String getNickName() { return "WRONG"; }},
    UNKNOWN(3) { public String getNickName() { return "LOST"; }}
    public int value;
    Proposition(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }
    protected abstract String getNickName();
}

public class PropositionFindErrors {

}
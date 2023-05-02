package security.mixedConcept;

/**
   Assuming this class is passed a valid non-negative integer,
   which statements best describe the following class? (Choose two.)
   
   A. It is well encapsulated.
    B. It is susceptible to a denial of service attack.
    C. It creates an immutable object.
    D. It is susceptible to an inclusion attack.
    E. It is not thread-safe.
    F. It is susceptible to an exploit attack.
    
    The code is well encapsulated because all instance variables are private,
    making option A correct. It is susceptible to a denial of service attacksince
    there is no input validation. For example, if the maximum integer value of 2,147,483,647 is passed,
    then it will make a huge number of calls to the database,
    potentially tying up the system and blocking valid requests.
    For this reason, option B is correct.To fix this code,
    a limit on the inputted value should be used.
    Option E is incorrect because the class is thread-safe since the instance methods are all synchronized.
    The rest of the options do not apply to this class.
 */
public class Charity {
    private int numberRequests = 0;
    public synchronized int getNumberOfRequests() {
        return numberRequests;
    }

    private void callDatabaseToDonateADollar() {
        // IMPLEMENTATION OMITTED
    }

    public synchronized void donateDollar(int numDollars) {
        numberRequests++;
        for(int i=0; i <numDollars; i++) {
            callDatabaseToDonateADollar();
        }
    }

    public static void main(String[] args) {
        final var humanFund = new Charity();
        humanFund.donateDollar(Integer.valueOf(args[0]));
        System.out.print(humanFund.getNumberOfRequests());
    } 
}
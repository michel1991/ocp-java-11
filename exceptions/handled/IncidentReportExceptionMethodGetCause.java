package exceptions.handled;

import java.io.IOException;

/**
  What is the output of the following?

    A. com.tps.IncidentReportException
    B. java.lang.IOException
    C. The code does not compile because IOException is a checked exception.
    D. The code does not compile due to the declaration of IncidentReportException.
    E. None of the above.

    The code does compile, making options C and D incorrect.
    The catch block successfully catches the IncidentReportException
    and prints the IOException passed to its constructor, making option B the correct answer.
 */
class IncidentReportException extends RuntimeException {
    public IncidentReportException(Exception e) {
        super(e);
    }
    public static void main(String[] args) throws Exception {
        try {
            throw new IncidentReportException(new IOException());
        } catch (RuntimeException e) {
            System.out.println(e.getCause());
        }
    }
}

public class IncidentReportExceptionMethodGetCause {
    public static void main(String[] args) throws Exception {
        IncidentReportException.main(args);
    }
}
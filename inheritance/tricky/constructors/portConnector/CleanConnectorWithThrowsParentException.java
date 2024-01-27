package inheritance.tricky.constructors.portConnector;
import java.io.*;

public class CleanConnectorWithThrowsParentException extends PortConnector{
    /**
     * wrong require throws parent exception or super parent exception
     * this rule is not valid for inheritance of method
     */
    public CleanConnectorWithThrowsParentException() throws Exception {
        super(3);
    }
}